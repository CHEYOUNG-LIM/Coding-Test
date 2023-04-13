//sum
//수를 입력받아 0부터 해당 수까지의 합을 리턴해야 합니다.

package coplit.forwhile;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("정수를 입력하세요 : ");
        Scanner number = new Scanner(System.in); // 입력
        int num = number.nextInt();  // 입력 받은 데이터 한줄을 읽어서, int로 리턴

        int result = 0;

        for (int i = 0 ; i <= num ; i++) {
            result = result + i;
        }
        
        System.out.println(result);
    }
}


