import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int aPoint = 0;
        int bPoint = 0;
        
        Arrays.sort(A); // 1 3 5 7
        Arrays.sort(B); // 2 2 6 8
        
        for(int i = 0 ; i < A.length ; i++) {
            if (A[aPoint] > B[bPoint]) {
                bPoint++;
            } else if (A[aPoint] == B[bPoint]) {
                bPoint++;
            } else {
                aPoint++;
                bPoint++;
                answer++;
            }
        }
        return answer;
    }
}