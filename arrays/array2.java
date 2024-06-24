package arrays;
import java.util.*;

public class array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        System.out.println("Enter the Numbers in Array");
        int numbers[] = new int[size];

        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+",");
        }
        sc.close();
    }
}
