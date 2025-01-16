package examination;


public class Number_6_4 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 43, 2, 6},
                {11, 12, 12, -1},
                {20, 0, 3, 50},
                {10, 66, 2, 6},
                {-8, 21, 15, 84}
        };

    }

    public static int indexOf(int[][] m){
        for(int i = 0; i < m.length; i++){
            int k = 0;
            for(int j = 0; j < m[i].length; j++){
                if(findElement(m, m[i][j], i)){
                    k++;
                }
            }
            if(k == m[i].length){
                return i;
            }
        }
        return -1;
    }

    public static boolean findElement(int[][] m, int target, int indexOfStr){
        int k = 0;
        for(int i = 0; i < m.length; i++){
            if(i == indexOfStr){
                continue;
            }
                for(int j = 0; j < m[i].length; j++){
                    if(m[i][j] == target){
                        k++;
                    }
                }
        }
        return k == 0;
    }
}
