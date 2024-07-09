// Write a Java program for the following:
// Accept any three-digit number from the user and display the message which
// digit is maximum using else-if ladder. Also swap second and third digit if the first
// digit is in a range of 0 to 5, calculate Average of first, second and third digit if the
// first digit is in a range of 6 to 9 using switch statement.

import java.util.*;
public class q142 {
    public static void main(String[] args) {
        int num, first, second, third, max, min, swap;
        double avg = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number: ");
        num = sc.nextInt();
        sc.close();
        first = num / 100;
        second = (num % 100) / 10;
        third = num % 10;
        if (first>second){
            if (first>third){
                max = first;
            }else{
                max = third;
            }
        }else{
            if (second>third){
                max = second;
            }else{
                max = third;
            }
        }
        System.out.println("Maximum Digit is:"+max);
        if(first<6){
            min = 0;
        }else{
            min = 1;
        }
        switch (min) {
            case 0:
                swap = third;
                third = second;
                second = swap;
                System.out.println("The New Number is:"+first+""+second+""+third);
                break;
            case 1:
                avg = (first+second+third)/3;
                System.out.println("The Average of the digits is:"+avg);
                break;

            default:
                break;
        }
    }
}