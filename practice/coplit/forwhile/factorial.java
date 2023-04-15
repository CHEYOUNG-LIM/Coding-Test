//factorial
//수를 입력받아 n-factorial(n!) 값을 리턴해야 합니다.

package coplit.forwhile;

public class factorial {
    public int factorial(int num) {
        int result = 1;
        for (int i = 1 ; i <= num; i++) {
            result = i * result;
        }
        return result;
    }
}
