class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String my = "";
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A') {
                my = my + 'B';
            } else if(myString.charAt(i) == 'B') {
                my = my + 'A';
            }
        }
        if(my.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}