package stringObject;
// qb 325: WAP to reverse the each word of user given string sentence.
public class s5 {
    public static void main(String[] args) {
        String s = "I am a good boy";
        String[] words = s.split(" ");
        String rev = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = reverse(word);
            rev = rev + revWord + " ";
        }
        System.out.println(rev);
    }
}
