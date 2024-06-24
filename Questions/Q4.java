import java.util.*;
public class Q4 {
    // Write a function that takes in the radius as input and returns the circumference of a circle.
    public static void circumference(int r){
        if(r<=0){
            System.out.println("Radius should be greater than 0");
        }
        else{
            float circum = (2 * (22/7)) * r;
            System.out.print("The Circumference is: ");
            System.out.println(circum);
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        int a = sc.nextInt();
        circumference(a);
        sc.close();
    }
}
