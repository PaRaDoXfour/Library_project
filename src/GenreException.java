/**
 * Виняток для помилок, пов'язаних із жанром книги
 */
public class GenreException extends BookException {
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public GenreException() {
        super("Жанр або формат електронної книги не може бути порожнім ");
    }

    /**
     * Конструктор з можливістю вказати спеціалізоване повідомлення
     * @param message детальне повідомлення про помилку
     */
    public GenreException(String message) {
        super(message);
    }
}