import java.util.Scanner;

public class Q8 {
    // Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base number:");
        double base = sc.nextInt();
        System.out.println("Enter the Exponent number in integer:");
        double power = sc.nextInt();
        double ans = Math.pow(base,power);
        System.out.println("The Answer is:"+ans);
        sc.close();
    }
}
