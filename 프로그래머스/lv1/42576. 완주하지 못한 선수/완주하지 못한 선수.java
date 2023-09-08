import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = answer + participant[i];
                return answer;
            } 
        }
        return answer + participant[participant.length-1];
    }
}