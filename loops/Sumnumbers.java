import java.util.*;
public class Sumnumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            sum+=n;
            n--;
        }
        System.out.print("The Sum of natural numbers is:"+sum);
    }
}