// Write a Java program to input electricity unit charges and calculate total
// electricity bill
// according to the given condition:
// For first 50 units Rs. 0.50/unit
// For next 100 units Rs. 0.75/unit
// For next 100 units Rs. 1.20/unit
// For unit above 250 Rs. 1.50/unit
// An additional surcharge of 20% is added to the bill. Use Scanner class for input
// of electricity units.
import java.util.*;
public class q139{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the electricity units: ");
        int units = sc.nextInt();
        double bill = 0.0;
        for (int i = 1; i<=units; i++){
            if (i<=50){
                bill = bill + 0.50;
            }
            else if (i>50 && i<=150){
                bill = bill + 0.75;
            }
            else if (i>150 && i<=250){
                bill = bill + 1.20;
            }
            else if (i>250){
                bill = bill + 1.50;
            }
            else{
                System.out.println("Invalid input");
            }
        }
        bill = bill + (bill*0.20);
        System.out.println("Your Total Bill is:"+bill);
        sc.close();
    }
}