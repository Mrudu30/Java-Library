package stringObject;
// qb 324: WAP to accept a string and count the number of vowels present in a string
import java.util.Scanner;
public class s4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("The count of vowels is:"+count);
        sc.close();
    }
}
