// Torrent Power Ltd. charges the following rates for the use of electricity:
// First 50 units are free for all;
// for the next 150 units 80 paise per unit;
// for the next 100 units 90 paise per unit;
// beyond 300 units Rs 1 per unit.
// All users are charged fixed Rs. 100 as meter charge.
// If the total amount is more than Rs 400, then an additional surcharge of 15% of
// total amount
// is charged. Write a program to read the name of the user, number of units
// consumed and print
// out the final charged amount.

import java.util.*;
public class q143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the user: ");
        String name = sc.nextLine();
        System.out.println("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double bill = 0.00;
        if (units > 50){
            if(200>=units){
                bill = 100 + (150*0.80);
            }else if(300>=units){
                bill = 100 + (150*0.80) + (100*0.90);
            }else if(units>300){
                bill = 100 + (150*0.80) + (100*0.90) + ((units-300)*1.00);
            }
        }else{
            bill = 100;
        }
        if(bill>400){
            bill = bill + (bill*0.15);
        }
        System.out.println("Name of Customer: "+name);
        System.out.println("Total Bill: "+bill);
        sc.close();
    }
}
