// Create a program that implements a calculator with overloaded methods for
// addition, subtraction, multiplication, and division.
// The calculator should have methods like calculate(int a, int b), calculate(double
// a, double b), and so on to perform the respective operations based on the data
// types of the input parameters.
package MethodOverloading;

class Calculator{
    public int calculate(int a, int b){
        return a+b;
    }
    public double calculate(double a, double b){
        return a/b;
    }
    public double calculate(double a, int b){
        return a*b;
    }
    public double calculate(int a, double b){
        return a-b;
    }
}

public class m2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.calculate(10, 20));
        System.out.println(c.calculate(10.0, 20.0));
        System.out.println(c.calculate(10.0, 20));
        System.out.println(c.calculate(10, 20.0));
    }
}
