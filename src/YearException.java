import java.time.Year;

/**
 * Виняток для помилок, пов'язаних із роком видання книги
 */
public class YearException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public YearException() {
        super("Рік видання має бути у діапазоні 1450-" + Year.now().getValue());
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public YearException(String message) {
        super(message);
    }
}