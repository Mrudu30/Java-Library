// WAP to check whether entered character is vowel or not by using if…else  statement
import java.util.*;
public class q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one character:");
        char ch = sc.next().charAt(0); // Read a single character
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("The entered character is a vowel.");
        } else {
            System.out.println("The entered character is not a vowel.");
        }
        sc.close();
    }
}