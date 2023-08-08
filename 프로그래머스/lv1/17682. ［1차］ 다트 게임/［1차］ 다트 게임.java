// public class Solution {
//     public int solution(String dartResult) {
//         int[] scores = new int[3];
        
//         int currentIndex = 0; // 현재 기회 인덱스
        
//         for (int i = 0; i < dartResult.length(); i++) {
//             char ch = dartResult.charAt(i);
            
//             if (Character.isDigit(ch)) {
//                 int score = ch - '0';
//                 // 10 처리
//                 if (i + 1 < dartResult.length() && Character.isDigit(dartResult.charAt(i + 1))) {
//                     score = 10;
//                     i++;
//                 }
//                 scores[currentIndex] = score;
//             } else if (ch == 'S' || ch == 'D' || ch == 'T') {
//                 if (ch == 'D') {
//                     scores[currentIndex] = (int) Math.pow(scores[currentIndex], 2);
//                 } else if (ch == 'T') {
//                     scores[currentIndex] = (int) Math.pow(scores[currentIndex], 3);
//                 }
//                 currentIndex++;
//             } else if (ch == '*' || ch == '#') {
//                 if (ch == '*') {
//                     scores[currentIndex - 1] *= 2;
//                     if (currentIndex - 2 >= 0) {
//                         scores[currentIndex - 2] *= 2;
//                     }
//                 } else if (ch == '#') {
//                     scores[currentIndex - 1] *= -1;
//                 }
//             }
//         }
        
//         int answer = 0;
//         for (int score : scores) {
//             answer += score;
//         }
        
//         return answer;
//     }
// }

import java.util.*;
class Solution {
    public int solution(String dartResult) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < dartResult.length(); ++i) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                sum = (c - '0');
                if (sum == 1 && i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {
                    sum = 10;
                    i++;
                }
                stack.push(sum);
            } else {
                int prev = stack.pop();
                if (c == 'D') {
                    prev *= prev;
                } else if (c == 'T') {
                    prev = prev * prev * prev;
                } else if (c == '*') {
                    if (!stack.isEmpty()) {
                        int val = stack.pop() * 2;
                        stack.push(val);
                    }
                    prev *= 2;
                } else if (c == '#') {
                    prev *= (-1);
                }
                // System.out.println(prev);
                stack.push(prev);
            }
        }
        int totalScore = 0;
        while (!stack.isEmpty()) {
            totalScore += stack.pop();
        }
        return totalScore;
    }
}