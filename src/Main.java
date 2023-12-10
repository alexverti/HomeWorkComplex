import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое комплексное число ");
        System.out.println("a = ");
        int first = scanner.nextInt();
        System.out.println("b = ");
        int second = scanner.nextInt();
        Complex complex1 = new Complex(first, second);
        System.out.println("Введите второе компексное число: ");
        System.out.println("a = ");
        int third = scanner.nextInt();
        System.out.println("b = ");
        int fourth = scanner.nextInt();
        Complex complex2 = new Complex(third, fourth);

        System.out.println("Первое комплексное число:" + complex1.toString());
        System.out.println("Второе комплексное число:" + complex2.toString());

        System.out.println("Результат сравнения: " + Complex.equals(complex1, complex2));
        System.out.println("Результат сложения: " + Complex.sum(complex1, complex2));
        System.out.println("Результат вычитания: " + Complex.sub(complex1, complex2));
        System.out.println("Реультат умножения: " + Complex.mult(complex1, complex2));
    }

}