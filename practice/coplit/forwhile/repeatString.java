//repeatString
//문자열과 수를 입력받아 반복된 문자열을 리턴해야 합니다.

package coplit.forwhile;

public class repeatString {
    public String makeDigits(int num) {
        String result = "";
        // TODO:
        for (int i = 1 ; i <= num ; i++) {
            result = result + i;
        } return result;
    }
}
// 이거