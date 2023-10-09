import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        // 작업 배열을 시작 시간을 기준으로 정렬합니다.
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        // 우선순위 큐를 사용하여 작업을 관리합니다.
        // 작업의 소요 시간을 기준으로 오름차순으로 정렬됩니다.
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        int index = 0; // 작업 배열의 인덱스를 추적합니다.
        int count = 0; // 완료된 작업의 수를 세기 위한 변수입니다.
        int total = 0; // 작업의 총 대기 시간을 저장합니다.
        int end = 0;   // 현재 작업이 종료된 시간을 나타냅니다.
        
        // 아직 모든 작업을 완료하지 않은 경우 계속 반복합니다.
        while(count < jobs.length) {
            
            // 현재 시간보다 이전에 요청된 작업을 큐에 추가합니다.
            while(index < jobs.length && jobs[index][0] <= end) {
                pq.add(jobs[index++]);
            }
            
            // 큐가 비어있으면 다음으로 수행할 작업이 없으므로
            // 다음 작업의 시작 시간으로 시간을 이동합니다.
            if(pq.isEmpty()) {
                end = jobs[index][0];
            } else {
                // 큐에서 소요 시간이 가장 적은 작업을 꺼내서 수행합니다.
                int[] cur = pq.poll();
                total += cur[1] + end - cur[0]; // 대기 시간과 작업 시간을 더합니다.
                end += cur[1]; // 작업이 종료된 시간을 업데이트합니다.
                count++; // 완료된 작업 수를 증가시킵니다.
            }
        }
        
        // 평균 대기 시간을 계산하고 반환합니다.
        return total / jobs.length;
    }
}