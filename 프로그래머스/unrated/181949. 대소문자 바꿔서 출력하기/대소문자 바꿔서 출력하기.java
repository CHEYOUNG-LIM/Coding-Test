import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for (int i = 0 ; i < a.length() ; i++) {
            char c = a.charAt(i);
            
            if (Character.isUpperCase(c)) {
                result = result + Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                result = result + Character.toUpperCase(c);
            } else {
                result += c;
            }
        }
        System.out.println(result);
    }
}