import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> deleteSet = new HashSet<>();
        
        for (int i = 0; i < delete_list.length; i++) {
            deleteSet.add(delete_list[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (!deleteSet.contains(arr[i])) {
                answer.add(arr[i]);
            }
        }
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}