// Write a java code to perform following task.
// Adani Gas Company Limited has increased price per unit Rs. 5 in every slab of unit usage from the month of October. My Previous Bill of September is 1774.86 with Usage of 150 Unit & Including 18% GST. Use Scanner class to take
// no_of_unit as user input and calculate my bill for the month of October. Also
// check the difference of final bill amount from the month of September and
// Ocotber.
// Unit Usage Price Per Unit (Before Month of October)
// 0 – 50 02
// 51 – 250 10
// 250 – 350 13
// 350 - 500 18
// > 500 25

import java.util.Scanner;
public class q140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units: ");
        int n = sc.nextInt();
        int bill = 0;
        if (n <= 50) {
            bill = 2 * n;
        } else if (n > 50 && n <= 250) {
            bill = 10 * 50 + 2 * (n - 50);
        } else if (n > 250 && n <= 350) {
            bill = 10 * 50 + 13 * (n - 250);
        } else if (n > 350 && n <= 500) {
            bill = 10 * 50 + 13 * (n - 250) + 18 * (n - 350);
        } else if (n > 500) {
            bill = 10 * 50 + 13 * (n - 250) + 18 * (n - 350) + 25 * (n - 500);
        }
        System.out.println("The bill amount is: " + bill);
        sc.close();
    }
}