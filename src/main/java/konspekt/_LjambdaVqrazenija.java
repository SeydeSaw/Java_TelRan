package konspekt;
/*
    Лямбда-выражения - это компактный способ определения
    функциональных интерфейсов (или анонимных функций).
    Нужны для упрощения кода и поддержки функционального программирования.
    Синтаксис лямбда-выражения выглядит следующим образом:

    Lambda-Ausdrücke sind eine kompakte Methode zur Definition funktionaler Schnittstellen (oder anonymer Funktionen).
    Sie sind nützlich, um Code zu vereinfachen und funktionale Programmierung zu unterstützen.
    Die Syntax eines Lambda-Ausdrucks sieht folgendermaßen aus:

    (parameters) -> expression          (параметры) -> тело
    (parameters) -> { statements; }     (параметры) -> {тело};

    (Parameter) -> Ausdruck          (Parameter) -> { Anweisungen; }

	•	parameters - это список параметров, которые принимает лямбда-выражение.
	    Если лямбда не принимает параметров, список остается пустым.
	•   Parameter - Eine Liste von Parametern, die der Lambda-Ausdruck akzeptiert.
	    Wenn der Ausdruck keine Parameter erfordert, bleibt die Liste leer.

	•	expression или statements - это тело лямбда-выражения, содержащее код,
	    который будет выполнен при вызове лямбда-функции.
	    Если тело состоит из одного выражения, оно может быть указано напрямую.
	    Если тело содержит несколько выражений или требуется выполнение дополнительных операций,
	    они должны быть заключены в фигурные скобки.
	•   Ausdruck oder Anweisungen - Der Kern des Lambda-Ausdrucks, der den Code enthält,
	    der ausgeführt wird, wenn die Lambda-Funktion aufgerufen wird.
	    Wenn der Ausdruck aus nur einem Befehl besteht, kann er direkt angegeben werden.
	    Wenn der Ausdruck mehrere Befehle enthält oder zusätzliche Operationen erforderlich sind,
	    müssen sie in geschweifte Klammern eingeschlossen werden.

	    Примеры лямбда-выражений:
        () -> System.out.println("Hello, world!”)//Лямбда-выражение без параметров
        x -> x * x//Лямбда-выражение с одним параметром
        (x, y) -> x + y//Лямбда-выражение с несколькими параметрами

        Hier sind Beispiele für Lambda-Ausdrücke:
        () -> System.out.println("Hallo, Welt!") // Lambda-Ausdruck ohne Parameter
        x -> x * x // Lambda-Ausdruck mit einem Parameter
        (x, y) -> x + y // Lambda-Ausdruck mit mehreren Parametern

 */

//public class _LjambdaVqrazenija {
//    public static void main(String[] args) {
//        //3. обрвщвемся к методу, в который передали функ. интерфейс
//        m1(() -> { // на входе метод пустой () -> реализация метода в {тело метода}
//            System.out.println("****");// реализация метода
//            System.out.println("****");
//        });
//
//        // **** реализация метода интерфейса MyInterface
//        m2(( a,  b) -> {// на входе методa (a,b) -> реализация метода в {тело метода}
//            int result = a + b;// реализация
//            return result;
//        });
//    }
//
//    //2. создаём метод, в который передадим наш функ. интерфейс
//    public static void m1(Inter inter){//передаём в метод наш функциональный интерфейс
//        System.out.println("@@@");
//        inter.get();//обращаемся к абстрактному методу в функ. интерфейсе
//    }
//
//    //****
//    public static void m2(MyInterface myInterface){//передаём в метод наш функциональный интерфейс
//        System.out.println(myInterface.doSomething(2,3));//обращаемся к абстрактному методу в функ. интерфейсе
//    }
//}
//
////1. создаём функ интерфейс с абстрактным классом
//@FunctionalInterface
//interface Inter {
//    void get();
//}
////****
//@FunctionalInterface
//interface MyInterface {
//    int doSomething(int a, int b);
//}