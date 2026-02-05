import java.util.Objects;

/**
 * Клас для паперових книг, успадкований від Book
 */
public class PaperBook extends Book {
    private boolean hardcover;

    /**
     * Конструктор створення паперової книги
     *
     * @param title Назва книги
     * @param author Автор книги
     * @param year Рік видання
     * @param isbn ISBN книги
     * @param pages Кількість сторінок
     * @param genre Жанр книги
     * @param hardcover Обкладинка паперової книги
     */
    public PaperBook(String title, String author, int year, String isbn, int pages, Genre genre, boolean hardcover) throws GenreException, YearException, PagesException, AuthorException, TitleException, IsbnException {
        super(title, author, year, isbn, pages, genre);
        this.hardcover = hardcover;
    }

    /**
     * Конструктор копіювання для паперової книги
     *
     * @param paperbook об'єкт для копіювання
     */
    public PaperBook(PaperBook paperbook) throws BookException {
        super(paperbook);
        this.hardcover = paperbook.hardcover;
    }

    /**
     * Повертає інформацію про тип обкладинки книги.
     *
     * @return {@code true} - якщо книга має тверду обкладинку,
     *         {@code false} - якщо книга має м'яку обкладинку
     */
    public boolean getHardcover() {
        return hardcover;
    }

    /**
     * Встановлює тип обкладинки для книги.
     *
     * @param hardcover {@code true} - для встановлення твердої обкладинки,
     *                  {@code false} - для встановлення м'якої обкладинки
     */
    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }

    /**
     * Перевизначений метод toString для представлення книги у вигляді рядка.
     *
     * @return рядкове представлення книги
     */
    @Override
    public String toString() {
        return "Паперова " + super.toString() + " (Паперова книга, обкладинка: " + (hardcover ? "тверда" : "м’яка") + ")";
    }

    /**
     * Генерує унікальний хеш-код для об'єкта
     *
     * @return Числове значення хешу.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardcover);
    }

    /**
     * Перевизначений метод equals для порівняння книг.
     *
     * @param o інший об'єкт
     * @return true, якщо книги мають однакові поля, інакше false
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PaperBook paperBook = (PaperBook) o;
        return hardcover == paperBook.hardcover;
    }
}
