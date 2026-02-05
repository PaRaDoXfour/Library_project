/**
 * Виняток для помилок, пов'язаних із тривалістю аудіокниги
 */
public class DurationException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public DurationException() {
        super("Тривалість має бути додатнім числом");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public DurationException(String message) {
        super(message);
    }
}