class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            int s = 0;
            for(int j = i; j <= n; j++) {
                s = s + j;
                if(s == n) {
                    answer++;
                    break;
                } else if(s > n) {
                    break;
                }
            }
        }
        return answer;
    }
}