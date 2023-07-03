package homework.hw_stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExpl {
    public static void main(String[] args) {
//          Дан список строк. Необходимо отфильтровать строки, длина которых больше 3 символов,
//          преобразовать их в верхний регистр, удалить повторяющиеся и вывести результат в отсортированном порядке.
            List<String> strings = Arrays.asList("apple", "banana", "dog", "apple", "cat");

            List<String> filteredAndTransformed = strings.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());//результат собирается обратно в список

            System.out.println("Task 1: " + filteredAndTransformed);

//          Дан список слов. Необходимо найти среднюю длину слов, начинающихся с буквы "A".
            List<String> words = Arrays.asList("apple", "banana", "dog", "Apple", "cat");

            double averageLength = words.stream()
                .filter(s -> s.startsWith("A"))
                .mapToInt(String::length)
                .average()
                .orElse(0.0);

            System.out.println("Task 2: " + averageLength);

//          Дан список слов. Необходимо сгруппировать их по длине и вывести результат.
            Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

            System.out.println("Task 3: " + groupedByLength);

//          Дан список чисел. Необходимо найти наименьшее число, больше 0.
            List<Integer> numbers = Arrays.asList(-3, 0, 5, -2, 10);

            int minPositiveNumber = numbers.stream()
                    .filter(n -> n >= 0)
                    .min(Integer::compareTo)
                    .orElse(-1);

            System.out.println("Task 4 : " + minPositiveNumber);

//          Дан список чисел. Необходимо найти сумму квадратов всех положительных чисел.
            int sumOfPositiveSquares = numbers.stream()
                    .filter(n -> n >= 0)
                    .mapToInt(n -> n * n)
                    .sum();

            System.out.println("Task 5 : " + sumOfPositiveSquares);

//          Даны два списка чисел. Необходимо объединить их в один список, отсортировать по убыванию и удалить повторяющиеся элементы.
            List<Integer> list1 = Arrays.asList(5, 2, 8, 3);
            List<Integer> list2 = Arrays.asList(7, 1, 6, 3);

            List<Integer> mergedAndSorted = new ArrayList<>();
            mergedAndSorted.addAll(list1);
            mergedAndSorted.addAll(list2);

            List<Integer> result = mergedAndSorted.stream()
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

            System.out.println("Task 6 : " + result);

//          Дан список строк. Необходимо оставить только уникальные символы из всех строк и вывести их в алфавитном порядке.
            String[] strings1 = {"ap", "ba", "dog", "Ape", "cat"};

            Set<Character> uniqueCharacters = Arrays.stream(strings1)
                .flatMapToInt(CharSequence::chars)
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toCollection(TreeSet::new));
            System.out.println("Task 7 : ");
            uniqueCharacters.forEach(System.out::print);
            System.out.println("");

//          Дан список чисел. Необходимо найти второе максимальное число.
            Optional<Integer> secondMax = numbers.stream()
                    .distinct() // Удаляем повторяющиеся числа
                    .max(Comparator.naturalOrder()) // Находим максимальное число
                    .flatMap(max -> numbers.stream()
                            .filter(num -> num < max) // Фильтруем числа меньше максимального
                            .max(Comparator.naturalOrder())) // Находим максимальное число среди оставшихся
                    .or(() -> Optional.empty()); // Обрабатываем случай отсутствия второго максимального числа

            if (secondMax.isPresent()) {
                    System.out.println("Task 8. Второе максимальное число: " + secondMax.get());
            } else {
                    System.out.println("Task 8. Второе максимальное число не найдено.");
            }

//          Дан список слов. Необходимо отфильтровать слова, состоящие только из букв, разделить их на гласные и согласные, и вывести результат.
            List<String> onlyLetters = words.stream()
                    .filter(word -> word.matches("[a-zA-Z]+")) // Отфильтровываем слова, состоящие только из букв
                    .collect(Collectors.toList());

            List<String> vowels = onlyLetters.stream()
                    .filter(word -> word.matches("[aeiouAEIOU]+")) // Отфильтровываем гласные слова
                    .collect(Collectors.toList());

            List<String> consonants = onlyLetters.stream()
                    .filter(word -> !word.matches("[aeiouAEIOU]+")) // Отфильтровываем согласные слова
                    .collect(Collectors.toList());

            System.out.println("Task 9. Гласные слова: " + vowels);
            System.out.println("Task 9. Согласные слова: " + consonants);

//          Дан список строк. Необходимо удалить пустые строки, объединить оставшиеся строки в одну строку, разделенную запятой.
            List<String> strings2 = Arrays.asList("", "fruit", "", "word", "", "animal", "");

            String result2 = strings2.stream()
                    .filter(str -> !str.isEmpty()) // фильтруем пустые строки
                    .collect(Collectors.joining(",")); // объединяем строки с использованием запятой

            System.out.println("Task 10 : " + result2);

//          Дан список слов. Необходимо объединить все символы из всех слов в одну строку.
            String result3 = words.stream()
                .flatMapToInt(CharSequence::chars) // преобразуем каждое слово в поток символов
                .mapToObj(ch -> String.valueOf((char) ch)) // преобразуем каждый символ в строку
                .collect(Collectors.joining()); // объединяем все символы в одну строку

            System.out.println("Task 11 : " + result3);

//          Дан список слов. Необходимо проверить, содержат ли они одинаковые символы (являются ли анаграммами) и вывести результат.
            List<String> words3 = Arrays.asList("listen", "silent", "hello", "world");

            Map<String, Long> charFrequencyMap = words3.stream()
                    .map(word -> word.toLowerCase().chars().sorted()
                            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString())
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            boolean hasAnagrams = charFrequencyMap.values().stream().anyMatch(count -> count > 1);

            if (hasAnagrams) {
                System.out.println("Task 12: Список содержит анаграммы");
            } else {
                System.out.println("Task 12: Список не содержит анаграмм");
            }

//          Даны два списка чисел. Необходимо найти разность множеств (элементы, присутствующие только в одном из списков) и вывести результат.
            List<Integer> numList1 = Arrays.asList(1,2,3);
            List<Integer> numList2 = Arrays.asList(3,4,5);

            List<Integer> difference = numList1.stream()
                    .filter(element -> !numList2.contains(element))
                    .collect(Collectors.toList());

            System.out.println("Task 13. Разность множеств:");
            difference.forEach(System.out::println);

//          Дан список слов. Необходимо подсчитать количество слов для каждой длины и вывести результат.
            Map<Integer, Long> lengthCountMap = words.stream()
                    .collect(Collectors.groupingBy(String::length, Collectors.counting()));

            System.out.println("Task 14. Количество слов для каждой длины:");
            lengthCountMap.forEach((length, count) -> System.out.println("Длина " + length + ": " + count));

//          Дан список строк. Необходимо отфильтровать строки, которые начинаются с префикса "pre" и заканчиваются суффиксом "post".
            List<String> strings4 = Arrays.asList("pretextpost", "preabcpost", "abcprepost", "pretext", "textpost");

            List<String> filteredStrings = strings4.stream()
                    .filter(str -> str.startsWith("pre") && str.endsWith("post"))
                    .collect(Collectors.toList());

            System.out.println("Task 15. Отфильтрованные строки:");
            filteredStrings.forEach(System.out::println);

//          Дан список слов. Необходимо подсчитать количество символов в каждом слове и вывести результат.
            Map<String, Integer> characterCountMap = words.stream()
                    .collect(Collectors.toMap(word -> word, String::length));

            System.out.println("Task 16. Количество символов в каждом слове:");
            characterCountMap.forEach((word, count) -> System.out.println(word + ": " + count));

//          Дан список чисел. Необходимо найти среднее значение всех уникальных чисел.
            double average = numbers.stream()
                    .distinct()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);

            System.out.println("Task 17. Среднее значение уникальных чисел: " + average);

//          Дан список слов. Необходимо найти самое длинное слово с четной длиной.
            Optional<String> longestEvenWord = words.stream()
                    .filter(word -> word.length() % 2 == 0)
                    .max(Comparator.comparingInt(String::length));

            if (longestEvenWord.isPresent()) {
                    System.out.println("Task 18. Самое длинное слово с четной длиной: " + longestEvenWord.get());
            } else {
                    System.out.println("Task 18. В списке нет слов с четной длиной.");
            }

//          Дан список строк. Необходимо удалить все пробелы в каждой строке, отсортировать их в лексикографическом порядке и вывести результат.
            List<String> sortedStrings = strings.stream()
                    .map(str -> str.replaceAll(" ", ""))
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Task 19. Строки после удаления пробелов и сортировки:");
            sortedStrings.forEach(System.out::println);

//          Дан список слов. Необходимо проверить, являются ли они палиндромами, и вывести результат.
            List<String> palWords = Arrays.asList("level", "apple", "radar");

            List<String> palindromes = palWords.stream()
                    .filter(word -> isPalindrome(word)) // Фильтруем только палиндромы
                    .toList();

            System.out.println("Task 20. Палиндромы в списке: " + palindromes);

//          Дан список чисел. Необходимо найти максимальное четное число.
            Optional<Integer> maxEven = numbers.stream()
                    .filter(number -> number % 2 == 0)
                    .max(Integer::compareTo);

            if (maxEven.isPresent()) {
                    System.out.println("Task 21. Максимальное четное число: " + maxEven.get());
            } else {
                    System.out.println("Task 21. В списке нет четных чисел.");
            }

//          Дан список строк. Необходимо объединить все строки в одну строку, добавив префикс ">>" и суффикс "<<" к каждой строке.
            String concatenatedString = strings.stream()
                    .map(str -> ">>" + str + "<<")
                    .collect(Collectors.joining());

            System.out.println("Task 22: " + concatenatedString);

//          Дан список строк. Необходимо объединить все символы из всех строк, удалить дубликаты и отсортировать их в лексикографическом порядке.
            String mergedString = strings.stream()
                    .flatMap(str -> Arrays.stream(str.split("")))
                    .distinct()
                    .sorted()
                    .collect(Collectors.joining());

            System.out.println("Task 23: " + mergedString);

//          Дан список объектов Person с полем "возраст". Необходимо отфильтровать объекты, возраст которых находится
//          в диапазоне от 25 до 40 лет, отсортировать по имени и вывести результат.
            List<Person> persons = Arrays.asList(
                    new Person("John", 30),
                    new Person("Alice", 22),
                    new Person("Mark", 35),
                    new Person("Emma", 27),
                    new Person("David", 40)
            );

            List<Person> filteredAndSortedPersons = persons.stream()
                    .filter(person -> person.getAge() >= 25 && person.getAge() <= 40)
                    .sorted((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()))
                    .collect(Collectors.toList());
            System.out.println("Task 24: ");
            filteredAndSortedPersons.forEach(System.out::println);

//          Дан список чисел. Необходимо найти сумму всех четных чисел, которые являются положительными.
            int sum = numbers.stream()
                    .filter(number -> number > 0 && number % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println("Task 25. Сумма четных положительных чисел: " + sum);

//          Дан список чисел. Необходимо найти второе минимальное число среди уникальных чисел.
            int secondMin = numbers.stream()
                    .distinct()
                    .sorted()
                    .skip(1)
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Task 26. Не найдено второе минимальное уникально число"));

            System.out.println("Task 26. Второе минимальное уникальное число: " + secondMin);

//          Дан список слов. Необходимо разделить их на две группы: одна группа - слова с длиной менее или равной 4 символам,
//          другая группа - слова с длиной более 4 символов. После этого подсчитать количество слов в каждой группе и вывести результат.
            List<String> shortWords = words.stream()
                    .filter(word -> word.length() <= 4)
                    .collect(Collectors.toList());

            List<String> longWords = words.stream()
                    .filter(word -> word.length() > 4)
                    .collect(Collectors.toList());

            int shortWordCount = shortWords.size();
            int longWordCount = longWords.size();

            System.out.println("Task 27. Количество слов с длиной менее или равной 4 символам: " + shortWordCount);
            System.out.println("Task 27. Количество слов с длиной более 4 символов: " + longWordCount);

//          Дан список строк. Необходимо пропустить первые три символа в каждой строке и объединить оставшиеся символы в одну строку.
            String result5 = strings.stream()
                    .map(str -> str.substring(3)) // Пропускаем первые три символа
                    .collect(Collectors.joining()); // Объединяем оставшиеся символы в одну строку

            System.out.println("Task 28. Результат: " + result5);

//          Дан список чисел. Необходимо найти три наименьших числа и вывести результат.
            List<Integer> smallestThree = numbers.stream()
                    .sorted()
                    .limit(3) // Берем первые три числа
                    .toList();

            System.out.println("Task 29. Три наименьших числа: " + smallestThree);

//          Дан список строк. Необходимо проверить, содержит ли хотя бы одна строка подстроку "an" и вывести результат.
            boolean containsSubstring = strings.stream()
                    .anyMatch(str -> str.contains("an")); // Проверяем, содержит ли хотя бы одна строка подстроку "an"

            System.out.println("Task 30. Результат: " + containsSubstring);
    }

    //Task 20.
    private static boolean isPalindrome(String word) {
            String reversed = new StringBuilder(word).reverse().toString();
            return word.equals(reversed);
    }
}
class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
                this.name = name;
                this.age = age;
        }

        public String getName() {
                return name;
        }

        public int getAge() {
                return age;
        }

        @Override
        public String toString() {
                return "Person{name='" + name + "', age=" + age + "}";
        }
}