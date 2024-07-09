// Write program to input amount from user and print counts of minimum number
// of notes (Available notes in Rs.: 500, 100, 50, 20, 10, 5, 2, 1) required for the
// amount. (Use Scanner class for user input)

import java.util.Scanner;

public class q141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();
        int note500 = 0;
        int note1 = 0;
        int note100 = 0;
        int note50 = 0;
        int note20 = 0;
        int note10 = 0;
        int note5 = 0;
        int note2 = 0;
        while (amount != 0) {
            if (amount >= 500) {
                note500 += 1;
                amount -= 500;
            } else if (amount >= 100) {
                note100 += 1;
                amount -= 100;
            } else if (amount >= 50) {
                note50 += 1;
                amount -= 50;
            } else if (amount >= 20) {
                note20 += 1;
                amount -= 20;
            } else if (amount >= 10) {
                note10 += 1;
                amount -= 10;
            } else if (amount >= 5) {
                note5 += 1;
                amount -= 5;
            } else if (amount >= 2) {
                note2 += 1;
                amount -= 2;
            } else if (amount >= 1) {
                note1 += 1;
                amount -= 1;
            }
        }
        System.out.println("Number of 500 Rs. notes: " + note500);
        System.out.println("Number of 100 Rs. notes: " + note100);
        System.out.println("Number of 50 Rs. notes:" + note50);
        System.out.println("Number of 20 Rs. notes:" + note20);
        System.out.println("Number of 10 Rs. notes:" + note10);
        System.out.println("Number of 5 Rs. notes:" + note5);
        System.out.println("Number of 2 Rs. notes:" + note2);
        System.out.println("Number of 1 Rs. notes:" + note1);
        sc.close();
    }
}
