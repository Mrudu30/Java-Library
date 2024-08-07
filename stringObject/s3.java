package stringObject;
import java.util.Scanner;
// WAP to check given string is palindrome or not without using reverse method. qb 323
public class s3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        String s1 = "";
        for (int i=s.length(); i>0; i--){
            s1 = s1 + s.charAt(i-1);
        }
        System.out.println("these sre the strings: "+s+" , "+s1);
        if (s.equals(s1)){
            System.out.println("The string is palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }
        sc.close();
    }
}
