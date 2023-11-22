package konspekt;
/*
    Функциональный интерфейс, содержит только один абстрактный метод.
    Он представляет собой функциональную сигнатуру, которая может быть реализована
    в виде лямбда-выражения или ссылки на метод.
    Функциональные интерфейсы обычно используются, где методы могут передаваться как
    параметры или возвращаться из других методов.
    Если интерфейс, помеченный аннотацией @FunctionalInterface, содержит более одного
    абстрактного метода, компилятор выдаст ошибку.
    Это правило не распространяется на методы класса Object.

    Ein funktionaler Interface ist eine spezielle Art von Schnittstelle, die nur eine abstrakte Methode enthält.
    Diese Methode repräsentiert eine funktionale Signatur, die als Lambda-Ausdruck oder
    Methodenreferenz implementiert werden kann.
    Funktionale Interfaces werden normalerweise dort verwendet, wo Methoden als Parameter übergeben oder
    aus anderen Methoden zurückgegeben werden.
    Wenn eine mit @FunctionalInterface markierte Schnittstelle mehr als eine abstrakte Methode enthält,
    gibt der Compiler einen Fehler aus.
    Diese Regel gilt nicht für Methoden der Klasse Object.

    Важно что в абстрактном методе на входе, какие параметры передаём  и что на выходе возвращаем или нет:
    Es ist wichtig zu wissen, welche Parameter in einer abstrakten Methode übergeben werden
    und was sie zurückgibt oder nicht, zum Beispiel:
                                                                    void get();

    В обычном интерфейсе может быть любое количество абстрактных методов,
    а также дефолтные методы и статические методы.
    Это позволяет определить набор методов, которые должны быть реализованы в классах,
    реализующих интерфейс.

    In einer normalen Schnittstelle können beliebig viele abstrakte Methoden vorhanden sein,
    sowie Standardmethoden und statische Methoden.
    Dies ermöglicht die Definition einer Reihe von Methoden, die in Klassen implementiert werden müssen,
    die die Schnittstelle implementieren.

    Абстрактный метод - это метод, который объявлен в интерфейсе или абстрактном классе,
    но не имеет реализации в самом интерфейсе или абстрактном классе.
    Вместо этого, метод оставляют без определения и он должен быть реализован в классе,
    который наследует интерфейс или абстрактный класс.

    Eine abstrakte Methode ist eine Methode, die in einer Schnittstelle oder abstrakten Klasse deklariert ist,
    aber keine Implementierung in der Schnittstelle oder abstrakten Klasse hat.
    Stattdessen wird die Methode ohne Definition belassen und muss in der Klasse implementiert werden,
    die die Schnittstelle oder abstrakte Klasse erbt.

 */

//public class _FunctionalInterface {
//    public static void main(String[] args) {
//        m1(() -> {
//            System.out.println("***");
//        });
//    }
//
//    public static void m1(Inter inter) {//метод, в который передаёи интерфейс
//        System.out.println("@@@");
//        inter.get();
//    }
//}
//
//@FunctionalInterface
//interface Inter {
//    void get();//абстрактный метод
//}