import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (!str.contains("ad")) {
            answer.add(str);
            }
        }
        return answer.toArray(new String[0]);
    }
}