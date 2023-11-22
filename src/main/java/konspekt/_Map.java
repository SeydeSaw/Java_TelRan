package konspekt;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
    Map -  это интерфейс, представляющий структуру данных, которая хранит пары "ключ-значение".
    Каждый ключ должен быть уникальным, а каждому ключу соответствует определенное значение.
    Map не допускает дублирование ключей, хранит только ссылочный типы данных.
    Перебрать можно с помощью entry.

    Map - das ist eine Schnittstelle, die eine Datenstruktur repräsentiert, welche "Schlüssel-Wert"-Paare speichert.
    Jeder Schlüssel muss einzigartig sein, und jedem Schlüssel entspricht ein bestimmter Wert.
    Map erlaubt keine Duplikate von Schlüsseln und speichert nur Referenzdatentypen.
    Man kann es durch "entry" durchgehen.

    Основные особенности интерфейса Map включают:
    Die Hauptmerkmale der Map-Schnittstelle umfassen:

	1	Уникальные ключи:
	Каждый ключ в Map должен быть уникальным. Если попытаться добавить элемент с ключом,
	который уже существует в Map, новое значение заменит старое.
	1	Eindeutige Schlüssel:
    Jeder Schlüssel in der Map muss einzigartig sein. Wenn versucht wird, ein Element mit einem Schlüssel hinzuzufügen,
    der bereits in der Map existiert, wird der neue Wert den alten ersetzen.

	2	Ключ-значение:
	Map предоставляет методы для добавления, получения и удаления элементов по ключу.
	Ключ используется для уникальной идентификации значения.
	2   Schlüssel-Wert:
    Map stellt Methoden zum Hinzufügen, Abrufen und Entfernen von Elementen nach Schlüssel bereit.
    Der Schlüssel wird zur eindeutigen Identifizierung des Werts verwendet.

	3	Двусторонняя связь:
	Map обеспечивает двустороннюю связь между ключами и значениями.
	Это означает, что мы можем получить значение по ключу или ключ по значению.
	3   Zweiseitige Verbindung:
    Map stellt eine zweiseitige Verbindung zwischen Schlüsseln und Werten sicher.
    Das bedeutet, dass wir den Wert nach dem Schlüssel oder den Schlüssel nach dem Wert abrufen können.

	4	Различные реализации:
	HashMap - не хранит порядок добавления. Ключи и значения могут быть null.
	LinkedHashMap - хранит порядок добавления. Ключи и значения также могут быть null.
	Использует двусвязный список для поддержания порядка элементов и хэш-таблицу
	для быстрого поиска по ключу.
	TreeMap - представляет сбалансированное двоичное депево(красно-чёрное). Автоматически
	сортирует элементы по их Ключам в естественном порядке или с использованием заданного Компаратора.
	Ключи НЕ могут быть null, а значения могут быть null.
	4   Verschiedene Implementierungen:
    HashMap: Speichert nicht die Reihenfolge der Hinzufügung. Schlüssel und Werte können null sein.
    LinkedHashMap: Speichert die Reihenfolge der Hinzufügung. Schlüssel und Werte können ebenfalls null sein.
    TreeMap: Repräsentiert einen ausbalancierten Binärbaum (Rot-Schwarz). Sortiert Elemente automatisch
    nach ihren Schlüsseln in natürlicher Reihenfolge oder unter Verwendung eines bestimmten Comparators.
    Schlüssel dürfen nicht null sein, Werte können null sein.

	5	Итерация по элементам:
	Map предоставляет возможность итерироваться по ключам, значениям или парам "ключ-значение".
	Мы можем использовать итератор или цикл foreach для перебора элементов Map.
	5   Iteration über die Elemente:
    Map ermöglicht das Durchlaufen von Schlüsseln, Werten oder "Schlüssel-Wert"-Paaren.
    Man kann einen Iterator oder eine foreach-Schleife verwenden, um die Elemente der Map zu durchlaufen.

	6	Методы для работы с элементами:
	методы для добавления, удаления, получения и обновления элементов в Map.
	Мы можем проверить наличие ключа или значения, получить размер Map и очистить её содержимое.
	6   Methoden zur Arbeit mit Elementen:
    Methoden zum Hinzufügen, Entfernen, Abrufen und Aktualisieren von Elementen in der Map.
    Man kann die Existenz von Schlüsseln oder Werten überprüfen, die Größe der Map abrufen und ihren Inhalt löschen.

Map предоставляет удобный способ хранения и управления данными, особенно когда необходимо быстро
находить элементы по ключу. Он широко используется в различных приложениях для сохранения и организации информации.

Map bietet eine bequeme Möglichkeit, Daten zu speichern und zu verwalten, besonders wenn es notwendig ist,
Elemente schnell nach Schlüssel zu finden. Es wird in verschiedenen Anwendungen weit verbreitet verwendet,
um Informationen zu speichern und zu organisieren.

 */
public class _Map {
    public static void main(String[] args) {
        // Использование HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        System.out.println(hashMap); // Вывод: {Alice=25, Bob=30, Charlie=35}

        // Использование LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Alice", 25);
        linkedHashMap.put("Bob", 30);
        linkedHashMap.put("Charlie", 35);
        System.out.println(linkedHashMap); // Вывод: {Alice=25, Bob=30, Charlie=35}

        // Использование TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Alice", 25);
        treeMap.put("Bob", 30);
        treeMap.put("Charlie", 35);
        System.out.println(treeMap); // Вывод: {Alice=25, Bob=30, Charlie=35}
    }
}
