class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1 ; i < food.length ; i++) {
            for(int j = 0 ; j < food[i] / 2 ; j++) {
                answer = answer + Integer.toString(i);
            }
        }

        StringBuffer answer2 = new StringBuffer(answer);
        answer2.reverse();
        
        return answer + "0" + answer2;
    }
}