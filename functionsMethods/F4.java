import java.util.*;
public class F4 {
    // calculate factorial of a number
    public static void factorial(int n){
        int fact = 1;
        if(n<0){
            System.err.println("You have to enter an integer");
            return;
        }
        else{
            for(int i=n;i>0;i--){
                fact = fact*i;
            }
            System.out.print("The Factorial of the number is: ");
            System.out.println(fact);
            return;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int a = sc.nextInt();
        factorial(a);
        sc.close();
    }
}
