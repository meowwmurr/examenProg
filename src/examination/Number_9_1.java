package examination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number_9_1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 5, -1, 0, 5, 3);
        System.out.println(sumNumbers(list));
    }

    public static List<Integer> sumNumbers(List<Integer> nums) {
        int last = 0, s = 0, k = 0;
        List<Integer> sum = new ArrayList<>();
        for(int value : nums) {
            if(value <= 0 || k == 0 || last <= 0) {
                k++;
                last = value;
                continue;
            }
            sum.add(last + value);
            last = value;
        }
        return sum;
    }
}
