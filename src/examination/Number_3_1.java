package examination;

import java.util.Scanner;

public class Number_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите нечётное h >=5: ");
        int H = sc.nextInt();
        while (H < 5 || H % 2 == 0) {
            System.out.println("Неверно набран h");
            System.out.print("Введите нечётное  h >=5: ");
            H = sc.nextInt();
        }
        printFigure(H);
    }

    public static void printFigure(int h){
        int half = h / 2;
        for (int k = 0; k < 2; k++) {
            System.out.print(" ");
            for (int i = 0; i <= half - 2; i++) { //верхняя крыша
                System.out.print("-");
            }
            System.out.println();
            for (int i = 0; i < half - 1; i++) { // стенки
                System.out.print("|");
                for (int j = 0; j <= half - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }
        System.out.print(" ");
        for (int i = 0; i <= half - 2; i++) { //верхняя крыша
            System.out.print("-");
        }
    }
}
