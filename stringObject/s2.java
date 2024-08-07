package stringObject;

public class s2 {
    public static void main(String[] args) {
        String s1="Hello";
        // get substring
        String s2=s1.substring(2,5);
        System.out.println(s2);

        // till end substring
        String s3=s1.substring(2,s1.length());
        System.out.println(s3);
    }
}
