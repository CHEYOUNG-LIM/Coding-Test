//computePower
//밑(base)과 지수(exponent)를 입력받아 밑의 거듭제곱을 리턴해야 합니다.

package coplit.forwhile;

public class computePower {
    public int computePower(int base, int exponent) {
        int result = 1;

        for(int i = 1 ; i <= exponent ; i++) {
            result = result * base;
        } return result;
    }
}