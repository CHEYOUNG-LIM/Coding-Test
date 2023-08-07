import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        // 최댓값과 최솟값을 저장할 배열
        int[] answer = {0, 0};
        
        // 최소 힙과 최대 힙을 사용하여 이중 우선순위 큐 구현
        PriorityQueue<Integer> minQ = new PriorityQueue();
        PriorityQueue<Integer> maxQ = new PriorityQueue(Collections.reverseOrder());
        
        // 연산을 수행할 숫자 변수
        int val = 0;
        
        // 주어진 연산 배열을 순회하며 연산을 처리
        for (int i = 0; i < operations.length; i++) {
            // 현재 연산을 문자열로 가져옴
            String op = operations[i];
            // 연산의 타입을 체크하기 위해 첫 번째 문자만 가져옴
            String opType = op.substring(0, 1);
            
            // 삭제 연산인 경우
            if (opType.equals("D")) {
                // 최솟값 삭제 연산일 때
                if (op.charAt(2) == '-') {
                    // 최소 힙이 비어있지 않다면 최솟값을 삭제
                    if (!minQ.isEmpty()) {
                        val = minQ.peek();
                        minQ.poll();
                        maxQ.remove(val);
                    }
                }
                // 최댓값 삭제 연산일 때
                else {
                    // 최대 힙이 비어있지 않다면 최댓값을 삭제
                    if (!maxQ.isEmpty()) {
                        val = maxQ.peek();
                        maxQ.poll();
                        minQ.remove(val);
                    }
                }
            } else {  // 추가 연산인 경우
                // 연산에 포함된 숫자를 추출하여 value 변수에 저장
                int value = Integer.parseInt(op.substring(2));
                // 최대 힙과 최소 힙에 숫자를 삽입
                maxQ.offer(value);
                minQ.offer(value);
            }
        }
        
        // 이중 우선순위 큐가 비어있지 않으면 (값이 존재하면) 최댓값과 최솟값을 저장
        if (!maxQ.isEmpty()) {
            answer[0] = maxQ.peek();
            answer[1] = minQ.peek();
        }
        
        // 최종적으로 구해진 최댓값과 최솟값을 반환
        return answer;
    }
}


// public class DoublePriorityQueue {
//     public static void main(String[] args) {
//         System.out.println(Arrays.toString(solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"})));
//     }
//     private static int[] solution(String[] operations) {
//         PriorityQueue<Integer> minQ = new PriorityQueue<>();
//         PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(Collections.reverseOrder());

//         for (int i = 0; i < operations.length; i++) {
//             String[] arr = operations[i].split(" ");
//             if (arr[0].equals("I")) {
//                 int num = Integer.parseInt(arr[1]);
//                 minQ.add(num);
//                 maxQ.add(num);
//             } else if (arr[0].equals("D")) {
//                 if (arr[1].equals("1")) {
//                     if (!minQ.isEmpty()) {
//                         int num = maxQ.poll();
//                         minQ.remove(num);
//                     }
//                 } else if (arr[1].equals("-1")) {
//                     if (!minQ.isEmpty()) {
//                         int num = minQ.poll();
//                         maxQ.remove(num);
//                     }
//                 }
//             }
//         }

//         if (minQ.isEmpty() && maxQ.isEmpty()) {
//             return new int[]{0, 0};
//         } else if (minQ.isEmpty()) {
//             return new int[]{maxQ.poll(), 0};
//         } else if (maxQ.isEmpty()) {
//             return new int[]{0, minQ.poll()};
//         } else {
//             return new int[]{maxQ.poll(), minQ.poll()};
//         }
//     }
// }