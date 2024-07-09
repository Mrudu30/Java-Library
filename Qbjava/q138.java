// WAP to enter a character and check whether it is a vowel or consonant using
// switch statement

import java.util.*;

public class q138{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        char alphabet = sc.next().charAt(0);
        switch(alphabet){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The entered alphabet is a vowel");
                break;
            default:
                System.out.println("The entered alphabet is a consonant");
                break;
        }
    }
}