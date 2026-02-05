/**
 * Виняток для помилок, пов'язаних із вартістю рідкісної книги
 */
public class ValueException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public ValueException() {
        super("Вартість має бути додатнім числом");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public ValueException(String message) {
        super(message);
    }
}