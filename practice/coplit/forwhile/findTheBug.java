//findTheBug
//문자열을 입력받아 버그('#')의 인덱스를 리턴해야 합니다.

package coplit.forwhile;

public class findTheBug {
    public int findTheBug(String word) {
        // TODO:
        int j = -1;
        for (int i = 0 ; i < word.length() ; i++) {
            if(word.charAt(i) == '#') {
                j = i;
            }
        }return j;
    }
}