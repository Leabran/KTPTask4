import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task8 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.printf("Первая строка: ");
        String a = v.nextLine();
        System.out.printf("Вторая строка: ");
        String b = v.nextLine();
        System.out.println(doesRhyme(a, b));
    }

    public static boolean doesRhyme(String a, String b) {
        String[] words1 = a.split(" ");
        String word1 = words1[words1.length - 1];
        String[] words2 = b.split(" ");
        String word2 = words2[words2.length - 1];
        String vowels = "EeAaUuIiOoYy";
        List<String> first = new ArrayList<String>();
        List<String> second = new ArrayList<String>();
        boolean equal = true;
        for (char ch: vowels.toCharArray()) {
            String c = String.valueOf(ch);
            if (word1.indexOf(c) != -1) {
                first.add(c.toLowerCase());
            }
            if (word2.indexOf(c) != -1) {
                second.add(c.toLowerCase());
            }
        }
        if (first.size() != second.size()) return false;
        for (int i = 0; i < first.size(); i++) {
            if (equal) {
                equal = false;
                for (int j = 0; j < second.size(); j++) {
                    if (second.get(j).equals(first.get(i))) equal = true;
                }
            }
        }
        System.out.printf("Первая: %s, Вторая: %s\n", first, second);
        return equal;
    }
}