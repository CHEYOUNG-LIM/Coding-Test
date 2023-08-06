import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String a = Long.toString(n);
        int[] answer = new int[a.length()];
        
        for(int i = 0 ; i < a.length() ; i++) {
            answer[i] = a.charAt(a.length() - 1 - i) - '0';
        }
        
        return answer;
    }
}