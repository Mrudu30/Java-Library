import java.util.*;
public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int column = 3;

        // matrix 1
        int[][] matrix1 = new int[row][column];
        for(int i=0;i<row; i++){
            for(int j=0;j<column; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        // matrix 2
        int[][] matrix2 = new int[row][column];
        for(int i=0;i<row; i++){
            for(int j=0;j<column; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        // multiplication logic
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                for (int k=0; k<column; k++){

                }
            }
        }

        sc.close();
    }
}
