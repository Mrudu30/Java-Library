import java.util.*;
public class F3 {
    public static int calculateProduct(int a, int b){
        int product = a * b;
        System.out.print("Your product is:");
        System.out.println(product);
        return product;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b = sc.nextInt();
        calculateProduct(a, b);
    }
}