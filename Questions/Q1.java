import java.util.*;
// Enter 3 numbers from the user & make a function to print their average.
public class Q1 {
    public static void calculateAverage(int a, int b, int c){
        float average = (a+b+c)/3;
        System.out.print("Your Average Is:");
        System.out.println(average);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number");
        int c = sc.nextInt();
        calculateAverage(a,b,c);
        sc.close();
    }
}
