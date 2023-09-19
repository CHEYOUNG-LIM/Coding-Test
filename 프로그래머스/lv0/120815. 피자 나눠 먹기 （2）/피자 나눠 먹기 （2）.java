class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            double a = (double)(6 * i) / n;
            if(a % 1 == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}