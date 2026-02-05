import java.util.Objects;

/**
 * Клас для аудіокниг, успадкований від Book
 */
public class Audiobook extends Book {
    private double duration; // тривалість у годинах
    private String narrator; // ім'я диктора

    /**
     * Конструктор створення аудіокниги
     *
     * @param title Назва книги
     * @param author Автор книги
     * @param year Рік видання
     * @param isbn ISBN книги
     * @param page Кількість сторінок (може бути 0)
     * @param genre Жанр книги
     * @param duration Тривалість аудіокниги у годинах
     * @param narrator Ім'я диктора
     */
    public Audiobook(String title, String author, int year, String isbn, int page, Genre genre,
                     double duration, String narrator) throws GenreException, YearException,
            PagesException, AuthorException, TitleException, IsbnException, DurationException, NarratorException {
        super(title, author, year, isbn, page, genre);
        setDuration(duration);
        setNarrator(narrator);
    }

    /**
     * Конструктор копіювання для аудіокниги
     *
     * @param audiobook об'єкт для копіювання
     */
    public Audiobook(Audiobook audiobook) throws BookException {
        super(audiobook);
        this.duration = audiobook.duration;
        this.narrator = audiobook.narrator;
    }

    /**
     * Отримує тривалість аудіокниги
     *
     * @return Тривалість у годинах
     */
    public double getDuration() {
        return duration;
    }

    /**
     * Встановлює тривалість аудіокниги
     *
     * @param duration Тривалість у годинах (має бути більше за 0)
     * @throws DurationException якщо тривалість недопустима
     */
    public void setDuration(double duration) throws DurationException{
        if (duration <= 0) {
            throw new DurationException("Тривалість має бути додатнім числом");
        }
        this.duration = duration;
    }

    /**
     * Отримує ім'я диктора
     *
     * @return Ім'я диктора
     */
    public String getNarrator() {
        return narrator;
    }

    /**
     * Встановлює ім'я диктора
     *
     * @param narrator Ім'я диктора
     * @throws NarratorException якщо ім'я порожнє
     */
    public void setNarrator(String narrator) throws NarratorException{
        if (narrator == null || narrator.trim().isEmpty()) {
            throw new NarratorException("Ім'я диктора не може бути порожнім");
        }
        this.narrator = narrator;
    }

    /**
     * Перевизначений метод toString для представлення книги у вигляді рядка.
     *
     * @return рядкове представлення книги
     */
    @Override
    public String toString() {
        return "Аудіо " + super.toString() + String.format(", Тривалість: %.1f год., Диктор: %s", duration, narrator);
    }

    /**
     * Генерує унікальний хеш-код для об'єкта
     *
     * @return Числове значення хешу.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration, narrator);
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
        Audiobook audiobook = (Audiobook) o;
        return Double.compare(audiobook.duration, duration) == 0 &&
                narrator.equals(audiobook.narrator);
    }
}
