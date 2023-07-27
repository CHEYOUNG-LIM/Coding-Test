import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int[] count = new int[3]; // [,,] [0,0,0]
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) {
                count[0]++;
            }
            if (answers[i] == b[i % b.length]) {
                count[1]++;
            }
            if (answers[i] == c[i % c.length]) {
                count[2]++;
            }
        }
        
        int maxCount = Math.max(count[0], Math.max(count[1], count[2]));
        
        if (count[0] == maxCount) {
            answer.add(1);
        }
        if (count[1] == maxCount) {
            answer.add(2);
        }
        if (count[2] == maxCount) {
            answer.add(3);
        }
        
        Collections.sort(answer);
        
        int[] result = new int[answer.size()];
        
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
            
        return result;
    }
}