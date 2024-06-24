// Write a program to check given digit is an odd or even using simple if statement 103 also same

import java.util.Scanner;

public class q88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("Number is Even!");
        }else{
            System.out.println("Number is Odd!");
        }
        sc.close();
    }
}