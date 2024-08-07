// Create a class Student with Roll_No ,Name and Mobile_No as data member. Use
// necessary method to initialize it and to print. Create at least 5 student. (Use
// array of object).
class Student{
    int Roll_No;
    String Name;
    int Mobile_No;
    Student(int Roll_No, String Name, int Mobile_No){
        this.Roll_No = Roll_No;
        this.Name = Name;
        this.Mobile_No = Mobile_No;
    }
}
public class a1 {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        s[0] = new Student(1, "Rahul", 123456789);
        s[1] = new Student(2, "Rohan", 123456789);
        s[2] = new Student(3, "xyz", 123456789);
        s[3] = new Student(4, "abc", 123456789);
        s[4] = new Student(5, "pqr", 123456789);
    }
}
