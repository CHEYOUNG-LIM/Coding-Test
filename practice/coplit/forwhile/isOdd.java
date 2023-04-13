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