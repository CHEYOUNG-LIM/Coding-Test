import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        
        char[] a = my_string.toCharArray();
        Arrays.sort(a);
        
        answer = new String(a);
        
        return answer;
    }
}