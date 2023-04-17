//makeMultiplesOfDigit2
//두 개의 수를 입력받아 두 수를 포함해 두 수 사이의 수 중 2의 배수의 개수를 리턴해야 합니다.

package coplit.forwhile;

public class makeMultiplesOfDigit2 {
    public int makeMultiplesOfDigit2(int num1, int num2) {
        //TODO:
        int result = 0;
        int a = 0;
        if (num1 > num2) {
            a = num1;
            num1 = num2;
            num2 = a;
        }
        if (num1 == 0) {
            num1 = num1 + 1;
        }
        for (int i = num1 ; i <= num2 ; i++ ) {
            if (i%2==0) {
                result = result + 1;
            }
        }return result;
    }
}