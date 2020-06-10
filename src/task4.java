import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.printf("Начало ");
        double start = Double.parseDouble(v.nextLine());
        System.out.printf("Конец ");
        double end = Double.parseDouble(v.nextLine());
        System.out.printf("Зарплата ");
        double salary = Double.parseDouble(v.nextLine());
        System.out.printf("Зарлата за сверхурочные ");
        double overtimeSalary = Double.parseDouble(v.nextLine());
        System.out.println(overtime(start, end, salary, overtimeSalary));
    }


    public static String overtime(double start, double end, double salary, double overtimeSalary) {
        String money = "$";
        if (end > 17) return money + String.valueOf((17 - start) * salary + (end - 17) * salary * overtimeSalary);
        return money + String.valueOf((end-start) * salary);
    }
}
