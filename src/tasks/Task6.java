package tasks;

import java.util.Scanner;

public class Task6 {

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
        System.out.println("значение e^-x2: " + Math.exp(-(x * x)));
    }

    public static double f1(double x, int n) {
        double sum = 0.0;

        double sign = 1.0;      // (-1)^k
        double pow = 1.0;       // x^(2k)
        double factorial = 1.0; // k!

        // k=0
        sum += (sign * (pow / factorial)); // = 1

        for (int k = 1; k <= n; k++) {
            // Обновляем знак (-1)^k
            sign = -sign;

            // x^(2k) = x^(2(k-1)) * x^2
            pow = pow * (x * x);

            // k! = (k-1)! * k
            factorial = factorial * k;

            // Текущее слагаемое
            double term = sign * (pow / factorial);
            sum += term;
        }

        return sum;
    }

    public static double f2(double x, double e) {
        double sum = 0.0;

        // (-1)^k
        double sign = 1.0;
        // x^(2k)
        double pow = 1.0;
        // k!
        double factorial = 1.0;

        // Индекс члена ряда
        int kCount = 0;

        // Начальное слагаемое: T0 = 1
        double term = sign * (pow / factorial);

        // Пока модуль term > e, работаем
        while (Math.abs(term) > e) {
            // Прибавляем текущее слагаемое
            sum += term;

            // Переходим к следующему k => k+1
            kCount++;

            // (-1)^k: просто меняем знак
            sign = -sign;

            // x^(2k): домножаем на x^2
            pow *= (x * x);

            // k! = (k)! = (k-1)! * k,
            // но мы уже увеличили kCount, значит factorial *= kCount
            factorial *= kCount;

            // Теперь вычислим новый term = T_k
            term = sign * (pow / factorial);
        }

        return sum;
    }
    }

