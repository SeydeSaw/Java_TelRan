package konspekt;

public class _Processq_Potoki {
    /*
    Процесс:
    Процесс представляет собой независимый выполняемый экземпляр программы.
    Имеет свой собственный адресное пространство памяти.
    Запускается в собственном процессе операционной системы.
    Имеет свой собственный стек вызовов и ресурсы.

    Prozess:
    Ein Prozess ist eine eigenständige ausführbare Instanz eines Programms.
    Es hat seinen eigenen Speicherbereich.
    Es wird in seinem eigenen Betriebssystemprozess gestartet.
    Es hat seinen eigenen Aufrufstapel und Ressourcen.

    Поток:
    Поток — это легковесный подпроцесс внутри процесса.
    Существует в рамках адресного пространства процесса.
    Общается с другими потоками через общую память.
    Все потоки процесса могут взаимодействовать между собой.

    Thread (Faden):
    Ein Thread ist ein leichtgewichtiger Unterprozess innerhalb eines Prozesses.
    Es existiert im Rahmen des Adressraums des Prozesses.
    Es kommuniziert mit anderen Threads über gemeinsamen Speicher.
    Alle Threads eines Prozesses können miteinander interagieren.

    Пример:
    Процесс: Если у вас есть несколько запущенных экземпляров вашего браузера,
    каждый из них представляет собой отдельный процесс.
    Поток: Внутри одного из этих процессов могут существовать разные потоки для
    обработки сетевых запросов, отрисовки интерфейса и т.д.

    Beispiel:
    Prozess: Wenn Sie mehrere laufende Instanzen Ihres Browsers haben,
    repräsentiert jeder von ihnen einen separaten Prozess.
    Thread: Innerhalb eines dieser Prozesse können verschiedene Threads existieren,
    um Netzwerkanfragen, Benutzeroberflächenzeichnung usw. zu verarbeiten.

    Многозадачность:
    Процессы: Потоки в разных процессах независимы друг от друга.
    Потоки: Потоки внутри одного процесса могут совместно использовать ресурсы, что облегчает совместную работу.

    Multitasking:
    Prozesse: Threads in verschiedenen Prozessen sind voneinander unabhängig.
    Threads: Threads innerhalb eines Prozesses können Ressourcen gemeinsam nutzen, was die Zusammenarbeit erleichtert.

    Ресурсы:
    Процессы: Требуют больше ресурсов, так как каждый процесс имеет собственное адресное пространство и ресурсы.
    Потоки: Требуют меньше ресурсов, так как они совместно используют ресурсы в пределах процесса.

    Ressourcen:
    Prozesse: Benötigen mehr Ressourcen, da jeder Prozess seinen eigenen Adressraum und Ressourcen hat.
    Threads: Benötigen weniger Ressourcen, da sie Ressourcen innerhalb des Prozesses gemeinsam nutzen.

    Создание и Уничтожение:
    Процессы: Требуют более сложного механизма создания и уничтожения.
    Потоки: Создаются и уничтожаются легче.

    Erstellung und Zerstörung:
    Prozesse: Erfordern einen komplexeren Mechanismus für die Erstellung und Zerstörung.
    Threads: Werden einfacher erstellt und zerstört.

    В Java потоки реализуются с использованием класса Thread или интерфейса Runnable.
    Важно управлять потоками правильно, чтобы избежать проблем с параллелизмом и синхронизацией.

    In Java werden Threads mit der Thread-Klasse oder dem Runnable-Interface implementiert.
    Es ist wichtig, Threads richtig zu verwalten, um Probleme mit Parallelität und Synchronisation zu vermeiden.

    Проблемы с параллелизмом:

    Гонки (Race Conditions): Это, когда два или более потока пытаются одновременно изменить общие данные,
    что может привести к непредсказуемому результату.
    Deadlocks (взаимная блокировка): Это ситуация, когда два или более потока ожидают друг друга и,
    таким образом, все они оказываются заблокированными, не могут двигаться вперед и при этом блокируют ресурсы.

    Probleme mit Parallelität:

    Wettlaufbedingungen (Race Conditions): Das passiert, wenn zwei oder mehr Threads gleichzeitig versuchen,
    gemeinsame Daten zu ändern, was zu unvorhersehbaren Ergebnissen führen kann.
    Deadlocks (gegenseitige Blockade): Das ist die Situation, wenn zwei oder mehr Threads aufeinander warten und
    dadurch alle blockiert werden. Sie können nicht vorwärts gehen und blockieren gleichzeitig Ressourcen.

    Проблемы с синхронизацией:

    Избыточная синхронизация: Иногда синхронизация используется более чем необходимо, что может снизить производительность.
    Ожидание (Contention): Когда потоки ждут доступа к общему ресурсу, это может привести к простою и снижению эффективности.
    Несбалансированный доступ: Если несколько потоков имеют разное время доступа к общим ресурсам,
    это может привести к дисбалансу и снижению производительности.
    Проблемы с производительностью: Неправильное управление потоками может привести к тому, что они будут слишком активными,
    что снизит производительность.

    Probleme mit Synchronisierung:

    Übersynchronisierung: Manchmal wird Synchronisierung mehr als nötig verwendet, was die Leistung beeinträchtigen kann.
    Warten (Contention): Wenn Threads auf den Zugriff auf gemeinsame Ressourcen warten, kann dies zu Leerlauf
    und Effizienzverlust führen.
    Ungleichmäßiger Zugriff: Wenn mehrere Threads unterschiedliche Zugriffszeiten auf gemeinsame Ressourcen haben,
    kann dies zu Ungleichgewicht und Leistungsverlust führen.
    Probleme mit der Leistung: Eine falsche Steuerung der Threads kann dazu führen, dass sie zu aktiv sind,
    was die Leistung mindert.

     */
}
