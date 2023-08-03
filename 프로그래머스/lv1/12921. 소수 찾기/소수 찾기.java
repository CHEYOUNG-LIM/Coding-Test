// class Solution {
//     public int solution(int n) {
//         int answer = 0;
        
//         for(int i = 2 ; i <= n ; i++) {            // i = 2
//             int a = 0;
//             for(int j = 1 ; j <= i ; j++) {        // j =1
//                 if(i % j == 0) {                   // 2 % 1 == 0
//                     a++;                           // a = 1
//                     System.out.print(a);
//                 }
//             }
//             if (a == 2) {                          // 약수 = 1 , 본인
//                 answer++;
//             }
//         }
//         return answer;
//     }
// } 효율성 실패

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            
            // 2부터 i의 제곱근까지의 숫자로 나누어지는지 확인
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                answer++;
            }
        }

        return answer;
    }
}
