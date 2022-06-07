import java.util.*;

public class vowelsToEnd {

    public static void main(String[] args) {
        System.out.println(vowelsToEnd("giorgio"));
    }

    //Building Java Programs, 5th Edition exercise 12.15 solution
    public static String vowelsToEnd(String s) {
        return vowelsToEnd(s, s.length() - 1);
    }

    public static String vowelsToEnd(String s, int index) {
        if (index == 0) return s;
        List<Character> vowels = new LinkedList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        if (vowels.contains(s.charAt(index))) {
            if (index == s.length() - 1) {
                return vowelsToEnd(s, index - 1);
            } else {
                char c = s.charAt(index);
                s = s.substring(0, index) + s.substring(index + 1, s.length());
                s += c;
                return vowelsToEnd(s, index - 1);
            }
        } else {
            return vowelsToEnd(s, index - 1);
        }
    }
}
