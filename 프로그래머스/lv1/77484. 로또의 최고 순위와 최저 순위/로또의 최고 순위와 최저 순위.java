import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0; // 맞춘 개수를 세는 변수
        int count0 = 0; // 알아볼 수 없는 번호의 개수를 세는 변수
        
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                count0++;
            } else {
                for (int j = 0; j < 6; j++) {
                    if (lottos[i] == win_nums[j]) {
                        count++;
                        break;
                    }
                }
            }
        }
        
        // 최고 순위와 최저 순위 계산
        int maxRank = 7 - (count + count0); //3
        int minRank = 7 - count; // 5
        
        // 순위가 6보다 크면 6으로 설정
        answer[0] = Math.min(maxRank, 6);
        answer[1] = Math.min(minRank, 6);
        
        return answer;
    }
}