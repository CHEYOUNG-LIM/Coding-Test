import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String subStr = t.substring(i, i + p.length());
            long subNum = Long.parseLong(subStr);
            if (subNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}