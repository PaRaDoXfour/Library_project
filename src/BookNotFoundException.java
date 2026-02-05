/**
 * Виняток для випадків, коли книга не знайдена в бібліотеці
 */
public class BookNotFoundException extends LibraryException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public BookNotFoundException() {
        super("Книга не знайдена");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public BookNotFoundException(String message) {
        super(message);
    }
}
