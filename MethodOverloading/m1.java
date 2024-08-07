// Write a program which asks user to choose one option to find area using
// method overloading.
// 1. To calculate area of circle
// 2. To calculate area of rectangle
// 3. To calculate area of triangle
// Methods to find area of circle,area of rectangle & area of triangle should be
// named as "area".

class AreaCalculation{
    public void area(int radius){
        double area = 3.14*radius*radius;
        System.out.println("Area of circle is "+area);
    }
    public void area(int length,int breadth){
        double area = length*breadth;
        System.out.println("Area of rectangle is "+area);
    }
    public void area(double base, double height){
        double area = 0.5*base*height;
        System.out.println("Area of triangle is "+area);
    }
}

public class m1 {
    public static void main(String[] args) {
        AreaCalculation obj = new AreaCalculation();
        obj.area(5);
        obj.area(5, 6);
        obj.area(6.0, 7.0);
    }
}
