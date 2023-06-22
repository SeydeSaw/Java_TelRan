package homework._2023_06_20;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};

        // 1. Вычислить сумму всех элементов в массиве и вывести результат
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Сумма всех элементов: " + sum);

        // 2. Найти наименьший и наибольший элементы в массиве и вывести их
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Наименьший элемент: " + min);
        System.out.println("Наибольший элемент: " + max);

        // 3. Подсчитать количество четных элементов в массиве и вывести результат
        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Количество четных элементов: " + evenCount);

        // 4. Отсортировать массив в порядке убывания и вывести отсортированный массив
        Arrays.sort(arr);
        System.out.println("Отсортированный массив (по возрастанию): " + Arrays.toString(arr));

        // 5. Подсчитать сумму квадратов всех элементов в массиве и вывести результат
        int sumOfSquares = 0;
        for (int num : arr) {
            sumOfSquares += num * num;
        }
        System.out.println("Сумма квадратов всех элементов: " + sumOfSquares);
    }
}
