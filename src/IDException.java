/**
 * Виняток для помилок, пов'язаних із ID книги
 */
public class IDException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public IDException() {
        super("ID не може бути порожнім");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public IDException(String message) {
        super(message);
    }
}
