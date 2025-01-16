package examination;

public class Number_5_4 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 6, 4, 13, 8, 10, 2, 9};
        System.out.println(sumSimpleNumbers(numbers));
    }

    public static boolean isSimpleNumber(int n) {
        if(n == 1){return true;}
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int sumSimpleNumbers(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            if(isSimpleNumber(a[i])){
                sum += a[i];
            }
        }
        return sum;
    }
}
