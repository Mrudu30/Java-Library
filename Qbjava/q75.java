
// WAP to swap two numbers using temporary variable

import java.util.*;
public class q75 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int a = sc.nextInt();
        System.out.println("Enter Number 2:");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Number 1:"+a+"\nNumber 2:"+b);
        sc.close();
    }
}
