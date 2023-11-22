package konspekt;


import java.util.Stack;

/*
Stack - это структура данных, которая представляет собой упорядоченную коллекцию элементов,
где добавление и удаление элементов происходит по принципу
"последний вошел, первый вышел" (LIFO - Last-In-First-Out).
Это означает, что последний добавленный элемент будет первым, который будет удален из стека.

Stack - das ist eine Datenstruktur, die eine geordnete Sammlung von Elementen darstellt,
wo das Hinzufügen und Entfernen von Elementen nach dem Prinzip
"Zuletzt hinein, zuerst heraus" (LIFO - Last-In-First-Out) erfolgt.
Das bedeutet, dass das zuletzt hinzugefügte Element das erste ist, das aus dem Stack entfernt wird.

Набор методов для выполнения основных операций со стеком:
Es gibt eine Reihe von Methoden für grundlegende Operationen mit dem Stack:

	•	push    помещение элемента на вершину стека
                Fügt ein Element oben auf den Stack hinzu.
	•	pop     удаление элемента с вершины стека
                Entfernt ein Element vom oberen Teil des Stacks.
	•	peek    получение элемента с вершины стека без его удаления
                Ruft ein Element vom oberen Teil des Stacks ab, ohne es zu entfernen.
	•	isEmpty проверка пустоты стека
                Überprüft, ob der Stack leer ist.
	•	size    получение размера стека
                Gibt die Größe des Stacks zurück.

Применяет в мобильной разработке.
Применяется при переходе по ссылкам. Нажимаем назад и возвращаемся к какой-то исходной ссылке.

Es wird in der mobilen Entwicklung angewendet, besonders wenn man durch Links navigiert.
Wenn wir zurück gehen, kehren wir zu einem bestimmten ursprünglichen Link zurück.
 */
public class _Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        System.out.println(stack); // Вывод: [Apple, Banana, Orange]

        String top = stack.pop();
        System.out.println(top); // Вывод: Orange

        System.out.println(stack); // Вывод: [Apple, Banana]

        String peek = stack.peek();
        System.out.println(peek); // Вывод: Banana

        boolean isEmpty = stack.empty();
        System.out.println(isEmpty); // Вывод: false

        int position = stack.search("Apple");
        System.out.println(position); // Вывод: 2
    }
}
