class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0 ; i < rsp.length() ; i++) {
            if(String.valueOf(rsp.charAt(i)).equals("0")) {
                answer = answer + "5";
            } else if(String.valueOf(rsp.charAt(i)).equals("2")) {
                answer = answer + "0";
            } else if(String.valueOf(rsp.charAt(i)).equals("5")) {
                answer = answer + "2";
            }
        }
        return answer;
    }
}