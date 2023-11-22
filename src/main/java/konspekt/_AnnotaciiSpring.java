package konspekt;

public class _AnnotaciiSpring {
    /*
@Component:

Описание: Помечает класс как компонент Spring. Компоненты автоматически обнаруживаются и регистрируются в контексте приложения.
Использование: Для создания и автоматической регистрации бина в Spring.

Beschreibung: Markiert eine Klasse als Spring-Komponente. Komponenten werden automatisch erkannt und im Anwendungscontext registriert.
Verwendung: Zur Erstellung und automatischen Registrierung von Beans in Spring.

@Autowired:

Описание: Инжектирует зависимость в поле, метод или конструктор. Spring автоматически подставляет нужный бин в это место.
Использование: Для внедрения зависимостей без явного создания объектов.

Beschreibung: Injiziert eine Abhängigkeit in ein Feld, eine Methode oder einen Konstruktor. Spring setzt automatisch die entsprechende Bean an diesen Ort ein.
Verwendung: Zur Injektion von Abhängigkeiten ohne explizite Erstellung von Objekten.

@Service, @Repository, @Controller:

Описание: Дочерние аннотации @Component. Отмечают класс как сервис, репозиторий или контроллер соответственно.
Использование: Для более точной классификации компонентов.

Beschreibung: Unterannotierungen von @Component. Markieren eine Klasse als Service, Repository oder Controller entsprechend.
Verwendung: Zur genaueren Klassifizierung von Komponenten.

@Configuration:

Описание: Обозначает класс как конфигурацию Spring. Методы, помеченные @Bean в таком классе, возвращают объекты, которые Spring автоматически добавляет в контекст.
Использование: Для объявления бинов и конфигурации Spring.

Beschreibung: Kennzeichnet eine Klasse als Spring-Konfiguration. Methoden, die mit @Bean markiert sind, geben Objekte zurück, die Spring automatisch in den Kontext einfügt.
Verwendung: Zur Deklaration von Beans und Spring-Konfigurationen.

@Value:

Описание: Используется для внедрения значения из файла свойств или конфигурации в поле класса.
Использование: Для внедрения значений внутри бинов.

Beschreibung: Wird verwendet, um einen Wert aus einer Eigenschaftsdatei oder Konfiguration in ein Klassenfeld einzufügen.
Verwendung: Zum Einbringen von Werten innerhalb von Beans.

@Transactional:

Описание: Определяет, что метод должен быть выполнен в транзакции. Если транзакция не существует, Spring создает новую; в противном случае использует существующую.
Использование: Для обеспечения транзакционности метода.

Beschreibung: Definiert, dass eine Methode in einer Transaktion ausgeführt werden soll. Wenn keine Transaktion existiert, erstellt Spring eine neue; andernfalls wird eine vorhandene verwendet.
Verwendung: Zur Gewährleistung der Transaktionalität einer Methode.

@Bean:

Описание: Помечает метод как производителя бина. Возвращает объект, который Spring будет управлять в контексте.
Использование: Вместе с @Configuration для объявления бинов.

Beschreibung: Markiert eine Methode als Bean-Produzent. Sie gibt ein Objekt zurück, das von Spring im Kontext verwaltet wird.
Verwendung: Gemeinsam mit @Configuration zur Deklaration von Beans.

@Tag:

Описание: Помечает метод как бин с тегами. Может быть использован вместе с @Configuration и @Bean.
Использование: Для дополнительной классификации бинов.

Beschreibung: Markiert eine Methode als Bean mit Tags. Kann zusammen mit @Configuration und @Bean verwendet werden.
Verwendung: Zur zusätzlichen Klassifizierung von Beans.

@RestController:

Описание: Комбинация @Controller и @ResponseBody. Предназначен для создания RESTful контроллеров.
Использование: Для создания REST-сервисов.

Beschreibung: Kombination von @Controller und @ResponseBody. Entwickelt für die Erstellung von RESTful Controllern.
Verwendung: Zur Erstellung von REST-Services.

@RequiredArgsConstructor:

Описание: Аннотация Lombok. Создает конструктор, инициализирующий все final-поля класса.
Использование: Для автоматической генерации конструкторов с final-полями.

Beschreibung: Eine Lombok-Annotation. Erstellt einen Konstruktor, der alle finalen Felder der Klasse initialisiert.
Verwendung: Zur automatischen Generierung von Konstruktoren mit finalen Feldern.

@RequestMapping:
Описание: Определяет, как HTTP-запросы должны быть сопоставлены с методами контроллера.
Использование: Для маппинга URL на методы контроллера.

Beschreibung: Bestimmt, wie HTTP-Anfragen mit Methoden des Controllers abgeglichen werden sollen.
Verwendung: Zum Zuordnen von URLs zu Controller-Methoden.
     */
}
