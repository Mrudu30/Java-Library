// basic take and print
// import java.util.*;
// public class scanner{
//     public static void main(String[] agrs){
//         Scanner a = new Scanner(System.in);
//         Scanner b = new Scanner(System.in);
//         int vara = a.nextInt();
//         int varb = b.nextInt();
//         int sum = vara + varb;   
//         System.out.print("The sum of two numbers is:");
//         System.out.println(sum);
//     }
// }

// ----------------------------------------------------
// gets the print statement and then input number
import java.util.*;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number A:");
        int vara = scanner.nextInt();

        System.out.println("Input Number B:");
        int varb = scanner.nextInt();

        int sum = vara + varb;

        System.out.print("The sum of the two numbers is: ");
        System.out.println(sum);
    }
}
