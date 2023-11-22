package konspekt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
    ArrayList: Реализация списка на основе динамического массива,
    т.е. может изменять свою длину. Можно указать длину Default Copasity (Поумолчанию длина 10).
    Быстрее, т.к. О(1) О от единицы(обращаемся по индексу к элементу, элементы расположены какбы в ряд
    и проходим быстрее).

    ArrayList: Eine Implementierung einer Liste basierend auf einem dynamischen Array, das seine Länge ändern kann.
    Sie können die Standardkapazität angeben (standardmäßig Länge 10).
    Es ist schneller, da O(1) (Zugriff auf ein Element über den Index, die Elemente sind sequentiell im
    Speicher angeordnet und können schneller durchlaufen werden).

    LinkedList: Реализация списка на основе двусвязного списка. Помимо значения хранит ссылки
    на следующий и предыдущий элементы. Хранит порядок добавления элементов.
    Медленнее ,т.к. О(n) О от n (обращаемся по ссылке, которые как бы разбросаны по всей
    ячейке памяти и поэтому время прохода дольше).

    LinkedList: Eine Implementierung einer Liste basierend auf einer doppelt verketteten Liste.
    Neben dem Wert enthält sie Verweise auf das nächste und das vorherige Element.
    Sie behält die Reihenfolge der Hinzufügung der Elemente bei. Es ist langsamer, da O(n) (Zugriff über Verweise,
    die irgendwie über den gesamten Speicher verteilt sind, und daher dauert das Durchlaufen länger).

    Разница:
    Unterschiede:

    1.ArrayList основан на массиве, что значит, что элементы хранятся последовательно в памяти, а
    LinkedList: двусвязный список, помимо значения хранит ссылки на следующий и предыдущий элементы.

    ArrayList basiert auf einem Array, was bedeutet, dass die Elemente sequentiell im Speicher gespeichert sind,
    während LinkedList eine doppelt verkettete Liste ist, die Verweise auf das nächste und vorherige Element enthält.

    2.В ArrayList доступ к элементу быстрее, т.к. О(1) О от единицы(обращаемся по индексу к элементу,
    элементы расположены какбы в ряд и проходим быстрее).
    LinkedListМедленнее ,т.к. О(n) О от n (обращаемся по ссылке, которые как бы разбросаны по всей
    ячейке памяти и поэтому время прохода дольше).

    Der Zugriff auf ein Element in ArrayList ist schneller, da O(1) (Zugriff auf ein Element über den Index,
    die Elemente sind sequentiell im Speicher angeordnet und können schneller durchlaufen werden).
    LinkedList ist langsamer, da O(n) (Zugriff über Verweise, die irgendwie über den gesamten Speicher verteilt sind,
    und daher dauert das Durchlaufen länger).

    3.В ArrayList вставка и удаление элементов, в середине списка требует перемещение остальных элементов,
    что может быть медленным для больших списков.
    LinkedList эффективен для вставки и удаления элементов в любом месте списка,
    т.к. требудется только изменение ссылок на соседние элементы.

    Das Einfügen und Löschen von Elementen in der Mitte der ArrayList erfordert das Verschieben der übrigen Elemente,
    was für große Listen langsam sein kann.
    LinkedList ist effizient für das Einfügen und Löschen von Elementen an beliebiger Stelle in der Liste,
    da nur die Verweise auf benachbarte Elemente geändert werden müssen.

    4.ArrayList рекомендуется использовать, когда требуется частый доступ к элементам по индексу и
    приложение выполняет в основном операции чтения.
    LinkedList лучше использовать когда требуется частая вставка и удаление элементов в середине списка
    или когда надо выполнить множество операций добавления/удаления в начале или конце списка.

    ArrayList wird empfohlen, wenn häufig auf Elemente über den Index zugegriffen wird und
    die Anwendung hauptsächlich Leseoperationen ausführt.
    LinkedList ist besser geeignet, wenn häufige Einfüge- und Löschvorgänge in der Mitte der Liste erforderlich sind
    oder wenn viele Hinzufüge-/Löschoperationen am Anfang oder Ende der Liste durchgeführt werden müssen.

 */
public class _ArrayList_LinkedList {
    public static void main(String[] args) {
        // 1 способ написания
        List<String> list = Arrays.asList("a","b","c");

        // 2 способ написания
        List<Integer> listInt1 = new LinkedList<>();
        List<Integer> listInt2 = new ArrayList<>();
        listInt1.add(1);
        listInt1.add(2);
        listInt1.add(3);
    }
}