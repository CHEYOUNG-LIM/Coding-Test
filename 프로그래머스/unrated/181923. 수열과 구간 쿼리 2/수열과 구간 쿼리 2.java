import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> answerList = new ArrayList<>();
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            int[] subArray = Arrays.copyOfRange(arr, s, e + 1);
            Arrays.sort(subArray);
            
            int temp = -1;
            for (int num : subArray) {
                if (num > k) {
                    temp = num;
                    break;
                }
            }
            
            answerList.add(temp);
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}