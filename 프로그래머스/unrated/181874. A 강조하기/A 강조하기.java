class Solution {
    public String solution(String myString) {
        String answer = "";
    
        for(int i = 0 ; i < myString.length() ; i++) {
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'A') {
                answer = answer + 'A';
            } else {
                answer = answer + myString.toLowerCase().charAt(i);
            }
        }
        return answer;
    }
}