import java.util.*;
public class Q3 {
    // Write a function which takes in 2 numbers and returns the greater of those two.
    public static void compareNumber(int a, int b){
        if(a>b){
            System.out.println("A is greater than B");
        }
        else if (a==b){
            System.out.println("A & B are equal");
        }
        else{
            System.out.println("B is greater than A");
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = sc.nextInt();
        System.out.println("Enter B:");
        int b = sc.nextInt();
        compareNumber(a,b);
        sc.close();
    }
}
