package stringObject;

public class s1 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // to see the character at that index.
        System.out.println(sb.charAt(0));

        // set charAt index.
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert a character at a certain index.
        sb.insert(0, 'S');
        System.out.println(sb);

        //delete a char at certain index to a certain index
        // it can delete a substring as well
        // the end index is non inclusive.
        sb.delete(0, 1);
        System.out.println(sb);

        // append in the str builder
        sb.append('y');
        System.out.println(sb);

        // print length
        System.out.println(sb.length());
    }
}
