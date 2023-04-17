//makeDigits
//수(num)를 입력받아 1부터 num까지의 정수로 구성된 문자열을 리턴해야 합니다.

package coplit.forwhile;

public class makeDigits {
    public String makeDigits(int num) {
        String result = "";
        // TODO:
        for (int i = 1 ; i <= num ; i++) {
            result = result + i;
        } return result;
    }
}