package tasks;
/*
// TODO: 14.06.23
       Напишите программу, которая принимает на вход две строки и проверяет,
       является ли одна строка перестановкой другой строки.
 */
import java.util.Arrays;
import java.util.Scanner;

public class PermutationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();

        if (isPermutation(str1, str2)) {
            System.out.println("Одна строка является перестановкой другой строки.");
        } else {
            System.out.println("Строки не являются перестановками друг друга.");
        }
    }

    public static boolean isPermutation(String str1, String str2) {
        // Проверяем, являются ли строки одинаковой длины
        if (str1.length() != str2.length()) {
            return false;
        }

        // Преобразуем строки в массивы символов и сортируем их
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Сравниваем отсортированные массивы
        return Arrays.equals(charArray1, charArray2);
    }
}