// WAP that reads two nos. from key board and gives their addition, subtraction, multiplication, division and modulo
import java.util.Scanner;

public class q71 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int a = sc.nextInt();
        System.out.println("Enter Number 2:");
        int b = sc.nextInt();
        System.out.println("Enter the choice:\n1.Addition\n2.Subtraction\n3.Mulitiplication\n4.Division\n5.Modulo");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int sum = a+b;
                System.out.println("Sum of both numbers: "+sum);
                break;
            case 2:
                int difference = 0;
                if (a>b) {
                    difference = a-b;
                } else {
                    difference = b-a;
                }
                System.out.println("Positive difference betwn the numbers is: "+difference);
                break;
            case 3:
                float product = a*b;
                System.out.println("The Product of the numbers are: "+product);
                break;
            case 4:
                int divisor = 0;
                if (a>b) {
                    divisor = a/b;
                } else {
                    divisor = b/a;
                }
                System.out.println("The Quotient is:"+divisor);
                break;
            case 5:
                int modulo = 0;
                if (a>b) {
                    modulo = a%b;
                } else {
                    modulo = b%a;
                }
                System.out.println("The Positive Remainder is:"+modulo);
                break;
            default:
                System.out.println("Enter only given values!!");
                break;
        }
        sc.close();
    }
}
