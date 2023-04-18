// getMaxNumberFromString
// 숫자 문자열을 입력받아 문자열을 구성하는 각 숫자 중 가장 큰 수를 나타내는 숫자를 리턴해야 합니다.

package coplit.forwhile;

public class getMaxNumberFromString {
    public int getMaxNumberFromString(String str) {
        int Max = 0;

        for(int i = 0 ; i < str.length() ; i++) {
            int N = Character.getNumericValue(str.charAt(i));
            if(N > Max) {
                Max = N;
            }
        } return Max;
    }
}