class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] tmp = my_string.split("");
        
        for(int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }
        
        for(int i = 0; i < tmp.length; i++) {
            answer = answer + tmp[i];
        }
        
        return answer;
    }
}