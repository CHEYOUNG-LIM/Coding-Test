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

// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.next();
//         String b = a.toLowerCase();
//         String c = a.toUpperCase();
//         String d = "";
        
//         for(int i = 0 ; i < a.length() ; i++){
//             if(a.charAt(i) == b.charAt(i)){
//                 d = d + c.charAt(i);
//             }
            
//             else if(a.charAt(i) == c.charAt(i)){
//                 d = d + b.charAt(i);
//             }
//         }
        
//         System.out.print(d);
        
//     }
// }