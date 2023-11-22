package konspekt;
/*
    method reference -Метод-ссылка, представляет собой компактный способ
    передать ссылку на метод в качестве значения.
    Он позволяет использовать существующие методы вместо написания лямбда-выражений для реализации
    функционального интерфейса(или анонимных функций).
    Указывает на метод, который должен быть вызван в определенном контексте.
    Упрощают код и повышают читаемость, особенно при использовании функциональных интерфейсов,
    где требуется передать функцию или поведение.

    Methodenreferenz ist eine kompakte Möglichkeit, einen Verweis auf eine Methode als Wert zu übergeben.
    Sie ermöglicht die Verwendung vorhandener Methoden anstelle des Schreibens von Lambda-Ausdrücken zur
    Implementierung eines funktionalen Interface (oder anonymer Funktionen).
    Ein Methodenverweis weist auf eine Methode hin, die in einem bestimmten Kontext aufgerufen werden soll.
    Sie vereinfachen den Code und verbessern die Lesbarkeit, insbesondere bei der Verwendung von funktionalen Interfaces,
    bei denen eine Funktion oder ein Verhalten übergeben werden muss.

    Формы записи:
    Класс::статический_метод//Ссылка на статический метод
    объект::метод//Ссылка на метод экземпляра объекта
    Класс::метод//Ссылка на метод экземпляра класса
    Класс::new//Ссылка на конструктор

    Schreibweisen:
    Klasse::statische_Methode // Verweis auf eine statische Methode
    Objekt::Methode // Verweis auf die Methode einer Objektinstanz
    Klasse::Methode // Verweis auf die Methode einer Klasseninstanz
    Klasse::new // Verweis auf den Konstruktor
 */


//public class MethodReference {
//    public static void main(String[] args) {
//
//        printTest(argument -> {// передаём в () такиеже параметры как в методе printTest
//            int sum = 0;
//            for (Integer elem : argument){
//                sum += elem;
//            }
//            System.out.println(sum);
//        });
//
//        printTest(MethodReference::sumArr);//обращаемся к классу :: вызываем метод
//    }
//
//    public static void sumArr(int[] arr){// должна быть такаяже сигнатура как в методе printTest
//        int sum = 0;
//        for (Integer elem : arr){
//            sum += elem;
//        }
//        System.out.println(sum);
//    }
//
//    public static void printTest(Test test){
//        test.print(new int[]{1,2,3,4,5});//инициализируем массив
//    }
//}
//@FunctionalInterface
//interface Test {
//    void print(int[] arr);
//}