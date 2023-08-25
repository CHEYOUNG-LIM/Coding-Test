// class Solution {
//     public int[] solution(int[] num_list, int n) {
//         int[] answer = new int[num_list.length];
//         int index = 0;

//         for (int i = n; i < num_list.length; i++) {
//             answer[index++] = num_list[i];
//         }
//         for (int i = 0; i < n; i++) {
//             answer[index++] = num_list[i];
//         }

//         return answer;
//     }
// }

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        System.arraycopy(num_list, n, answer, 0, num_list.length -n);
        System.arraycopy(num_list, 0, answer, num_list.length -n, n);
        
        return answer;
    }
}