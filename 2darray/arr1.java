import java.util.*;
public class arr1 {
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
        for(int i = 0;i<rows;i++){
            System.out.print("[ ");
            for(int j =0;j<columns;j++){
                System.out.print(numbers [i][j]+" ");
            }
            System.out.println("]");
        }
        sc.close();
    }
}
