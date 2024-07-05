// W.A.P.to checK whether entered number is positive nagative or zero by using
// else....if ladder.

import java.util.Scanner;

public class q119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any number:");
        int number = sc.nextInt();
        if (number>0){
            System.out.println("This is a Positive Number.");
        }else if(number<0){
            System.out.println("This is a Negative Number.");
        }else{
            System.out.println("This number is Zero.");
        }
        sc.close();
    }
}
