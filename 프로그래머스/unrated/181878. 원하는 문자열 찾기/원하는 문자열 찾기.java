class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String a = myString.toUpperCase();
        String b = pat.toUpperCase();
        
        for(int i = 0 ; i < myString.length() ; i++) {
            if(a.contains(b)) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}