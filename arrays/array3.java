package arrays;
import java.util.*;

public class array3 {
    // linear search algorithm
    // take an array as input from the user. search for a given number x and print the index at which it occurs
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // taking the array
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        System.out.println("Enter the Numbers in Array");
        int numbers[] = new int[size];

        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        // finding number
        System.out.println("Enter the number to find:");
        int x = sc.nextInt();
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] == x) {
                System.out.println("The Number index is: "+i);
            }
        }

        sc.close();
    }
}
