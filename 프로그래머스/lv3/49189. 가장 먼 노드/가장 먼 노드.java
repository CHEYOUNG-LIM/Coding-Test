import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 그래프 생성
        for (int[] e : edge) {
            int a = e[0];
            int b = e[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int[] dist = new int[n + 1]; // 각 노드로부터의 거리 저장
        Arrays.fill(dist, -1); // 초기값을 -1로 설정
        dist[1] = 0; // 시작 노드의 거리

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int ne : graph.get(node)) {
                if (dist[ne] == -1) {
                    dist[ne] = dist[node] + 1;
                    q.offer(ne);
                }
            }
        }

        // 최대 거리 연산
        int maxDist = Arrays.stream(dist).max().getAsInt();

        // 최대 거리 노드 개수 연산
        int answer = 0;
        for (int distance : dist) {
            if (distance == maxDist) {
                answer++;
            }
        }
        return answer;
    }
}