// Write a program that displays the area and perimeter of a circle that has a radius of 5 using the following formula: perimeter = 2 * radius * pi area = radius *radius * pi

public class q69 {
    public static void main(String[] args){
        int radius = 5;
        float pi = 22/7;
        float perimeter = 2* radius *pi;
        float area = radius*radius*pi;
        System.out.println("Perimeter:"+perimeter+"\nArea:"+area);
    }
}