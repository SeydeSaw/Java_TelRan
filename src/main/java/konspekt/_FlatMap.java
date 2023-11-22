package konspekt;

import java.util.Arrays;
import java.util.List;

/*

 */
public class _FlatMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Anna","Irina","Vadim");
        List<String> words1 = words.stream()
                .flatMap(str -> Arrays.stream(str.split("")))// берём стрингу -> проваливаемся в наш массив,
                                                                    // опять вызываем стрим, передаём нашу стрингу и делим
                .toList();// собираем в лист
        System.out.println(words1);// вывод: [A, n, n, a, I, r, i, n, a, V, a, d, i, m]
    }
}
