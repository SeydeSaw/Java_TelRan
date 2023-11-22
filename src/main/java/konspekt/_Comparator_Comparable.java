package konspekt;
/*
    Интерфейс Comparable определяет метод compareTo(), который позволяет объектам
    сравнивать сами себя с другими объектами:
    Метод int compareTo(T other): Сравнивает текущий объект с other.
    Возвращает отрицательное число, если текущий объект меньше other, положительное число,
    если текущий объект больше other, и ноль, если объекты равны.
    Объекты, реализующие интерфейс Comparable, могут быть автоматически упорядочены с
    использованием методов сортировки встроенных в Java, таких как Collections.sort() или Arrays.sort().

    Die Comparable-Schnittstelle definiert die Methode compareTo(), die es Objekten ermöglicht,
    sich selbst mit anderen Objekten zu vergleichen:
    Methode int compareTo(T other): Vergleicht das aktuelle Objekt mit "other".
    Gibt eine negative Zahl zurück, wenn das aktuelle Objekt kleiner als "other" ist, eine positive Zahl,
    wenn das aktuelle Objekt größer als "other" ist, und null, wenn die Objekte gleich sind.
    Objekte, die das Comparable-Interface implementieren, können automatisch mit
    den in Java eingebauten Sortiermethoden wie Collections.sort() oder Arrays.sort() sortiert werden.

    Интерфейс Comparator определяет методы для сравнения двух объектов:
    Метод int compare(T obj1, T obj2): Сравнивает два объекта obj1 и obj2.
    Возвращает отрицательное число, если obj1 меньше obj2, положительное число,
    если obj1 больше obj2, и ноль, если объекты равны.

    Die Comparator-Schnittstelle definiert Methoden zum Vergleich von zwei Objekten:
    Methode int compare(T obj1, T obj2): Vergleicht zwei Objekte "obj1" und "obj2".
    Gibt eine negative Zahl zurück, wenn "obj1" kleiner als "obj2" ist, eine positive Zahl,
    wenn "obj1" größer als "obj2" ist, und null, wenn die Objekte gleich sind.

    Основное отличие между Comparator и Comparable заключается в следующем:
	•	Comparable используется для определения естественного порядка сортировки
	    объектов внутри самого класса.
	•	Comparator используем если класс не предусматривал сравнение, или надо поменять
	    прошлое сравнение указанное в классе.
	    Позволяет определить несколько различных порядков сортировки, включая сортировку
	    объектов, которые не имеют доступа к исходному коду класса.

    Der Hauptunterschied zwischen Comparator und Comparable besteht darin:
    •   Comparable wird verwendet, um die natürliche Sortierreihenfolge von
        Objekten innerhalb der Klasse zu bestimmen.
    •   Comparator wird verwendet, wenn die Klasse keine Vergleichsfunktion hatte oder wenn
        die vorhandene Vergleichsfunktion in der Klasse geändert werden muss.
        Ermöglicht die Definition mehrerer unterschiedlicher Sortierreihenfolgen, einschließlich der Sortierung
        von Objekten, die keinen Zugriff auf den Quellcode der Klasse haben.
 */

// ***************** Пример использования Comparable: *********
public class _Comparator_Comparable implements Comparable<_Comparator_Comparable> {
    private int value;

    public _Comparator_Comparable(int value) {
        this.value = value;
    }

    //переопределяем метод
    @Override
    public int compareTo(_Comparator_Comparable other) {//сравнивает значения двух объектов
        return Integer.compare(this.value, other.value);
    }

    //создаем два объекта и вызываем метод compareTo() для сравнения
    public static void main(String[] args) {
        _Comparator_Comparable obj1 = new _Comparator_Comparable(5);
        _Comparator_Comparable obj2 = new _Comparator_Comparable(10);

        int result = obj1.compareTo(obj2);
        System.out.println(result); // Вывод: -1
    }

    //*********** Пример использования Comparator: ***********
    /*

class LengthComparator implements Comparator<String> {
    //переопределяем метод compare()
    @Override
    public int compare(String str1, String str2) {
        return Integer.compare(str1.length(), str2.length());//сравнивает длины двух строк
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();//создаем список фруктов
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.sort(new LengthComparator());//сортируем его с использованием LengthComparator

        System.out.println(fruits); // Вывод: [Apple, Orange, Banana]
    }
}


     */

}