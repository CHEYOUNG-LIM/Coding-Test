import java.util.*;

class Solution {
    public int[] solution(int[] numbers) { // 01 02 03 04, 12 13 14, 23 24, 34
        ArrayList<Integer> answer = new ArrayList<>();
        int a = 0;
        
        for(int i = 0 ; i < numbers.length ; i++) {
            for(int j = i+1 ; j < numbers.length ; j++) {
                a = numbers[i] + numbers[j];
                
                if(!answer.contains(a)) { // arraylist에 포함안하면 add
                    answer.add(a);
                }
            }
        }
        // int[] answer2;
        // answer2 = answer.stream().mapToInt(i -> i).toArray();
        int[] answer2 = new int[answer.size()];  // list를 배열로 바꾸기
        for(int i = 0 ; i < answer.size() ; i++) {
            answer2[i] = answer.get(i);
        }
        Arrays.sort(answer2);
        return answer2;
    }
}