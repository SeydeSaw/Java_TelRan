package konspekt;
/*
Циклы  позволяют выполнять повторяющиеся действия:
Schleifen ermöglichen die Ausführung wiederholter Aktionen:

Цикл for обычно используется, когда заранее известно количество итераций.
for (инициализация; условие; обновление) {
    // Код, выполняющийся на каждой итерации
}
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

Die for-Schleife wird normalerweise verwendet, wenn die Anzahl der Iterationen im Voraus bekannt ist.

for (Initialisierung; Bedingung; Aktualisierung) {
    // Code, der bei jeder Iteration ausgeführt wird
}
Beispiel:
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
-------
Цикл while используется, когда заранее неизвестно количество итераций.
while (условие) {
    // Код, выполняющийся на каждой итерации
}
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

Die while-Schleife wird verwendet, wenn die Anzahl der Iterationen im Voraus nicht bekannt ist.

while (Bedingung) {
    // Code, der bei jeder Iteration ausgeführt wird
}
Beispiel:
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

-------
Цикл do-while , проверка условия выполняется после выполнения блока кода.
Это гарантирует, что блок кода выполнится хотя бы один раз.
do {
    // Код, выполняющийся на каждой итерации
} while (условие);
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);

Die do-while-Schleife überprüft die Bedingung nach Ausführung des Codeblocks.
Dies stellt sicher, dass der Codeblock mindestens einmal ausgeführt wird.

do {
    // Code, der bei jeder Iteration ausgeführt wird
} while (Bedingung);

Beispiel:
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
-------
Цикл foreach используется для итерации по элементам коллекции или массива.
Он автоматически перебирает все элементы без явного указания индекса.
for (тип_элемента переменная : коллекция) {
    // Код, выполняющийся на каждой итерации
}
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println(number);
}

Die foreach-Schleife wird verwendet, um über die Elemente einer Sammlung oder eines Arrays zu iterieren.
Sie durchläuft automatisch alle Elemente, ohne dass der Index explizit angegeben wird.

for (Elementtyp Variable : Sammlung) {
    // Code, der bei jeder Iteration ausgeführt wird
}
Beispiel:
int[] zahlen = {1, 2, 3, 4, 5};
for (int zahl : zahlen) {
    System.out.println(zahl);
}
 */
public class _Ziklq_Loop {
}
