package task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Double>> outList = new ArrayList<>();

        while (true) {
            System.out.print("Введите число N точек (min 3): ");
            int N = scanner.nextInt();

            if (N < 3) {
                System.out.println("Вы ввели некорректное число N");
            } else {
                cinArr(outList, N, scanner);
                System.out.println();
                cout(outList);
                break;
            }
        }
    }

    public static void cinArr(ArrayList<ArrayList<Double>> arr, int n, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + " пару координат: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            ArrayList<Double> inList = new ArrayList<>();
            inList.add(x);
            inList.add(y);
            arr.add(inList);
        }
    }

    public static void cout(ArrayList<ArrayList<Double>> arr) {
        double maxArea = 0;
        ArrayList<ArrayList<Double>> maxDots = new ArrayList<>();

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = i + 1; j < arr.size() - 1; j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    TriangleArray T = new TriangleArray(arr.get(i), arr.get(j), arr.get(k));
                    double area = T.getTriangleArea();

                    if (area > maxArea) {
                        maxDots.clear();
                        maxDots.add(arr.get(i)); // Глубокое копирование
                        maxDots.add(arr.get(j));
                        maxDots.add(arr.get(k));
                        maxArea = area;
                    }
                }
            }
        }

        if (maxDots.isEmpty()) {
            System.out.println("Лист пуст");
            return;
        }
        System.out.println("Точки с наибольшей площадью треугольника:");
        System.out.println("Точки: " + maxDots.get(0) + ", " + maxDots.get(1) + ", " + maxDots.get(2));
        System.out.println("Площадь -> " + maxArea);
    }
}


