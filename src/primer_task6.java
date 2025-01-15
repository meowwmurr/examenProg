import java.util.Scanner;

public class primer_task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите x: ");
        double x = scanner.nextDouble();

        System.out.print("введите n: ");
        int n = scanner.nextInt();

        System.out.print("введите e: ");
        double e = scanner.nextDouble();

        System.out.println("сумма n членов: " + f1(x, n));
        System.out.println("сумма членов > e: " + f2(x, e));
        System.out.println("сумма членов > e/10: " + f2(x, e / 10));
        System.out.println("значение ch(x): " + Math.cosh(x));
    }

    public static double f1(double x, int n) {
        double sum = 0;
        double slag = 1;
        for (int i = 1; i <= n; i++) {
            sum += slag;
            slag = slag * (x * x) / (2 * i * (2 * i - 1));
        }
        return sum;
    }

    public static double f2(double x, double e) {
        double sum = 0;
        double slag = 1;
        int i = 1;

        while (Math.abs(slag) > e) {
            sum += slag;
            slag = slag * (x * x) / (2 * i * (2 * i - 1));
            i++;
        }
        return sum;
    }
}
