package homework._2023_06_20;

public class DoubleArrayExample {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 1. Посчитать сумму всех элементов во всем массиве
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("Сумма всех элементов во всем массиве: " + sum);

        // 2. Найти максимальное значение в каждой строке и вывести его
        for (int[] row : matrix) {
            int max = row[0];
            for (int i = 1; i < row.length; i++) {
                if (row[i] > max) {
                    max = row[i];
                }
            }
            System.out.println("Максимальное значение в строке: " + max);
        }

        // 3. Найти среднее значение элементов в каждом столбце и вывести его
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int j = 0; j < cols; j++) {
            int sumColumn = 0;
            for (int i = 0; i < rows; i++) {
                sumColumn += matrix[i][j];
            }
            double average = (double) sumColumn / rows;
            System.out.println("Среднее значение в столбце " + j + ": " + average);
        }

        // 4. Посчитать количество элементов, кратных заданному числу, во всем массиве
        int targetNumber = 3;
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num % targetNumber == 0) {
                    count++;
                }
            }
        }
        System.out.println("Количество элементов, кратных " + targetNumber + ": " + count);

        // 5. Найти сумму элементов только в нечетных строках массива
        int sumOddRows = 0;
        for (int i = 0; i < rows; i++) {
            if (i % 2 != 0) {
                for (int num : matrix[i]) {
                    sumOddRows += num;
                }
            }
        }
        System.out.println("Сумма элементов в нечетных строках массива: " + sumOddRows);
    }
}
