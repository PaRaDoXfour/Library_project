/**
 * Базовий клас винятку для всіх винятків, пов'язаних з книгами
 */
public class BookException extends Exception {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public BookException() {
        super();
    }

    /**
     * Конструктор з повідомленням про помилку
     * @param message повідомлення про помилку
     */
    public BookException(String message) {
        super(message);
    }
}