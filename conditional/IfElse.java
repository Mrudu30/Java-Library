// import java.util.*;
// public class IfElse{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Age:");
//         int age=sc.nextInt();
//         if(age<=10){
//             System.out.println("You are a Child");
//         }
//         else if(10<age && age<18){
//             System.out.println("You are a Teenager");
//         }
//         else{
//             System.out.println("You are an Adult");
//         }
//     }
// }
import java.util.*;
public class IfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A:");
        int a=sc.nextInt();
        System.out.println("Enter number B:");
        int b = sc.nextInt(); 
        if(a<b){
            System.out.println("B is greater than A.");
        }
        else if(b<a){
            System.out.println("A is greater than B.");
        }
        else{
            System.out.println("A and B are equal.");
        }
    }
}