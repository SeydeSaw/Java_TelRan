package konspekt;
/*
    Equals/Haschcode контракт: сначала сверяются объекты по хэшкоду и если они равны,
    то проверка идёт по equals.
    Колизия образуется потому что Hashcode возвращает число integer, а Integer имеет
    диапазон/ограничение и получается если числа закончились, то начинают повторяться.

    Equals/HashCode-Kontrakt: Zuerst werden Objekte nach ihrem Hashcode verglichen, und wenn sie gleich sind,
    dann wird die Überprüfung mit equals fortgesetzt.
    Eine Kollision tritt auf, weil der Hashcode eine ganze Zahl zurückgibt und Integer einen Bereich/Limit hat.
    Es passiert, wenn die Zahlen erschöpft sind, dann beginnen sie sich zu wiederholen.

 */
public class _Hashcode_Equals {
}
