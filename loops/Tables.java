import java.util.*;
public class Tables{
    public static void main(String[] args){
        // print table of the input user gives
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter a number to see its table : ");
        int n = sc.nextInt();
        for(int i=0;i<11;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}