// public WAP by using else if ladder to print grade of a student using following rules :
// Percentage >70 means Grade A
// Percentage 60-70 means Grade B
// Percentage 50-60 means Grade C
// Percentage <50 means Grade F

import java.util.*;
public class q117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage achieved:");
        double percentage = sc.nextDouble();
        if (percentage>70){
            System.out.println("Congratulations! You got Grade A.");
        }else if(percentage>60){
            System.out.println("You got Grade B.");
        }else if(percentage>50){
            System.out.println("You got Grade C.");
        }else{
            System.out.println("You got Grade F.");
        }
        sc.close();
    }
}
