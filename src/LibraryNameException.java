/**
 * Виняток для помилок, пов'язаних із назвою бібліотеки.
 */
public class LibraryNameException extends Exception {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public LibraryNameException() {
        super("Назва бібліотеки не може бути порожньою.");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public LibraryNameException(String message) {
        super(message);
    }
}