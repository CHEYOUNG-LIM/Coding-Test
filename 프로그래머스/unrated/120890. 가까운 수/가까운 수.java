class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            diff = Math.abs(n - array[i]);
            if (diff < min) {
                min = diff;
                answer = array[i];
                
            } else if (diff == min && array[i] < answer) {
                answer = array[i];
            }
        }
        
        return answer;
    }
}


// import java.util.*;

// class Solution {
//     public int solution(int[] array, int n) {
//         int answer = 0;
//         Arrays.sort(array);
//         for(int i = 1 ; i < array.length ; i++){
//             if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
//                 array[0] = array[i];
//             }
//         }
//         answer = array[0];
//         return answer;
//     }
// }