/**
 * Виняток для помилок, пов'язаних із роком першого видання рідкісної книги
 */
public class FirstPrintYearException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public FirstPrintYearException() {
        super("Рік першого видання має бути в межах 1450 до року поточного видання" );
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public FirstPrintYearException(String message) {
        super(message);
    }
}