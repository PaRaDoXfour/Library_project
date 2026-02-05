import java.time.Year;
import java.util.Objects;

/**
 * Клас для рідкісних книг, успадкований від PaperBook
 */
public class RareBook extends PaperBook {
    private int estimatedValue; // орієнтовна вартість у доларах
    private Year firstPrintYear; // рік першого видання

    /**
     * Конструктор створення рідкісної книги
     *
     * @param title Назва книги
     * @param author Автор книги
     * @param year Рік видання
     * @param isbn ISBN книги
     * @param pages Кількість сторінок
     * @param genre Жанр книги
     * @param hardcover Тип обкладинки
     * @param estimatedValue Орієнтовна вартість у доларах
     * @param firstPrintYear Рік першого видання
     */
    public RareBook(String title, String author, int year, String isbn, int pages, Genre genre,
                    boolean hardcover, int estimatedValue, int firstPrintYear) throws GenreException, YearException, PagesException, AuthorException, TitleException, IsbnException, ValueException, FirstPrintYearException {
        super(title, author, year, isbn, pages, genre, hardcover);
        setEstimatedValue(estimatedValue);
        setFirstPrintYear(firstPrintYear);
    }

    /**
     * Конструктор копіювання для рідкісної книги
     *
     * @param rareBook об'єкт для копіювання
     */
    public RareBook(RareBook rareBook) throws BookException {
        super(rareBook);
        this.estimatedValue = rareBook.estimatedValue;
        this.firstPrintYear = rareBook.firstPrintYear;
    }

    /**
     * Отримує орієнтовну вартість книги
     *
     * @return Вартість у доларах
     */
    public int getEstimatedValue() {
        return estimatedValue;
    }

    /**
     * Встановлює орієнтовну вартість книги
     *
     * @param estimatedValue Вартість у доларах (має бути більше за 0)
     * @throws ValueException якщо вартість недопустима
     */
    public void setEstimatedValue(int estimatedValue) throws ValueException{
        if (estimatedValue <= 0) {
            throw new ValueException("Вартість має бути додатнім числом");
        }
        this.estimatedValue = estimatedValue;
    }

    /**
     * Отримує рік першого видання
     *
     * @return Рік першого видання
     */
    public Year getFirstPrintYear() {
        return firstPrintYear;
    }

    /**
     * Встановлює рік першого видання
     *
     * @param firstPrintYear Рік першого видання (має бути не пізніше року видання)
     * @throws FirstPrintYearException якщо рік недопустимий
     */
    public void setFirstPrintYear(int firstPrintYear) throws FirstPrintYearException {
        if (firstPrintYear < 1450 || firstPrintYear > getYear()) {
            throw new FirstPrintYearException("Рік першого видання має бути в межах 1450-" + getYear());
        }
        this.firstPrintYear = Year.of(firstPrintYear);
    }

    /**
     * Перевизначений метод toString для представлення книги у вигляді рядка.
     *
     * @return рядкове представлення книги
     */
    @Override
    public String toString() {
        return "Рідкісна " + super.toString() + String.format(", Орієнтовна вартість: %d $, Перше видання: %d",
                estimatedValue, firstPrintYear.getValue());
    }

    /**
     * Генерує унікальний хеш-код для об'єкта
     *
     * @return Числове значення хешу.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), estimatedValue, firstPrintYear);
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
        RareBook rareBook = (RareBook) o;
        return estimatedValue == rareBook.estimatedValue &&
                firstPrintYear.equals(rareBook.firstPrintYear);
    }
}
