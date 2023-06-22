package homework._2023_06_20;

import java.util.HashMap;
import java.util.Map;

public class MapStrIntExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Добавление элементов в карту (в данном случае)
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 40);
        map.put("G", 50);

        // 1. Вывести все ключи из мапы на экран:
        System.out.println("Все ключи в мапе:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // 2. Проверить, содержит ли мапа определенное значение
        int targetValue = 30;
        boolean containsValue = map.containsValue(targetValue);
        System.out.println("Мапа содержит значение " + targetValue + ": " + containsValue);

        // 3. Найти ключ, связанный с определенным значением
        int targetValue2 = 40;
        String key = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == targetValue2) {
                key = entry.getKey();
                break;
            }
        }
        System.out.println("Ключ для значения " + targetValue2 + ": " + key);

    }
}
