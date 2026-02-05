/**
 * Базовий клас винятків для бібліотечної системи
 */
public class LibraryException extends Exception{
    /**
     * Конструктор за замовчуванням зі стандартним повідомленням
     */
    public LibraryException() {
        super("Помилка бібліотечної системи");
    }

    /**
     * Конструктор з можливістю вказання спеціалізованого повідомлення.
     * @param message детальне повідомлення про помилку
     */
    public LibraryException(String message){
        super(message);
    }
}
