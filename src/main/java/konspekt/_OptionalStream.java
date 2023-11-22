package konspekt;

import java.util.Optional;

/*
    Optional в Stream API представляет собой контейнер, который может содержать или не содержать значение.
    Optional позволяет более безопасно и удобно работать с потенциально отсутствующими значениями в потоках.
    Он помогает избежать ошибок NullPointerException и облегчает проверку наличия значений перед их использованием.

    Optional im Stream-API ist ein Container, der einen Wert enthalten kann oder auch nicht.
    Optional ermöglicht eine sicherere und bequemere Arbeit mit potenziell fehlenden Werten in Streams.
    Es hilft dabei, NullPointerException-Fehler zu vermeiden und erleichtert das Überprüfen, ob Werte vorhanden sind,
    bevor sie verwendet werden.

    Набор методов для работы с возможными значениями, такими как:
    Es gibt eine Reihe von Methoden für die Arbeit mit möglichen Werten, wie zum Beispiel:

    of(T value): создает Optional с заданным значением. Если значение равно null, выбрасывается исключение
    NullPointerException.
    Erstellt ein Optional mit dem angegebenen Wert. Wenn der Wert null ist, wird eine NullPointerException ausgelöst.

    empty(): создает пустой Optional без значения.
    Erstellt ein leeres Optional ohne Wert.

    ofNullable(T value): создает Optional с заданным значением. Если значение равно null, создается пустой Optional.
    Erstellt ein Optional mit dem angegebenen Wert. Wenn der Wert null ist, wird ein leeres Optional erstellt.

    isPresent(): возвращает true, если Optional содержит значение, иначе возвращает false.
    Gibt true zurück, wenn Optional einen Wert enthält, andernfalls wird false zurückgegeben.

    get(): получает значение из Optional. Если Optional пустой, выбрасывается исключение NoSuchElementException.
    Ruft den Wert aus dem Optional ab. Wenn Optional leer ist, wird eine NoSuchElementException ausgelöst.

    orElse(T other): возвращает значение из Optional, если оно присутствует, иначе возвращает заданное значение other.
    Gibt den Wert aus Optional zurück, wenn vorhanden, andernfalls wird der angegebene Wert 'other' zurückgegeben.

    orElseGet(Supplier<? extends T> other): возвращает значение из Optional, если оно присутствует,
    иначе вызывает функцию-поставщик other и возвращает результат ее выполнения.
    Gibt den Wert aus Optional zurück, wenn vorhanden, andernfalls ruft es die Funktion des Lieferanten 'other' auf
    und gibt das Ergebnis zurück.

    orElseThrow(Supplier<? extends X> exceptionSupplier): возвращает значение из Optional, если оно присутствует,
    иначе выбрасывает исключение, созданное функцией-поставщиком exceptionSupplier.
    Gibt den Wert aus Optional zurück, wenn vorhanden, andernfalls wird eine Ausnahme ausgelöst,
    die durch die Funktion des Lieferanten 'exceptionSupplier' erstellt wurde.

    ifPresent(Consumer<? super T> consumer): выполняет заданное действие consumer, если Optional содержит значение.
    Führt die angegebene Aktion 'consumer' aus, wenn Optional einen Wert enthält.

    filter(Predicate<? super T> predicate): фильтрует Optional с использованием заданного предиката.
    Если значение не удовлетворяет предикату, возвращается пустой Optional.
    Filtert Optional unter Verwendung des angegebenen Prädikats.
    Wenn der Wert dem Prädikat nicht entspricht, wird ein leeres Optional zurückgegeben.

    map(Function<? super T, ? extends U> mapper): применяет заданную функцию mapper к значению Optional и
    возвращает Optional с преобразованным значением.
    Wendet die angegebene Funktion 'mapper' auf den Wert des Optionals an und
    gibt ein Optional mit dem transformierten Wert zurück.

    flatMap(Function<? super T, Optional<U>> mapper): применяет заданную функцию mapper к значению Optional и
    возвращает результат в виде Optional.
    Wendet die angegebene Funktion 'mapper' auf den Wert des Optionals an und gibt das Ergebnis als Optional zurück.

 */
public class _OptionalStream {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("!");
        if(optional.isPresent()) {
            String name = optional.get();
            System.out.println("Param: " + name);
        }
        else  {
            System.out.println("Name is not valid");
        }
    }
}