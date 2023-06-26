class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        int b = 0;
        
        for(int i = 0 ; i < num_list.length ; i++) {
            a = a * num_list[i];
        }
        
        for(int i = 0 ; i < num_list.length ; i++) {
            b = b + num_list[i];
        }
        
        answer = a < Math.pow(b,2) ? 1 : 0;
        
        return answer;
    }
}