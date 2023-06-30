import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> stk = new ArrayList<>();

        for (int i = 0 ; i < arr.length ; i++) {
            if (stk.isEmpty() || stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
            } else if (stk.get(stk.size() - 1) >= arr[i]) {
                while (!stk.isEmpty() && stk.get(stk.size() - 1) >= arr[i]) {
                    stk.remove(stk.size() - 1);
                }
                stk.add(arr[i]);
            }
        }
        int[] result = new int[stk.size()];
        for (int i = 0; i < stk.size(); i++) {
            result[i] = stk.get(i);
        }
        return result;
    }
}