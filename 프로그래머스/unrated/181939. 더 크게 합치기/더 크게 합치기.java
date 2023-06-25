class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a2 = Integer.toString(a);
        String b2 = Integer.toString(b);
        int first = Integer.parseInt(a2+b2);
        int second = Integer.parseInt(b2+a2);
        
        if(first > second) {
            answer = first;
        } else {
            answer = second;
        }
        return answer;
    }
}