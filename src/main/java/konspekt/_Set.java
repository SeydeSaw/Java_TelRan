package konspekt;

import java.util.HashSet;
import java.util.Set;

/*
    Set - это множество.
    Особенность: хранит уникальные элементы и хранит их беспорядочно.
    У него нет индексации. Хранит ссылочные типы данных.
    Перебрать можно циклом: forEach, While и итератором.

    Set - das ist eine Menge.
    Besonderheit: Es speichert eindeutige Elemente und hält sie ungeordnet.
    Es hat keine Indizierung. Es speichert Referenzdatentypen.
    Es kann mit Schleifen wie forEach, While und einem Iterator durchlaufen werden.

    Реализации:
    Implementierungen:
	•	HashSet:Реализация множества на основе хэш-таблицы. Не хранит порядок добавления
	       Implementierung einer Menge basierend auf einer Hashtabelle. Speichert nicht die Reihenfolge der Hinzufügung.
	•	LinkedHashSet:Реализация множества, которая сохраняет порядок добавления элементов.
	       Implementierung einer Menge, die die Reihenfolge der Hinzufügung der Elemente beibehält.
	•	TreeSet:Реализация множества на основе сбалансированного двоичного дерева (красно-черного дерева).
	    Содержит Внутри дерево, сортирует по параметру заданному
	    через Comparable.(implement класс Comparable).
           Implementierung einer Menge basierend auf einem ausbalancierten binären Baum (Rot-Schwarz-Baum).
           Es enthält intern einen Baum, sortiert nach einem durch Comparable festgelegten Parameter
           (implementiert die Comparable-Schnittstelle).

    Основные методы, определенные в интерфейсе Set:
    Hauptmethoden, die in der Set-Schnittstelle definiert sind:
	•	add(E element): Добавляет элемент в множество, если его еще нет.
	                    Fügt ein Element der Menge hinzu, wenn es noch nicht vorhanden ist.
	•	remove(Object o): Удаляет указанный элемент из множества, если он присутствует.
	                    Entfernt das angegebene Element aus der Menge, wenn es vorhanden ist.
	•	contains(Object o): Проверяет, содержит ли множество указанный элемент.
	                    Überprüft, ob die Menge das angegebene Element enthält.
	•	size(): Возвращает текущий размер множества.
	                    Gibt die aktuelle Größe der Menge zurück.
	•	isEmpty(): Проверяет, пусто ли множество.
	                    Überprüft, ob die Menge leer ist.
	•	clear(): Удаляет все элементы из множества.
	                    Entfernt alle Elemente aus der Menge.
	•	iterator(): Возвращает итератор для обхода элементов множества.
	                    Gibt einen Iterator zurück, um die Elemente der Menge zu durchlaufen.
	•	addAll(Collection<? extends E> c): Добавляет все элементы из указанной коллекции в множество.
	                    Fügt alle Elemente aus der angegebenen Sammlung der Menge hinzu.
	•	retainAll(Collection<?> c): Удаляет из множества все элементы, которые не содержатся в указанной коллекции.
	                    Entfernt aus der Menge alle Elemente, die nicht in der angegebenen Sammlung enthalten sind.
 */
public class _Set {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Bob"); // Дубликат, не будет добавлен

        System.out.println(names); // Вывод: [Alice, Bob, Charlie]

        boolean containsBob = names.contains("Bob");
        System.out.println(containsBob); // Вывод: true

        names.remove("Charlie");
        System.out.println(names); // Вывод: [Alice, Bob]

        System.out.println(names.size()); // Вывод: 2

        names.clear();
        System.out.println(names.isEmpty()); // Вывод: true
    }
}
