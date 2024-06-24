import java.util.*;
// Write a function to print the sum of all odd numbers from 1 to n.
public class Q2 {
    public static void oddFinder(int n){
        if(n<0){
            System.out.println("Enter a number greater than 0");
            return;
        }
        else if(n==0){
            System.out.println("Number cannot be 0");
            return;
        }
        else{
            System.out.println("Odd Numbers are:");
            for (int i=0; i<=n;i++){
                if (i%2==0){
                    continue;
                }
                else{
                    System.out.print(i);
                    System.out.print(",");
                }
            }
            return;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        oddFinder(a);
        sc.close();
    }
}
