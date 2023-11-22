package konspekt;

public class _Obrabotka_isklju4enii_Try_Catch {
    /*
    Обработка исключений в Java происходит с использованием блоков try, catch, и finally.
    Обработка исключений помогает справляться с непредвиденными ситуациями в программе
    и обеспечивает более устойчивое выполнение кода.

    Die Behandlung von Ausnahmen in Java erfolgt mithilfe der Blöcke try, catch und finally.
    Die Behandlung von Ausnahmen hilft, mit unvorhergesehenen Situationen im Programm umzugehen,
    und gewährleistet eine stabilere Ausführung des Codes.

    try:
    В этом блоке вы помещаете код, который может вызвать исключение.
    In diesem Block platzieren Sie den Code, der eine Ausnahme auslösen kann.

    catch:
    В этом блоке указывается, как обработать исключение, если оно произошло в блоке try.
    In diesem Block wird angegeben, wie mit der Ausnahme umgegangen werden soll, wenn sie im try-Block auftritt.

    finally:
    Этот блок содержит код, который выполнится всегда, независимо от того, произошло исключение или нет.
    Он необязателен.
    Dieser Block enthält Code, der unabhängig davon, ob eine Ausnahme aufgetreten ist oder nicht, immer ausgeführt wird.
    Er ist optional.

    Пример Обработки Исключений:

    try {
        // ваш код, который может вызвать исключение
        int результат = деление(10, 0);
    } catch (ArithmeticException e) {
        // код для обработки исключения деления на ноль
        System.out.println("Ошибка: " + e.getMessage());
    } finally {
        // код, который выполнится всегда
        System.out.println("Завершение блока try-catch-finally");
    }

    Beispiel für die Behandlung von Ausnahmen:

    try {
    // Ihr Code, der eine Ausnahme auslösen kann
    int ergebnis = division(10, 0);
    } catch (ArithmeticException e) {
    // Code zur Behandlung der Ausnahme bei Division durch Null
    System.out.println("Fehler: " + e.getMessage());
    } finally {
    // Code, der immer ausgeführt wird
    System.out.println("Abschluss des try-catch-finally-Blocks");
}

    throw и throws:
    throw: Используется для явного создания исключения.
    throws: Используется в сигнатуре метода для указания, что метод может бросить исключение определенного типа.

    throw: Wird verwendet, um eine Ausnahme explizit zu erzeugen.
    throws: Wird in der Methodensignatur verwendet, um anzugeben,
    dass eine Methode eine Ausnahme eines bestimmten Typs werfen kann.
     */
}