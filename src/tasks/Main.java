package tasks;

import java.util.Scanner;

public class Main {
    public static final DefParabol P1 = new DefParabol(1, 4.5, 0.5); //ЗАДАЁМ ЗНАЧЕНИЯ ДЛЯ ГРАФИКОВ
    public static final DefParabol P2 = new DefParabol(-8, 22, 1);
    public static final Circle C1 = new Circle(5, 0, 2.5);
    public static final Circle C2 = new Circle(-7, -4, 2);
    public static final Rectangle R = new Rectangle();
    public static final Picture picture = new Picture(P1, P2, C1, C2, R);

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