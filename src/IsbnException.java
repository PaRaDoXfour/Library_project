/**
 * Виняток для помилок, пов'язаних із ISBN книги
 */
public class IsbnException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public IsbnException() {
        super("Некоректний формат ISBN (має бути у форматі 978-XX-XXXXXX-X).");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public IsbnException(String message) {
        super(message);
    }
}