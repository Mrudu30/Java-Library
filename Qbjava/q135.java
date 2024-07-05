// WAP by using switch case to print grade of a student using following rules :
// Percentage >70 means Grade A
// Percentage 60-70 means Grade B
// Percentage 50-60 means Grade C
// Percentage <50 means Grade F

import java.util.Scanner;

public class q135 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Choice for your percentage achieved:\n 1. Greater then 70\n 2. Between 60 to 70\n 3. Between 50 to 60\n 4. Below 50");
        int percentage = sc.nextInt();
        switch (percentage) {
            case 1:
                System.out.println("Congratulations! You got Grade A.");
                break;
            case 2:
                System.out.println("You got Grade B.");
                break;
            case 3:
                System.out.println("You got Grade C.");
                break;
            case 4:
                System.out.println("You got Grade F.");
                break;
            default:
                System.out.println("Please Enter from Above Choice.");
                break;
        }
        sc.close();
    }
}
