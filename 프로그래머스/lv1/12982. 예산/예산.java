import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int a = 0;
        Arrays.sort(d);
        
        for(int i = 0 ; i < d.length ; i++) {
            a = a + d[i];
            if(a <= budget) {
                answer++;
            }
        }
        return answer;
    }
}