// Write a Java program to find area and perimeter of a circle having radious=5
// units using class Circle.
class Circle{
    double radius;
    public Double area(){
        return Math.PI*radius*radius;
    }
    public Double perimeter(){
        return 2*Math.PI*radius;
    }
}
public class q31 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.radius=5;
        System.out.println("Area of circle is "+c.area()+" and perimeter is "+c.perimeter());
    }
}
