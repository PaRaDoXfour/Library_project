/**
 * Виняток для помилок, пов'язаних із диктором аудіокниги
 */
public class NarratorException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public NarratorException() {
        super("Ім'я диктора не може бути порожнім");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public NarratorException(String message) {
        super(message);
    }
}