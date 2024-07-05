// WAP to perform addition, multiplication, subtraction and division according to
// user choice using else if ladder.

import java.util.Scanner;

public class q118 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice of operation:\n 1. Addition\n 2. Subtraction \n 3. Division\n 4. Multiplication\n");
        int choice = sc.nextInt();
        System.out.println("Enter value of A:");
        int a = sc.nextInt();
        System.out.println("Enter value of B:");
        int b = sc.nextInt();
        if (choice==1){
            System.out.println("The sum of variables is:"+(a+b));
        }else if(choice == 2){
            System.out.println("The difference of variables is:"+(a-b));
        }else if(choice == 3){
            System.out.println("The division of variables is:"+(a/b));
        }else if (choice == 4){
            System.out.println("The product of variables is:"+(a*b));
        }else{
            System.out.println("Make a Choice from above options only!!");
        }
        sc.close();
    }
}
