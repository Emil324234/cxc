import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        try {
            System.out.println("Введите три стороны треугольника: a, b и c: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите целые числа.");
            scanner.nextLine();
        }

        if (PryamougolniyTreygolnik(a, b, c)) {
            System.out.println("прямоугольный треугольник");
        } else if (RavnostoronniyTreygolnik(a, b, c)) {
            System.out.println("равносторонний треугольник");
        } else if (RavnobedrenniyTreygolnik(a, b, c)) {
            System.out.println("равнобедренный треугольник");
        } else if (Treygolnik(a, b, c)) {
            System.out.println("такого треугольника не существует");
        } else {
            System.out.println("обычный треугольник");
        }
    }

    public static boolean PryamougolniyTreygolnik(int a, int b, int c) {
        return a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b;
    }

    public static boolean RavnobedrenniyTreygolnik(int a, int b, int c) {
        return (a == b && a != c) || (b == c && b != a) || (c == a && c != b);
    }

    public static boolean RavnostoronniyTreygolnik(int a, int b, int c) {
        return a == b && b == c;
    }

    public static boolean Treygolnik(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }
}
