// WAP to perform addition, multiplication, subtraction and division with Switch
// statement.
import java.util.*;
public class q136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice of operation:\n 1. Addition\n 2. Subtraction \n 3. Division\n 4. Multiplication\n");
        int choice = sc.nextInt();
        System.out.println("Enter value of A:");
        int a = sc.nextInt();
        System.out.println("Enter value of B:");
        int b = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The sum of variables is:"+(a+b));
                break;
            case 2:
                System.out.println("The difference of variables is:"+(a-b));
                break;
            case 3:
                System.out.println("The division of variables is:"+(a/b));
                break;
            case 4:
                System.out.println("The product of variables is:"+(a*b));
                break;
            default:
                System.out.println("Make a Choice from above options only!!");
                break;
        }
        sc.close();
    }
}
