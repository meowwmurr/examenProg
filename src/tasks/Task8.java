package tasks;

public class Task8 {
    public static void main(String[] args) {
        int[][] matrix = {
                {  1,   2,  -3,   4,   5 },
                {  6,  -7,   8,   9,  10 },
                { -11, 12, -13,  14,  15 }
        };

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        swap(matrix);

        System.out.println("\nПосле переноса всех столбцов с суммой < 0 в конец:");
        printMatrix(matrix);
    }

    /**
     * Находит все столбцы с суммой < 0,
     * переставляет их в "хвост" матрицы,
     * сохраняя взаимный порядок как
     * "сначала все столбцы с sum >= 0 (в исходном порядке),
     *  затем все столбцы с sum < 0 (в исходном порядке)".
     */
    public static void swap(int[][] matrix) {

        // Подсчитаем сумму каждого столбца
        int[] colSums = new int[matrix[0].length];
        for (int col = 0; col < matrix[0].length; col++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][col];
            }
            colSums[col] = sum;
        }

        // Разделим индексы столбцов на 2 группы: A (sum >= 0), B (sum < 0)
        int[] groupA = new int[matrix[0].length];
        int[] groupB = new int[matrix[0].length];
        int aCount = 0, bCount = 0;

        for (int col = 0; col < matrix[0].length; col++) {
            if (colSums[col] >= 0) {
                groupA[aCount++] = col;
            } else {
                groupB[bCount++] = col;
            }
        }

        // Новый порядок столбцов: сначала A, затем B
        int[] newOrder = new int[matrix[0].length];
        System.arraycopy(groupA, 0, newOrder, 0, aCount);
        System.arraycopy(groupB, 0, newOrder, aCount, bCount);

        // Создадим новую матрицу тех же размеров
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        // Заполним newMatrix, кладя столбцы в порядке newOrder
        for (int newColIndex = 0; newColIndex < matrix[0].length; newColIndex++) {
            // "Старый" индекс столбца
            int oldColIndex = newOrder[newColIndex];
            // Копируем столбец oldColIndex -> newColIndex
            for (int i = 0; i < matrix.length; i++) {
                newMatrix[i][newColIndex] = matrix[i][oldColIndex];
            }
        }

        // Переписываем newMatrix обратно в matrix
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(newMatrix[i], 0, matrix[i], 0, matrix[0].length);
        }
    }

    // Печать матрицы
    public static void printMatrix(int[][] matrix) {
        for (int[] i : matrix) {
            for (int val : i) {
                System.out.printf("%5d", val);
            }
            System.out.println();
        }
    }
}
