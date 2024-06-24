package arrays;

public class array1 {
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0] = 23;
        marks[1] = 34;
        marks[2] = 45;
        // print array : output: [I@15d9bc04
        System.out.println(marks);

        // this correctly prints the values of each index
        for(int i = 0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
