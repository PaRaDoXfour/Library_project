import java.time.LocalDate;
import java.util.UUID;

/**
 * Клас для запису про видачу книги
 */
public class LoanRecord {
    private final UUID recordId;
    private final Book book;
    private final String borrowerName;
    private final LocalDate loanDate;
    private LocalDate returnDate;

    /**
     * Конструктор для створення запису про видачу
     * @param book книга, яку видають
     * @param borrowerName ім'я позичальника
     * @param loanDate дата видачі
     * @param returnDate дата повернення
     */
    public LoanRecord(Book book, String borrowerName, LocalDate loanDate, LocalDate returnDate) {
        this.recordId = UUID.randomUUID();
        this.book = book;
        this.borrowerName = borrowerName;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    /**
     * Отримує унікальний ідентифікатор запису про видачу
     * @return UUID запису
     */
    public UUID getRecordId() {
        return recordId;
    }
    /**
     * Отримує книгу, яка була видана
     * @return об'єкт книги
     */
    public Book getBook() {
        return book;
    }

    /**
     * Отримує ім'я позичальника
     * @return рядок з ім'ям позичальника
     */
    public String getBorrowerName() {
        return borrowerName;
    }

    /**
     * Отримує дату видачі книги
     * @return об'єкт LocalDate з датою видачі
     */
    public LocalDate getLoanDate() {
        return loanDate;
    }

    /**
     * Отримує дату повернення книги
     * @return об'єкт LocalDate з датою повернення або null, якщо книга ще не повернена
     */
    public LocalDate getReturnDate() {
        return returnDate;
    }

    /**
     * Встановлює дату повернення книги
     * @param returnDate дата повернення (може бути null, якщо книга ще не повернена)
     */
    public void setReturnDate(LocalDate returnDate) {
        // Перевірки немає, тому що може бути null
        this.returnDate = returnDate;
    }

    /**
     * Перевизначений метод для рядкового представлення об'єкта
     * @return рядок з інформацією про видачу у форматі:
     */
    @Override
    public String toString() {
        return "Запис про видачу: ID=" + recordId +
                ", Книга=" + book.getTitle() +
                ", Позичальник=" + borrowerName +
                ", Дата видачі=" + loanDate +
                ", Дата повернення=" + (returnDate != null ? returnDate : "ще не повернено");
    }
}