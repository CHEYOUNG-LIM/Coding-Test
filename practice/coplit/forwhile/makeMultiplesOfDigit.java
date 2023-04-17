//makeMultiplesOfDigit
//수를 입력받아 1부터 해당 수까지의 수 중에서 3의 배수로만 구성된 문자열을 리턴해야 합니다.

package coplit.forwhile;

public class makeMultiplesOfDigit {
    public String makeMultiplesOfDigit(int num) {
        // TODO:
        String result = "";
        int A = 1;
        for (int i = 1 ; A < num-1 ; i++ ) {
            A = 3 * i;
            result = result + A;
        }return result;
    }
}