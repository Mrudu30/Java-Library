// Write a Java program to check whether a number given by user is Armstrong or
// not using class

import java.util.Scanner;

class Armstrong{
    void armstrong(int num){
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;
        int originalNumber = num;
        while(num > 0){
            int digit = num % 10;
            sum += Math.pow(digit,numberOfDigits);
            num /= 10;
        }
        if (originalNumber==sum){
            System.out.println("The number is an Armstrong number");
        }else{
            System.out.println("The number is not an Armstrong number");
        }
    }
}

public class q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Armstrong obj = new Armstrong();
        obj.armstrong(num);
        sc.close();
    }
}
