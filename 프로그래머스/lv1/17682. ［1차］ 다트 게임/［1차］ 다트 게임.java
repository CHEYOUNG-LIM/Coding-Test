public class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int currentIndex = 0; // 현재 기회 인덱스
        
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            
            if (Character.isDigit(ch)) {
                int score = ch - '0';
                // 10 처리
                if (i + 1 < dartResult.length() && Character.isDigit(dartResult.charAt(i + 1))) {
                    score = 10;
                    i++;
                }
                scores[currentIndex] = score;
            } else if (ch == 'S' || ch == 'D' || ch == 'T') {
                if (ch == 'D') {
                    scores[currentIndex] = (int) Math.pow(scores[currentIndex], 2);
                } else if (ch == 'T') {
                    scores[currentIndex] = (int) Math.pow(scores[currentIndex], 3);
                }
                currentIndex++;
            } else if (ch == '*' || ch == '#') {
                if (ch == '*') {
                    scores[currentIndex - 1] *= 2;
                    if (currentIndex - 2 >= 0) {
                        scores[currentIndex - 2] *= 2;
                    }
                } else if (ch == '#') {
                    scores[currentIndex - 1] *= -1;
                }
            }
        }
        
        int answer = 0;
        for (int score : scores) {
            answer += score;
        }
        
        return answer;
    }
}