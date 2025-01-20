package Ivan;

import java.util.Scanner;

public class Main {
    public static final Parabol P1 = new Parabol(-1, -3,-0.25); //ЗАДАЁМ ЗНАЧЕНИЯ ДЛЯ ГРАФИКОВ
    public static final Line L = new Line(-7, 2, -2.5);
    public static final Line L2 = new Line(0, -5, 0);
    public static final Picture picture = new Picture(P1,   L, L2);

    public static void main(String[] args) { //КРАСИВЫЙ ВЫВОД
        System.out.println("Введите две координаты точки в диапазоне от -10 до 10");
        double x = readCoordinates("X");
        double y = readCoordinates("Y");
        SimpleColor color = picture.getColor(x, y);
        printColor(x, y, color);
    }

    public static double readCoordinates(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ввод %s:", text);

        double cord;

        if (scanner.hasNextDouble()) {
            cord = scanner.nextDouble();
            if (cord > 10 || cord < -10) {
                System.out.println("Неверное значение! Вам нужно ввести число в диапазоне от -10 до 10! Попробуйте еще раз.");
                return readCoordinates(text);
            }
        } else {
            System.out.println("Неверное значение! Вам нужно ввести ЧИСЛО! Попробуйте еще раз.");
            return readCoordinates(text);
        }
        return cord;
    }

    static void printColor(double x, double y, SimpleColor color) {
        System.out.printf("(%s, %s) -> %s", x, y, color);
    }
}