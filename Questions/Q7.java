import java.util.Scanner;
// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
public class Q7 {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (enter 'end' to finish input):");
        String input;
        do {
            input = sc.next();
            if (!input.equals("end")) {
                try {
                    int number = Integer.parseInt(input);
                    if (number > 0) {
                        positive++;
                    } else if (number < 0) {
                        negative++;
                    } else {
                        zeros++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'end' to finish input.");
                }
            }
        } while (!input.equals("end"));

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);

        sc.close();
    }
}