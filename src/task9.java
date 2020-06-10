import java.util.*;

public class task9 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.printf("Первое число: ");
        String a = v.nextLine();
        System.out.printf("Второе число: ");
        String b = v.nextLine();
        System.out.println(trouble(a, b));
    }

    public static boolean trouble(String a, String b) {
        int count1 = 0;
        int count2 = 0;
        String currentChar = "";
        for (int i = 0; i < a.length() - 1; i++) {
            currentChar = String.valueOf(a.charAt(i));
            if (currentChar.equals(String.valueOf(a.charAt(i + 1)))) count1++;
            else count1 = 0;
            if (count1 == 2) {
                count2 = 0;
                for (int j = 0; j < b.length(); j++) {
                    if (currentChar.equals(String.valueOf(b.charAt(j)))) count2++;
                    else count2 = 0;
                    if (count2 == 2) return true;
                }
            }
        }
        return false;
    }
}