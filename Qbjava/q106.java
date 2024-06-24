// WAP that determines if a year is a leap year or not by using if…else.
import java.util.*;
public class q106 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("The year is a leap year!");
        }
        else{
            System.out.println("The year is not a leap year");
        }
        sc.close();
    }
}
