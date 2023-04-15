//isOdd
//수를 입력받아 홀수인지 여부를 리턴해야 합니다.

package coplit.forwhile;

public class isOdd {
    public boolean isOdd(int num) {
        int sum = 2;
        while (2 < Math.abs(num)) {
            num = Math.abs(num) - sum;
        }
        if (num == 1) {
            return true;
        }else{
            return false;
        }
    }
}