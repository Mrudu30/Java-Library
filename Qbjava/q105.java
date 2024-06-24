import java.util.Scanner;
// W.A.P.to test the char you have inserted is alphabet or digit.
public class q105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);

        // Test if the character is an alphabet
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet.");
        }
        // Test if the character is a digit
        else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        }
        // If neither an alphabet nor a digit
        else {
            System.out.println(ch + " is neither an alphabet nor a digit.");
        }

        scanner.close();
    }
}
