class Solution {
    public int solution(int[] stones, int k) { // [2, 4, 5, 3, 2, 1, 4, 2, 5, 1]
        int left = 1;
        int right = Integer.MAX_VALUE; // 최대 범위로 설정
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int zero = 0;
            boolean possible = true;

            for (int stone : stones) {
                if (stone < mid) {
                    zero++;
                    if (zero >= k) {
                        possible = false;
                        break;
                    }
                } else {
                    zero = 0;
                }
            }

            if (possible) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;

//         int answer = 0;
//         int count = 0;
//         int max = 0;
        
//         while(max == k) {
//             for(int i = 0; i < stones.length; i++) { // 먼저 돌에 0이 있는지 찾고 연속된지 확인.
//                 if(stones[i] == 0) {                // 배열에 0이 있으면 
//                     count++;                        // 카운트 증가
//                     max = Math.max(max, count);     // 배열내의 연속한 0 최대값 찾기 위함.
//                 } else {
//                     count = 0;                      // 연속끝나면 0
//                 }
//                 stones[i]--;
//             }
//             answer++;
//         }
 
//         return answer;
    }
}