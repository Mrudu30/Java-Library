// Design a class named Fan to represent a fan. The class contains:
// - Three constants named SLOW, MEDIUM and FAST with values 1, 2 and 3 to denote the
// fan speed. - An int data field named speed that specifies the speed of the fan (default
// SLOW). - A boolean data field named f_on that specifies whether the fan is on (default
// false). - A double data field named radius that specifies the radius of the fan (default 4). - A
// data field named color that specifies the color of the fan (default blue).
// - A no-arg method that creates a default fan.
// - A parameterized method initializes the fan objects to given values.
// - A method named display() will display description for the fan. If the fan is on, the
// display() method displays speed, color and radius. If the fan is not on, the method returns
// fan color and radius along with the message “fan is off”. Write a test program that creates
// two Fan objects. One with default values and the other with medium speed, radius 6,
// color brown, and turned on status true. Display the descriptions for two created Fan
// objects.

class Fan{
    int Slow = 1;
    int Medium = 2;
    int Fast = 3;
    int speed = Slow;
    boolean f_on = false;
    double radius = 4;
    String color = "blue";
    Fan(){
        int speed = Slow;
        boolean f_on = false;
        double radius = 4;
        String color = "blue";
    }
    Fan(int speed, boolean f_on, double radius, String color){
        this.speed = speed;
        this.f_on = f_on;
        this.radius = radius;
        this.color = color;
    }
    void display(){
        if(f_on == true){
            System.out.println("Speed: " + speed + "\nColor: " + color + "\nRadius: "+ radius);
        }else{
            System.out.println("The Fan is Off"+"\nColor: " + color + "\nRadius: "+ radius);
        }
    }
}
public class q39{
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(2, true, 6, "brown");
        fan1.display();
        fan2.display();
    }
}