class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int answer2 = 1;
        if(num_list.length >= 11) {
            for(int i = 0 ; i < num_list.length ; i++) {
                answer = answer + num_list[i];
            }
            } else {
                for(int i = 0 ; i < num_list.length ; i++) {
                    answer2 = answer2 * num_list[i];
                    answer = answer2;
            }
        } return answer;
    }
}