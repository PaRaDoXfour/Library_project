/**
 * Виняток для помилок, пов'язаних із автором книги
 */
public class AuthorException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public AuthorException() {
        super("Автор книги не може бути порожнім.");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public AuthorException(String message) {
        super(message);
    }
}