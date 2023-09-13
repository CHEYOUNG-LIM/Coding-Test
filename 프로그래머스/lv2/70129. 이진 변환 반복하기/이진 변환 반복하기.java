class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zero = 0;
        int cnt = 0;
        String a = "";
        
        while(a.length() != 1) {
            a = s.replaceAll("0","");
            cnt++;
            zero = zero + s.length() - a.length();
            s = Integer.toBinaryString(a.length());
        }
        answer[0] = cnt;
        answer[1] = zero;
        
        return answer;
    }
}