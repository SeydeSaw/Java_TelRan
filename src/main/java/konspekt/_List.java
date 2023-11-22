package konspekt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    List - это интерфейс, представляющий упорядоченную коллекцию элементов,
    в которой допускаются повторения.
    Он расширяет интерфейс Collection и определяет основные операции для работы с элементами списка.

    List ist eine Schnittstelle, die eine geordnete Sammlung von Elementen darstellt,
    in der Wiederholungen erlaubt sind.
    Sie erweitert die Schnittstelle Collection und definiert grundlegende Operationen für die Arbeit
    mit den Elementen der Liste.

    Некоторые основные методы, определенные в интерфейсе List:

    add(E element): Добавляет элемент в конец списка.
    add(int index, E element): Вставляет элемент в указанную позицию списка.
    get(int index): Возвращает элемент по указанному индексу.
    set(int index, E element): Заменяет элемент в указанной позиции новым элементом.
    remove(int index): Удаляет элемент по указанному индексу.
    size(): Возвращает текущий размер списка.
    isEmpty(): Проверяет, пуст ли список.
    contains(Object o): Проверяет, содержит ли список указанный элемент.
    indexOf(Object o): Возвращает индекс первого вхождения указанного элемента.
    clear(): Удаляет все элементы из списка.

    Einige grundlegende Methoden, die in der Schnittstelle List definiert sind:

    add(E element): Fügt ein Element am Ende der Liste hinzu.
    add(int index, E element): Fügt ein Element an der angegebenen Position in der Liste ein.
    get(int index): Gibt das Element an der angegebenen Position zurück.
    set(int index, E element): Ersetzt das Element an der angegebenen Position durch ein neues Element.
    remove(int index): Entfernt das Element an der angegebenen Position.
    size(): Gibt die aktuelle Größe der Liste zurück.
    isEmpty(): Überprüft, ob die Liste leer ist.
    contains(Object o): Überprüft, ob die Liste das angegebene Element enthält.
    indexOf(Object o): Gibt den Index des ersten Vorkommens des angegebenen Elements zurück.
    clear(): Entfernt alle Elemente aus der Liste.
 */
public class _List {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c");

        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
    }
}
