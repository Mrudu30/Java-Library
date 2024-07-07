// print the pattern
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
public class P9{
    public static void main(String[] args){
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
}

// doing it by matrix number calculations we get to the conclusion
// addition of column and row index when even it is 1 in the place
// and when odd it in place is 0