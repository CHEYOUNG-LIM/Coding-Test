class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        int result = Integer.parseInt(a1+b1);
        
        answer = (result >= 2 * a * b) ? result : 2 * a * b;
            
        return answer;
    }
}