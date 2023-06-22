package homework._2023_06_20;

import java.util.*;

public class MapIntStrExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Добавление элементов в карту (в данном случае)
        map.put(1,"Ananas");
        map.put(2,"Apple");
        map.put(3,"Orange");
        map.put(4,"Banana");

        // 1. Вывести все ключи из мапы на экран
        System.out.println("Все ключи в мапе:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // 2. Проверить, содержит ли мапа определенное значение
        String targetValue = "Apple";
        boolean containsValue = map.containsValue(targetValue);
        System.out.println("Мапа содержит значение " + targetValue + ": " + containsValue);

        // 3. Найти ключ, связанный с определенным значением
        String targetValue2 = "Orange";
        Integer key = null;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(targetValue2)) {
                key = entry.getKey();
                break;
            }
        }
        System.out.println("Ключ для значения " + targetValue2 + ": " + key);

        // 4. Вывести на экран все ключи, у которых значение начинается с определенной буквы
        char targetLetter = 'A';
        System.out.println("Ключи, у которых значение начинается с буквы " + targetLetter + ":");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().charAt(0) == targetLetter) {
                System.out.println(entry.getKey());
            }
        }

        // 5. Проверить, содержит ли мапа определенный ключ
        int targetKey = 3;
        boolean containsKey = map.containsKey(targetKey);
        System.out.println("Мапа содержит ключ " + targetKey + ": " + containsKey);

        // 6. Найти ключ с максимальным значением

        String maxValue = Collections.max(map.values());
        List<Integer> keysWithMaxValue = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                keysWithMaxValue.add(entry.getKey());
            }
        }
        System.out.println("Ключ(и) с максимальным значением " + maxValue + ": " + keysWithMaxValue);

        // 7. Подсчитать количество ключей, значение которых содержит определенное слово
        String searchWord = "na";
        int countKeysWithValueContainsWord = 0;
        for (String value : map.values()) {
            if (value.contains(searchWord)) {
                countKeysWithValueContainsWord++;
            }
        }
        System.out.println("Количество ключей, значение которых содержит слово \"" + searchWord + "\": " + countKeysWithValueContainsWord);

        // 8. Найти все ключи, значение которых состоит только из цифр
        List<Integer> keysWithDigitValues = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value.matches("\\d+")) { // проверяет, что значение состоит только из одной или более цифр
                keysWithDigitValues.add(entry.getKey());
            }
        }
        System.out.println("Ключи, значение которых состоит только из цифр: " + keysWithDigitValues);

        // 9. Подсчитать сумму числовых значений в мапе
        int sum = 0;
        for (String value : map.values()) {
            if (value.matches("\\d+")) {
                sum += Integer.parseInt(value);
            }
        }
        System.out.println("Сумма числовых значений в мапе: " + sum);

        // 10. Подсчитать количество ключей, у которых длина значения превышает определенную границу
        int lengthThreshold = 5;
        int countKeysWithValueLengthExceedThreshold = 0;
        for (String value : map.values()) {
            if (value.length() > lengthThreshold) {
                countKeysWithValueLengthExceedThreshold++;
            }
        }
        System.out.println("Количество ключей, у которых длина значения превышает границу " + lengthThreshold + ": " + countKeysWithValueLengthExceedThreshold);

        // *****************************************************************
        // Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы
        Map<String, Integer> reverseMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Обратная мапа:");
        for (Map.Entry<String, Integer> entry : reverseMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }

        // 1. Очистить мапу и вывести сообщение о ее пустом состоянии
        map.clear();
        System.out.println("Мапа очищена. Пустое состояние: " + map.isEmpty());

        // 2. Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("Список:");
        for (String item : list) {
            System.out.println(item);
        }

        // 3. Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        System.out.println("Список 1:");
        for (String item1 : list1) {
            System.out.println(item1);
        }

        // 4. Создать список List, заполнить его несколькими значениями и вывести элементы в обратном порядке
        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Orange");
        System.out.println("Список 2 в обратном порядке:");
        for (int i = list2.size() - 1; i >= 0; i--) {
            System.out.println(list2.get(i));
        }
    }
}
