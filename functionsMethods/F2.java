import java.util.*;

public class F2 {
    // take 2 number and return the sum
    public static int calculateSum(int a, int b){
        int sum = a+b;
        System.out.print("Sum of the integers is: ");
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b = sc.nextInt();
        calculateSum(a, b);
        sc.close();
    }
}
