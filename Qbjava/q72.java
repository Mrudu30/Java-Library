// WAP to enter three subject marks, and calculate total, percentage of student and display the same in proper format

import java.util.Scanner;

public class q72 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Marks of the exam:");
        int out_of = sc.nextInt();
        System.out.println("Enter Marks of English:");
        float eng = sc.nextFloat();
        System.out.println("Enter Marks of Maths:");
        float math = sc.nextFloat();
        System.out.println("Enter Marks of Science:");
        float sci = sc.nextFloat();
        float total = eng+math+sci;
        float percentage = (total/(3*out_of))*100;
        System.out.println("Total Marks Achieved: "+total+"\nPercentage Achieved: "+percentage+"%");
        sc.close();
    }
}
