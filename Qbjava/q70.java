// WAP to calculate the Area of a Circle, Area and Perimeter of rectangle, Area of Triangle.
import java.util.Scanner;

public class q70 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option for shape:\n1.Circle\n2.Rectangle\n3.Triangle");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Enter Radius:");
                int radius = sc.nextInt();
                float pi = 22/7;
                float perimeterc = 2* radius *pi;
                float areac = radius*radius*pi;
                System.out.println("Perimeter:"+perimeterc+"\nArea:"+areac);
                break;
            case 2:
                System.out.println("Enter Breadth:");
                int b = sc.nextInt();
                System.out.println("Enter Length:");
                int l = sc.nextInt();
                float perimeterr = 2 * (l + b);
                float arear = l*b;
                System.out.println("Perimeter:"+perimeterr+"\nArea:"+arear);
                break;
            case 3:
                System.out.println("Enter Base:");
                int base = sc.nextInt();
                System.out.println("Enter Height:");
                int height = sc.nextInt();
                float areat = (base * height) / 2;
                System.out.println("Area:" + areat);
                break;

            default:
                System.out.println("Enter only 1, 2 or 3.");
                break;
        }
        sc.close();
    }
}
