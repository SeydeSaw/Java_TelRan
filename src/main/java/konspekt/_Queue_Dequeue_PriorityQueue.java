package konspekt;

import java.util.*;

/*
Queue очередь- это структура данных, которая представляет собой упорядоченную коллекцию
элементов, работает по принципу "первый вошел, первый вышел" (FIFO - First-In-First-Out),
что означает, что первый добавленный элемент будет первым, который будет удален из очереди.

Warteschlange (Queue) ist eine Datenstruktur, die eine geordnete Sammlung von Elementen darstellt
und nach dem Prinzip "wer zuerst kommt, mahlt zuerst" (First-In-First-Out, FIFO) arbeitet.
Das bedeutet, dass das zuerst hinzugefügte Element das erste ist, das aus der Warteschlange entfernt wird.

Основных операций с очередью:
Hier sind die grundlegenden Operationen mit einer Warteschlange:

	•	add  добавление элемента в конец очереди
	•       Hinzufügen eines Elements ans Ende der Warteschlange.
	•	offer добавление элемента в конец очереди, в очередях с ограниченной ёмкостью
	•       Hinzufügen eines Elements ans Ende der Warteschlange, in begrenzten Warteschlangen.
	•	remove удаление элемента из начала очереди, выбрасывает Exception, если очередь пуста
	•       Entfernen des Elements vom Anfang der Warteschlange. Wirft eine Ausnahme, wenn die Warteschlange leer ist.
	•	poll возвращает элемент из начала очереди. Возвращает null, если очередь пуста
	•       Entfernen und Rückgabe des Elements vom Anfang der Warteschlange. Gibt null zurück, wenn die Warteschlange leer ist.
	•	peek получение элемента из начала очереди без его удаления. Возвращает null, если очередь пуста
	•       Abrufen des Elements vom Anfang der Warteschlange, ohne es zu entfernen. Gibt null zurück, wenn die Warteschlange leer ist.
	•	isEmpty проверка пустоты очереди
	•       Überprüfen, ob die Warteschlange leer ist.
	•	size получение размера очереди
	•       Abrufen der Größe der Warteschlange.

Особенность: есть возможность забирать 1-ый элемент.
Выстраивание очерёдности. Выполнение задачи.

Besonderheit: Es ist möglich, das erste Element abzurufen.
Ordnen der Reihenfolge. Ausführung von Aufgaben.

Deque - это структура данных, которая представляет собой упорядоченную коллекцию элементов,
где добавление и удаление элементов могут происходить как в начало, так и в конец очереди.
Дек является сокращением от "double-ended queue" (двусторонняя очередь).

Deque ist eine Datenstruktur, die eine geordnete Sammlung von Elementen darstellt,
in der das Hinzufügen und Entfernen von Elementen sowohl am Anfang als auch am Ende der Warteschlange erfolgen kann.
Deque steht für "double-ended queue" (doppelseitige Warteschlange).

Deque расширяет интерфейс Queue и предоставляет методы для выполнения операций вставки и
удаления элементов как в начало, так и в конец дека:
Deque erweitert das Queue-Interface und bietet Methoden zum Einfügen und
Entfernen von Elementen am Anfang und Ende der Warteschlange:

	•	addFirst, addLast, offerFirst, offerLast добавление элемента
	                                             Hinzufügen von Elementen
	•	removeFirst, removeLast, pollFirst, pollLast удаление элемента
	                                                 Entfernen von Elementen
	•	getFirst, getLast и другие
	                      und andere

Особенность: можно использовать оба принципа FIFO и LIFO
Besonderheit: Man kann sowohl das FIFO- als auch das LIFO-Prinzip verwenden.

PriorityQueue - это реализация Queue, которая обеспечивает управление элементами с использованием приоритета.
Элементы в PriorityQueue упорядочиваются в соответствии с их приоритетами,
которые могут быть заданы с помощью компаратора.

PriorityQueue ist eine Implementierung von Queue, die die Verwaltung von Elementen unter Verwendung
von Prioritäten ermöglicht. Elemente in der PriorityQueue werden gemäß ihren Prioritäten geordnet,
die mithilfe eines Comparators festgelegt werden können.

Особенность: сортирует, в отсортированном виде использует элементы в методах.
Например, удаляет в порядке возрастания.

Besonderheit: Sortiert und verwendet Elemente in sortierter Form in den Methoden.
Zum Beispiel werden Elemente in aufsteigender Reihenfolge entfernt.

 */
public class _Queue_Dequeue_PriorityQueue {
    public static void main(String[] args) {

        //****************** Queue ******************

        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        System.out.println(queue); // Вывод: [Apple, Banana, Orange]

        String element = queue.remove();
        System.out.println(element); // Вывод: Apple

        System.out.println(queue); // Вывод: [Banana, Orange]

        String peek = queue.peek();
        System.out.println(peek); // Вывод: Banana

        //****************** Deque ******************

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addLast("Orange");

        System.out.println(deque); // Вывод: [Apple, Banana, Orange]

        String first = deque.removeFirst();
        System.out.println(first); // Вывод: Apple

        String last = deque.removeLast();
        System.out.println(last); // Вывод: Orange

        System.out.println(deque); // Вывод: [Banana]


        //****************** PriorityQueue ******************

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(7);

        System.out.println(priorityQueue); // Вывод: [3, 5, 7]

        int min = priorityQueue.poll();
        System.out.println(min); // Вывод: 3

        System.out.println(priorityQueue); // Вывод: [5, 7]

        int peek2 = priorityQueue.peek();
        System.out.println(peek2); // Вывод: 5


    }
}
