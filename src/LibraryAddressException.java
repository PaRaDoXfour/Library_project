/**
 * Виняток для помилок, пов'язаних із адресою бібліотеки.
 */
public class LibraryAddressException extends Exception {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public LibraryAddressException() {
        super("Адрес бібліотеки не може бути порожнім.");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public LibraryAddressException(String message) {
        super(message);
    }
}