package konspekt;

import java.util.HashMap;
import java.util.Map;

/*
HashMap - это класс в языке программирования Java, реализующий интерфейс Map.
Он представляет собой коллекцию, которая хранит данные в виде пар "ключ-значение".

HashMap ist eine Klasse in der Programmiersprache Java, die das Map-Interface implementiert.
Es ist eine Sammlung, die Daten in Form von "Schlüssel-Wert"-Paaren speichert.

HashMap предоставляет эффективные операции вставки, удаления и поиска элементов.
Однако, его производительность может снизиться при большом количестве коллизий.
Важно отметить, что порядок итерации элементов HashMap не является предсказуемым и
может изменяться в зависимости от различных факторов, включая размер HashMap и хэш-коды ключей.

HashMap bietet effiziente Operationen zum Einfügen, Entfernen und Suchen von Elementen.
Die Leistung kann jedoch bei vielen Kollisionen beeinträchtigt werden. Es ist wichtig zu beachten,
dass die Reihenfolge der Iteration von HashMap-Elementen nicht vorhersagbar ist und
von verschiedenen Faktoren abhängt, einschließlich der Größe von HashMap und der Hashcodes der Schlüssel.

Основные особенности HashMap включают:
Die Hauptmerkmale der HashMap sind:

	1	Хранение данных: HashMap использует хэш-таблицу для хранения элементов.
	Каждый элемент представляет собой пару ключ-значение.
	Ключи должны быть уникальными, а значения могут быть дублированы.

	Datenlagerung: HashMap verwendet eine Hashtabelle, um Elemente zu speichern.
	Jedes Element ist ein Schlüssel-Wert-Paar.
	Schlüssel müssen eindeutig sein, während Werte dupliziert werden können.

	2	Быстрый доступ: HashMap обеспечивает быстрый доступ к значениям по ключу.
	Он использует хэш-функцию для преобразования ключа в индекс внутреннего массива.
	Это позволяет быстро находить и получать значения по ключу в среднем случае за постоянное время O(1).

	Schneller Zugriff: HashMap ermöglicht schnellen Zugriff auf Werte über den Schlüssel.
	Eine Hashfunktion wird verwendet, um den Schlüssel in den Index des internen Arrays zu konvertieren,
	was eine durchschnittliche Zugriffszeit von O(1) ermöglicht.

	3	Разрешение коллизий: Коллизия возникает, когда двум разным ключам соответствует
	один и тот же индекс массива. В случае коллизии, HashMap использует метод цепочек (chaining).
	Он создает связанный список элементов в одной ячейке массива, чтобы сохранить все значения с одинаковым хэш-кодом.

	Behandlung von Kollisionen: Kollision tritt auf, wenn zwei verschiedene Schlüssel denselben Index im Array haben.
	Im Falle einer Kollision verwendet HashMap die Verkettungsmethode (chaining), um eine verkettete Liste
	von Elementen in einer Zelle des Arrays zu erstellen.

	4	Неупорядоченность: Элементы в HashMap не упорядочены по порядку добавления.
	Порядок итерации элементов может меняться в зависимости от внутренней реализации и изменений размера HashMap.

	Ungeordnetheit: Elemente in HashMap sind nicht in der Reihenfolge ihrer Hinzufügung geordnet.
	Die Reihenfolge der Iteration der Elemente kann sich je nach interner Implementierung und
	Änderungen der HashMap-Größe ändern.

	5	Потоконебезопасность: HashMap не является потокобезопасной структурой данных.
	Если необходимо использовать HashMap в многопоточной среде, рекомендуется использовать потокобезопасную реализацию,
	такую как ConcurrentHashMap, или синхронизировать доступ к HashMap вручную.

	Nicht threadsicher: HashMap ist nicht threadsicher.
	Wenn Sie HashMap in einer Multi-Thread-Umgebung verwenden müssen, wird empfohlen, eine threadsichere Implementierung
	wie ConcurrentHashMap zu verwenden oder den Zugriff auf HashMap manuell zu synchronisieren.

	6	Допускание значения null: В HashMap допускается использование ключей и значений со значением null.
	Однако, следует быть осторожными при использовании null в качестве ключа, так как это может привести
	к ошибкам при поиске и доступе к данным.

	Zulassung von null-Werten: HashMap erlaubt die Verwendung von Schlüsseln und Werten mit dem Wert null.
	Bei der Verwendung von null als Schlüssel ist jedoch Vorsicht geboten, da dies zu Fehlern bei der Suche
	und dem Zugriff auf Daten führen kann.

	7	Расширяемость: HashMap автоматически расширяется, когда заполняется большое количество элементов.
	При достижении определенного коэффициента загрузки (load factor), внутренний массив увеличивается в размере,
	чтобы снизить вероятность коллизий и сохранить высокую производительность.Изначальный размер 16.

    Skalierbarkeit: HashMap erweitert sich automatisch, wenn viele Elemente hinzugefügt werden.
    Bei Erreichen eines bestimmten Ladefaktors erhöht sich die Größe des internen Arrays, um die Wahrscheinlichkeit
    von Kollisionen zu verringern und eine hohe Leistung beizubehalten. Der anfängliche Größenwert beträgt 16.

 */
public class _HashMap {
    public static void main(String[] args) {
        // Использование HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        System.out.println(hashMap); // Вывод: {Alice=25, Bob=30, Charlie=35}
    }
}