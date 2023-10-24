import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] suffixes = new String[my_string.length()];

        // 모든 접미사 생성
        for (int i = 0; i < my_string.length(); i++) {
            suffixes[i] = my_string.substring(i);
        }

        // 접미사 배열을 사전순으로 정렬
        Arrays.sort(suffixes);

        return suffixes;
    }
}