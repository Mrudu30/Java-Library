// Write a program that prompts the user to enter a two numbers using commandline argument & find maximum number using ternary operator.

import java.util.Scanner;

public class q78 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = sc.nextInt();
        System.out.println("Enter B:");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("A is greater than B");
        }else{
            System.out.println("B is greater than A");
        }
        sc.close();
    }
}