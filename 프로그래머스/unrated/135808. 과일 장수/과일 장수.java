import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = score.length-1 ; i >= 0 ; i--){ //뒤에서부터 세기
            if((score.length-i) % m == 0){ //m개씩 끊어서 계산
                answer = answer + score[i] * m;
            }
        }
        return answer;
    }
}