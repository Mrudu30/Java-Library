// Write a Java program to count digits of an integer number given by user using
// class.
class Count {
    public int countDigits(int num) {
        int count = 0;
        if (num == 0) { // Special case for zero
            return 1;
        }
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}

public class q32 {
    public static void main(String[] args) {
        Count obj = new Count();
        int num = 12345;
        System.out.println("Number of digits in " + num + " is " + obj.countDigits(num));
    }
}
