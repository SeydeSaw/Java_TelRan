package konspekt;

import java.util.*;

/*
    Iterator- интерфейс, который предоставляет способы обхода элементов в коллекциях.
    Позволяет последовательно получать элементы из коллекции.

    Iterator ist eine Schnittstelle, die Methoden für das Durchlaufen von Elementen in Sammlungen bereitstellt.
    Sie ermöglicht das schrittweise Abrufen von Elementen aus einer Sammlung.

    Перебирает слева направо, содержит внутри 3 метода:
	•	next- возвращает следующий элемент
	•	hasNext- проверяет есть ли следующий элемент
	•	remove- удаляет элемент

	Der Iterator geht von links nach rechts und enthält drei Methoden:
    •	next: gibt das nächste Element zurück.
    •	hasNext: überprüft, ob es ein nächstes Element gibt.
    •	remove: entfernt ein Element.

    ListIterator- перебирает в одну и в другую сторону.
    Он расширяет интерфейс Iterator и добавляет дополнительные методы для работы с элементами списка,
    такие как:
    •	boolean hasNext(): Проверяет, есть ли следующий элемент в списке.
    •	E next(): Возвращает следующий элемент в списке.
    •	boolean hasPrevious(): Проверяет, есть ли предыдущий элемент в списке.
    •	E previous(): Возвращает предыдущий элемент в списке.
    •	int nextIndex(): Возвращает индекс следующего элемента в списке.
    •	int previousIndex(): Возвращает индекс предыдущего элемента в списке.
    •	void remove(): Удаляет текущий элемент из списка (необязательная операция).
    •	void set(E element): Заменяет текущий элемент в списке новым элементом (необязательная операция).
    •	void add(E element): Вставляет элемент в список перед текущим элементом (необязательная операция).

    ListIterator durchläuft in beide Richtungen.
    Es erweitert das Iterator-Interface und fügt zusätzliche Methoden für die Arbeit mit Listenelementen hinzu,
    wie zum Beispiel:
    •	boolean hasNext(): Überprüft, ob es ein nächstes Element in der Liste gibt.
    •	E next(): Gibt das nächste Element in der Liste zurück.
    •	boolean hasPrevious(): Überprüft, ob es ein vorheriges Element in der Liste gibt.
    •	E previous(): Gibt das vorherige Element in der Liste zurück.
    •	int nextIndex(): Gibt den Index des nächsten Elements in der Liste zurück.
    •	int previousIndex(): Gibt den Index des vorherigen Elements in der Liste zurück.
    •	void remove(): Entfernt das aktuelle Element aus der Liste (optionale Operation).
    •	void set(E element): Ersetzt das aktuelle Element in der Liste durch ein neues Element (optionale Operation).
    •	void add(E element): Fügt ein Element in die Liste vor dem aktuellen Element ein (optionale Operation).
 */
public class _Iterator_ListIterator {
    public static void main(String[] args) {
        //Пример использования Iterator:
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        //Пример использования ListIterator:

        List<String> fruits2 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        ListIterator<String> listIterator = fruits2.listIterator();

        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }
    }
}
