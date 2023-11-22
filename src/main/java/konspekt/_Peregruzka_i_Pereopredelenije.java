package konspekt;

public class _Peregruzka_i_Pereopredelenije {
    /*
    Перегрузка метода:

    Что это: Это создание нескольких методов с одинаковыми именами в одном классе,
    но с разными параметрами (типами, количеством или порядком).
    Цель: Позволяет создавать методы с одинаковым именем, но принимающими разные данные.

    Methodenüberladung:

    Was ist das? Das ist die Erstellung mehrerer Methoden mit denselben Namen in einer Klasse,
    aber mit unterschiedlichen Parametern (Typen, Anzahl oder Reihenfolge).
    Ziel: Ermöglicht die Erstellung von Methoden mit demselben Namen, aber unterschiedlichen Daten.

    Пример:                                                     Beispiel:
    class Пример {                                              class Beispiel {
        void вывести(int x) {                                       void ausgeben(int x) {
            System.out.println(x);                                      System.out.println(x);
        }                                                           }
        void вывести(double x) {                                    void ausgeben(double x) {
            System.out.println(x);                                      System.out.println(x);
        }                                                           }
    }                                                           }

    Переопределение метода:

    Что это: Это предоставление новой реализации метода в подклассе, который уже был определен в его суперклассе.
    Цель: Позволяет подклассам предоставлять свою реализацию для методов, унаследованных от суперкласса.
    Условие: Метод в подклассе должен иметь тот же идентификатор, что и метод в суперклассе,
    а также совпадающий тип возвращаемого значения и параметры.

    Methodenüberschreibung:

    Was ist das? Dies ist die Bereitstellung einer neuen Implementierung einer Methode in einer Unterklasse,
    die bereits in ihrer Superklasse definiert wurde.
    Ziel: Ermöglicht Unterklassen, ihre Implementierung für von der Superklasse geerbte Methoden bereitzustellen.
    Bedingung: Die Methode in der Unterklasse muss denselben Bezeichner wie die Methode in der Superklasse haben,
    sowie den gleichen Rückgabetyp und Parameter.


    class Родитель {                                        class Elternteil {
        void привет() {                                         void hallo() {
            System.out.println("Привет!");                          System.out.println("Hallo!");
        }                                                       }
    }                                                        }
    class Потомок extends Родитель {                         class Kind extends Elternteil {
        void привет() {                                         void hallo() {
            System.out.println("Привет из подкласса!");             System.out.println("Hallo aus der Unterklasse!");
        }                                                       }
    }                                                       }

    Общий совет:

    Перегрузка метода основывается на сигнатуре метода (типы и порядок параметров),
    а переопределение метода требует точного совпадения сигнатуры.
    Перегрузка решается компилятором на основе параметров метода,
    а переопределение — во время выполнения, основываясь на типе объекта.

    Genereller Ratschlag:

    Die Methodenüberladung basiert auf der Signatur der Methode (Typen und Reihenfolge der Parameter),
    während die Methodenüberschreibung eine genaue Übereinstimmung der Signatur erfordert.
    Die Methodenüberladung wird vom Compiler aufgrund der Methodenparameter gelöst,
    während die Methodenüberschreibung zur Laufzeit basierend auf dem Objekttyp gelöst wird.

     */
}