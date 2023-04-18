//characterAndNumber
//문자열을 입력받아 각 문자(letter) 뒤에 해당 문자의 인덱스가 추가된 문자열을 리턴해야 합니다.

package coplit.forwhile;

public class characterAndNumber {
    public String characterAndNumber(String word) {
        String result = "";

        for(int i = 0 ; i < word.length() ; i++) {
            result = result + word.charAt(i) + i;
        } return result;
    }
}
