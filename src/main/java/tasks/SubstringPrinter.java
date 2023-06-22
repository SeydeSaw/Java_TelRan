package tasks;
/*
// TODO: 14.06.23
       Напишите программу, которая принимает на вход строку
       и выводит все подстроки этой строки.
 */
import java.util.Scanner;

public class SubstringPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        System.out.println("Подстроки строки \"" + input + "\":");
        printSubstrings(input);
    }

    public static void printSubstrings(String str) {
        int n = str.length();

        // Генерация всех подстрок
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}