import java.util.Scanner;

public class Q9 {
    // Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        int gcd = getGCD(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);

        sc.close();
    }
}
