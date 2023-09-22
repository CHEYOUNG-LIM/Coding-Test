import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = Long.toString(n);
        char[] arr = new char[a.length()];
        
        for(int i = 0; i < a.length(); i++) {
            arr[i] = a.charAt(i);
        }
        Arrays.sort(arr);
        
        StringBuilder reversedStr = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedStr.append(arr[i]);
        }
        
        answer = Long.parseLong(reversedStr.toString());
        
        return answer;
    }
}