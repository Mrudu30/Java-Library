public class test {
    public static void main(String args[]){
        int a[] = {5,1,15,20,25};
        int i,j,m;
        i = ++a[1];
        j = a[1]++;
        m=a[i++];
        System.out.println(i+","+j+","+m);
    }
}