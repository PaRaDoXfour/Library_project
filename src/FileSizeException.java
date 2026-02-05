/**
 * Виняток для помилок, пов'язаних із розміром файлу електронної книги
 */
public class FileSizeException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public FileSizeException() {
        super("Розмір файлу має бути додатнім");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public FileSizeException(String message) {
        super(message);
    }
}