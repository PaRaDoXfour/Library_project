/**
 * Виняток для помилок, пов'язаних із назвою книги.
 */
public class TitleException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public TitleException() {
        super("Назва книги не може бути порожньою.");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public TitleException(String message) {
        super(message);
    }
}