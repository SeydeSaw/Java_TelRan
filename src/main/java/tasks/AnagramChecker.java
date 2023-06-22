package tasks;
/*
// TODO: 14.06.23
        Напишите программу, которая принимает на вход две строки и проверяет,
        являются ли они анаграммами (т.е. содержат ли они одинаковые символы в разном порядке).
 */
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Строки являются анаграммами.");
        } else {
            System.out.println("Строки не являются анаграммами.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        // Преобразуем строки в массивы символов и сортируем их
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Сравниваем отсортированные массивы
        return Arrays.equals(charArray1, charArray2);
    }
}