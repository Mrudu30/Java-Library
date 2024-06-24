// WAP to accept three numbers from user and Print Maximum number by using  nested if..else
import java.util.*;
public class q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number:");
        int c = sc.nextInt();
        if (a>c){
            if(a>b){
                System.out.println("1st number is the greatest!");
            }
            else{
                System.out.println("2nd number is greatest!");
            }
        }
        sc.close();
    }
}
