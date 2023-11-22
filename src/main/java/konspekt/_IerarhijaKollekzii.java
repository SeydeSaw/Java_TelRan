package konspekt;
/*
Иерархия коллекций основана на нескольких интерфейсах и классах, которые предоставляют
различные способы хранения и управления группами объектов.

Die Hierarchie der Sammlungen basiert auf verschiedenen Schnittstellen und Klassen,
die verschiedene Möglichkeiten bieten, Gruppen von Objekten zu speichern und zu verwalten.

                Iterable                                                        Map
                Collection                                                      |  HashTable
    List         Queue                    Set                                   |  LinkedHashMap
ArrayList        | PriorityQueue         |  HashSet                             |  HashMap
LinkedList      Deque                    |  LinkedHashSet                    SortedMap
Vector                                  SortedSet                             TreeMap
Stack

Основные интерфейсы коллекций:
Grundlegende Sammlungsschnittstellen:

	1	Интерфейс Collection:
	•	Интерфейс List: Упорядоченная коллекция, позволяющая дублирование элементов.
	    Реализации включают ArrayList, LinkedList.
	•	Интерфейс Set: Коллекция, не допускающая дублирование элементов.
	    Реализации включают HashSet, LinkedHashSet,TreeSet .
	•	Интерфейс Queue: Коллекция, предоставляющая операции добавления, удаления и
	    доступа к элементам в порядке FIFO (First-In-First-Out).
	    Реализации включают LinkedList, PriorityQueue и другие.

    1   Schnittstelle Collection:

    •   Schnittstelle List: Eine geordnete Sammlung, die das Duplizieren von Elementen ermöglicht.
        Implementierungen umfassen ArrayList, LinkedList.
    •   Schnittstelle Set: Eine Sammlung, die das Duplizieren von Elementen nicht zulässt.
        Implementierungen umfassen HashSet, LinkedHashSet, TreeSet.
    •   Schnittstelle Queue: Eine Sammlung, die Operationen zum Hinzufügen, Entfernen und Zugreifen auf Elemente
        in der Reihenfolge FIFO (First-In-First-Out) bereitstellt.
        Implementierungen umfassen LinkedList, PriorityQueue und andere.

	2	Интерфейс Map:
	•	Интерфейс SortedMap: Расширяет интерфейс Map и предоставляет сортировку элементов по ключу.
	    Реализации включают TreeMap и другие.
	•	Интерфейс NavigableMap: Расширяет интерфейс SortedMap и предоставляет дополнительные
	    навигационные операции.
	    Реализации включают TreeMap.
	•	Интерфейс ConcurrentMap: Расширяет интерфейс Map и предоставляет потокобезопасные операции
	    для использования в многопоточной среде.
	    Реализации включают ConcurrentHashMap.


    2   Schnittstelle Map:
    •   Schnittstelle SortedMap: Erweitert die Schnittstelle Map und bietet eine Sortierung der Elemente nach Schlüssel.
        Implementierungen umfassen TreeMap und andere.
    •   Schnittstelle NavigableMap: Erweitert die Schnittstelle SortedMap und bietet zusätzliche Navigationsoperationen.
        Implementierungen umfassen TreeMap.
    •   Schnittstelle ConcurrentMap: Erweitert die Schnittstelle Map und bietet thread-sichere Operationen für
        die Verwendung in einer Mehrfadenumgebung.
        Implementierungen umfassen ConcurrentHashMap.

	3	Интерфейс Deque: Расширяет интерфейс Queue и предоставляет операции вставки и
	    удаления элементов как в начало, так и в конец коллекции.
	    Реализации включают ArrayDeque, LinkedList и другие.

    3   Schnittstelle Deque: Erweitert die Schnittstelle Queue und bietet Operationen zum Einfügen und
        Entfernen von Elementen sowohl am Anfang als auch am Ende der Sammlung.
        Implementierungen umfassen ArrayDeque, LinkedList und andere.

    Отличия Collection от Map:
    Collection предназначен для хранения отдельных элементов.
    Map предназначена для хранения пар Ключ-Значение. Её функциональность и использование отличаются
    от простой группировки элементо, которая в Collection.
    Map требует, чтобы её ключи были уникальными, в то время как Collection такого требования к элементам нет.

    Unterschiede zwischen Collection und Map:
    Collection ist für die Aufbewahrung einzelner Elemente vorgesehen.
    Map ist für die Aufbewahrung von Schlüssel-Wert-Paaren vorgesehen. Ihre Funktionalität und
    Verwendung unterscheiden sich von einfacher Gruppierung von Elementen, wie es bei Collection der Fall ist.
    Map erfordert, dass ihre Schlüssel eindeutig sind,
    während Collection keine solche Anforderung an die Elemente hat.
 */
public class _IerarhijaKollekzii {
}