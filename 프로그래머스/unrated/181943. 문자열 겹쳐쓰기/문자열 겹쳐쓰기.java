class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        
        for(int i = 0 ; i < my_string.length() ; i++){  // s=2, my_string.length()= 10
            if(i < s || i >= s + overwrite_string.length()) { //overwrite_string.length()=7
                answer = answer + my_string.charAt(i);
            } else {
                answer = answer + overwrite_string.charAt(i-s);
            }
        }
        return answer;
    }
}