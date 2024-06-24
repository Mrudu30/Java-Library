package stringObject;

public class reverseString {
    public static void main(String[] args){
        // string can be imagined as an array.
        // so if we take hello it would be like 0=h, 1=e, etc.
        // so a reverse string should be: olleh
        // put front element to back and back element to the front.
        // it should be done for a half string so the other will be done on its own

        StringBuilder str = new StringBuilder("hello");
        for (int i=0; i<str.length()/2; i++){
            int front = i;
            int back = str.length()-1 -i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);
    }
}
