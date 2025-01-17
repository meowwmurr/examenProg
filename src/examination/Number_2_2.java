package examination;

import java.util.Scanner;

public class Number_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printSequence(num);
    }

    public static void printSequence(int n){
        for(int i = 1;i <= n;i++){
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += i + j;
            }
            if (i == n) {
                System.out.print(sum);
            } else {
                System.out.print(sum + ", ");
            }
        }
    }
}
