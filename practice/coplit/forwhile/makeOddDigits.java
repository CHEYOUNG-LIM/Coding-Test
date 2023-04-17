//makeOddDigits
//수(num)를 입력받아 1을 포함하여 num개의 홀수로 구성된 문자열을 리턴해야 합니다.

package coplit.forwhile;

public class makeOddDigits {
    public String makeOddDigits(int num) {
        // TODO:
        String result = "";
        int i = 1;
        while (i <= num) {
            result = result + ((2 * i) - 1);
            i++;
        }return result;
    }
}