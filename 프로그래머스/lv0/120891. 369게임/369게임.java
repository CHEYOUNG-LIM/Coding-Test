class Solution {
    public int solution(int order) {
        int answer = 0;
        String a = Integer.toString(order);
        
        for(int i = 0; i < a.length() ; i++) {
            if(a.charAt(i) == '3' || a.charAt(i) == '6' || a.charAt(i) == '9') {
                answer++;
            }
        }
        return answer;
    }
}