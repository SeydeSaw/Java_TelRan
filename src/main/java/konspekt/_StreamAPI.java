package konspekt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

    Stream API- поток, который служит для обработки либо коллекций,
    либо массивов, т.е. какого-то набора данных.
    позволяет программировать в функциональном стиле и
    состоит их 3 частей:
	•	открытие стрима
	•	обработка промежуточными операторами
	•	закрытие терминальным оператором

    Stream API - ein Stream, der dazu dient, Entweder Kollektionen oder Arrays,
    also eine Art Datenmenge, zu verarbeiten. Es ermöglicht das Programmieren im funktionalen Stil
    und besteht aus 3 Teilen:
	•	Öffnen des Streams
	•	Verarbeitung durch Zwischenoperatoren
	•	Schließen durch einen Terminaloperator

    Посути это набор функциональных операций для работы с коллекциями данных.
    Предоставляет удобные и выразительные средства для выполнения операций фильтрации,
    преобразования и агрегации данных. Позволяет писать компактный и выразительный код
    (для обработки коллекций данных). Он также обладает преимуществами параллельной обработки,
    что может улучшить производительность при работе с большими наборами данных.

    Im Wesentlichen ist dies eine Gruppe funktionaler Operationen zum Arbeiten mit Datensammlungen.
    Es bietet bequeme und ausdrucksstarke Mittel zur Durchführung von Filter-, Transformations- und
    Aggregationsoperationen. Es ermöglicht das Schreiben von kompaktem und ausdrucksstarkem Code
    (zur Verarbeitung von Datensammlungen). Es hat auch Vorteile in der parallelen Verarbeitung,
    was die Leistung bei der Arbeit mit großen Datensätzen verbessern kann.

    Операции над данными:
    Operationen über Daten:

	•	Фильтрация: Позволяет выбрать элементы, соответствующие определенному условию.
        Filterung: Ermöglicht die Auswahl von Elementen, die einem bestimmten Kriterium entsprechen.
	•	Преобразование: Позволяет преобразовать элементы в другой тип или изменить их структуру.
        Transformation: Ermöglicht die Umwandlung von Elementen in einen anderen Typ oder die Änderung ihrer Struktur.
	•	Сортировка: Позволяет упорядочить элементы в заданном порядке.
        Sortierung: Ermöglicht die Anordnung von Elementen in einer bestimmten Reihenfolge.
	•	Ограничение: Позволяет ограничить количество элементов в потоке.
        Beschränkung: Ermöglicht die Begrenzung der Anzahl von Elementen im Stream.
	•	Пропуск: Позволяет пропустить определенное количество элементов в потоке.
        Überspringen: Ermöglicht das Überspringen einer bestimmten Anzahl von Elementen im Stream.
	•	Агрегация: Позволяет выполнять операции сведения данных, такие как суммирование,
	    нахождение минимума или максимума, среднего значения и др.
        Aggregation: Ermöglicht die Ausführung von Datenaggregationsoperationen wie Summierung,
        Finden von Minimum oder Maximum, Berechnung des Durchschnitts usw.
	•	Параллельная обработка: Позволяет выполнять операции параллельно,
	    распределяя работу между несколькими ядрами процессора.
        Parallele Verarbeitung: Ermöglicht das parallele Ausführen von Operationen,
        indem die Arbeit zwischen mehreren CPU-Kernen aufgeteilt wird.

    Stream начинается с терминального оператора, без терминального оператора он даже не начнёт работать.
    .stream() может быть создан только 1 раз, нельзя переиспользовать
    обработка промежуточными операторами(intermediate) прописывается после Точки .filter .sorted .limit и т.д.
    закрываем стрим терминальным оператором(terminal) и ;

    Ein Stream beginnt mit einem Terminaloperator; ohne ihn wird er nicht einmal gestartet.
    .stream() kann nur einmal erstellt werden und kann nicht wiederverwendet werden.
    Die Verarbeitung mit Zwischenoperatoren (Intermediate) erfolgt nach dem Punkt (.), z. B. .filter, .sorted, .limit, usw.
    Der Stream wird durch einen Terminaloperator (Terminal) und ; geschlossen.

 */
public class _StreamAPI {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(13);
        list.add(14);
        //создаём с стрим :
        //1. этап - обращаемся по имени к коллекции или массиву и создаём стрим
        list.stream()
                //Обрабатываем данные:
                //2. этап - обработка промежуточными операторами(intermediate)
                .filter(el -> {
                    System.out.println("@@@@");
                    return el % 2 == 0;
                })
                //3. этап - закрываем стрим терминалиным оператором(terminal)
                .collect(Collectors.toList());//собираем


        // *******************

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //создаем поток из списка чисел
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)//фильтруем только четные числа
                .sorted()//сортируем
                .distinct()//уникальные элементы
                .mapToInt(n -> n * 2)//умножаем каждое число на 2
                .sum();//суммируем

        System.out.println(sum);//выводим сумму удвоенных четных чисел
    }
}
