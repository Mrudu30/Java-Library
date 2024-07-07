import java.util.*;
// public class Buttons{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         if (button==1){
//             System.out.println("Hello.");
//         }
//         else if(button==2){
//             System.out.println("Namaste.");
//         }
//         else if(button==3){
//             System.out.println("Bonjour.");
//         }
//         else{
//             System.out.println("Invalid Button.");
//         }
//     }
// }

// ------------ Through Switch ----------------
public class Buttons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. English\n2. Hindi\n3. French\n");
        System.out.println("Enter Number For Your Language:");
        int lang = sc.nextInt();
        switch(lang) {
            case 1: System.out.println("Hello.");
            break;
            case 2: System.out.println("Namaste.");
            break;
            case 3: System.out.println("Bonjour.");
            break;
            default: System.out.println("Wrong Input!!");
            break;
        }
    }
}