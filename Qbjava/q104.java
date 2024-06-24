// WAP to check whether entered number is divisible by 5 or not by using if…else statement.

import java.util.*;
public class q104 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = sc.nextInt();
        if(x%5==0){
            System.out.println("Divisible by 5.");
        }else{
            System.out.println("Not Divisible by 5!");
        }
        sc.close();
    }
}
