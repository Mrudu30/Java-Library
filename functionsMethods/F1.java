import java.util.*;
public class F1 {
    public static void printMyName(String name){
        System.out.print("The name you entered is: ");
        System.out.println(name);
        return;
    }
    public static void main(String args[]) {
        // print given name in function
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
        sc.close();
    }
}
