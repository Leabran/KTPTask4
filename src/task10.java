import java.util.*;

public class task10 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.printf("Строка: ");
        String string = v.nextLine();
        System.out.printf("Конец книги: ");
        Character bookend = v.nextLine().charAt(0);
        System.out.println(unique(string, bookend));
    }

    public static int unique(String book, Character end) {
        Map<Character, Boolean> chars = new HashMap<Character, Boolean>();
        boolean parse = false;
        for (char c: book.toCharArray()) {
            if (parse && c != end) chars.put(c, true);
            if (c == end) {
                if (parse) parse = false;
                else parse = true;
            }
        }
        System.out.println(chars);
        return chars.size();
    }
}
