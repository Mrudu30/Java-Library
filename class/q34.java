// check if the number entered by user is palindrome or not by class

import java.util.Scanner;

class Palindrome {
    void Check(int num) {
        int temp = num;
        int rev = 0, rem;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == temp) {
            System.out.println("The number is palindrome");
        } else {
            // System.out.println("This is num:" + temp);
            // System.out.println("This is r:" + rev);
            System.out.println("The number is not palindrome");
        }
    }
}

public class q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Palindrome obj = new Palindrome();
        obj.Check(num);
        sc.close();
    }
}
