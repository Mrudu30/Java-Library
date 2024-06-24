import java.util.*;
// take a matrix as an input from the user. search for a given number x and print the indices at which it occurs
public class arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();
        int[][] numbers = new int [rows][columns];
        for(int i = 0;i<rows;i++){
            for(int j =0;j<columns;j++){
                System.out.println("Enter Input for element: "+i+"X"+j);
                numbers [i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number to find:");
        int x = sc.nextInt();
        for(int i = 0;i<rows;i++){
            for(int j =0;j<columns;j++){
                if(numbers[i][j]==x){
                    System.out.println("Number you entered is at: "+i+"X"+j);
                }
            }
        }
        sc.close();
    }
}
