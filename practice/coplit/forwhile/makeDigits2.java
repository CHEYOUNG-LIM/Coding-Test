//makeDigits2
//수(num)를 입력받아 1부터 num까지의 정수로 구성된 문자열을 리턴해야 합니다.

package coplit.forwhile;

public class makeDigits2 {
    public String makeDigits2(int num) {
        // TODO:
        String result = "1";
        int i = 2;
        while (i <= num) {
            result = result +'-'+ i;
            i++;
        }return result;
    }
}
