
import java.util.Scanner;

// Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the esult. The formula for the conversion is as follows: fahrenheit = (9 / 5) * celsius + 32.
public class q74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temprature in degree Celcius:");
        double celsius = sc.nextDouble();
        double fahrenheit = ((9 / 5) * celsius) + 32;
        System.out.println("Temprature in degree Fahrenheit: "+fahrenheit);
        sc.close();
    }
}
