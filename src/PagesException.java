/**
 * Виняток для помилок, пов'язаних із кількістю сторінок книги
 */
public class PagesException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public PagesException() {
        super("Кількість сторінок має бути додатнім числом");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public PagesException(String message) {
        super(message);
    }
}