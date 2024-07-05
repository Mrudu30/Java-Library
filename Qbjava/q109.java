// WAP to check whether a person eligible for blood donation or not by using
// Nested If Statement. Condition for eligibility is person weight >50 and person
// age >18 .
import java.util.*;
public class q109 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("'Enter your Age:");
        int age = sc.nextInt();
        System.out.println("Enter your Weight in Kgs:");
        double weight = sc.nextDouble();
        if (age>18) {
            if (weight>50) {
                System.out.println("You can donate your blood.");
            } else {
                System.out.println("Sorry! You are underweight for donation.");
            }
        } else {
            System.out.println("Sorry! You are underage for donation.");
        }
        sc.close();
    }
}