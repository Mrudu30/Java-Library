// Write a Java program to find product of all digits of an integer number given by
// user using class
class Product {
    public int multiplyDigits(int num) {
        int product = 1;
        int temp = 0;
        if (num == 0) { // Special case for zero
            return 1;
        }
        while (num != 0) {
            temp = num % 10;
            num /= 10;
            product*=temp;
        }
        return product;
    }
}
public class q33 {
    public static void main(String[] args) {
        Product obj = new Product();
        int num = 12345;
        System.out.println("Number of digits in " + num + " is " + obj.multiplyDigits(num));
    }
}
