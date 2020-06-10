import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.printf("Строка: ");
        String text = v.nextLine();
        if (text.indexOf("_") != -1) {
            System.out.printf("toCamelCase: %s\n", toCamelCase(text));
        }
        else {
            System.out.printf("toSnakeCase: %s\n", toSnakeCase(text));
        }
    }

    public static String toCamelCase(String text) {
        char[] chars = text.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (String.valueOf(chars[i]).equals("_")) {
                chars[i+1] = Character.toUpperCase(chars[i + 1]);
                continue;
            }
            result += String.valueOf(chars[i]);
        }
        return result;
    }

    public static String toSnakeCase(String text) {
        char[] chars = text.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (Character.toUpperCase(chars[i]) == chars[i]) {
                result += "_";
                chars[i] = Character.toLowerCase(chars[i]);
            }
            result += String.valueOf(chars[i]);
        }
        return result;
    }
}
