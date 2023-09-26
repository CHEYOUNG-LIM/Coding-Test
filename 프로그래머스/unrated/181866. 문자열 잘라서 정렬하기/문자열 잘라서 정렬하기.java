import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String a = "";
        
        a = myString.replaceAll("x"," ");
        a = a.replaceAll("\\s+"," ").trim();
        
        answer = a.split(" ");
        Arrays.sort(answer);
        
        return answer;
    }
}
