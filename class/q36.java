// Write a Java program to find nPr by using class.
class Permutation{
    void permutation(int n, int r){
        int n_fact = 1;
        int n_r_fact = 1;
        for(int i = 1; i <= n; i++){
            n_fact = n_fact * i;
        }
        for(int i = 1; i <= (n-r); i++){
            n_r_fact = n_r_fact * i;
        }
        System.out.println("The Permutation is:"+n_fact/n_r_fact);
    }
}
public class q36 {
    public static void main(String[] args) {
        Permutation p = new Permutation();
        p.permutation(10, 3);
    }
}
