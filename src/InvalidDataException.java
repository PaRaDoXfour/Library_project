/**
 * Виняток для випадків, коли дані не відповідають очікуваному формату або вимогам
 */
public class InvalidDataException extends LibraryException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public InvalidDataException() {
        super("Невірний формат даних");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public InvalidDataException(String message) {
        super(message);
    }
}