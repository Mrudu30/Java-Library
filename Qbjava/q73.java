
import java.util.Scanner;

public class q73 {
    public static void main(String[] args) {
        // WAP to convert days into months and days.
        System.out.println("Consedering a month of 30 days.");
        System.out.println("Enter the number of days(In whole number):");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int month_count = 0;
        if (days >= 30) {
            month_count = days / 30;
            days = days % 30;
        }
        System.out.println("Months: " + month_count + ", Remaining Days: " + days);
        sc.close();
    }
}
