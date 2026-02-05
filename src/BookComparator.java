import java.util.Comparator;

/**
 * Клас, що містить набір компараторів для сортування книг за різними критеріями.
 * Усі компаратори реалізовані як анонімні класи та доступні як статичні поля.
 */
public class BookComparator {
    /**
     * Компаратор для сортування книг за назвою в алфавітному порядку.
     * Порівнює книги за допомогою методу String.compareTo().
     * Приклад використання:
     * books.sort(BookComparator.byTitle);
     */
    public static Comparator<Book> byTitle = new Comparator<>() {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getTitle().compareTo(b2.getTitle());
        }
    };

    /**
     * Компаратор для сортування книг за іменем автора в алфавітному порядку.
     * Використовує лексикографічне порівняння рядків.
     * Приклад використання:
     * books.sort(BookComparator.byAuthor);
     */
    public static Comparator<Book> byAuthor = new Comparator<>() {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getAuthor().compareTo(b2.getAuthor());
        }
    };

    /**
     * Компаратор для сортування книг за роком видання (від старіших до новіших).
     * Використовує Integer.compare() для безпечного порівняння цілих чисел.
     * Приклад використання:
     * books.sort(BookComparator.byYear);
     */
    public static Comparator<Book> byYear = new Comparator<>() {
        @Override
        public int compare(Book b1, Book b2) {
            return Integer.compare(b1.getYear(), b2.getYear());
        }
    };

    /**
     * Компаратор для сортування книг за кількістю сторінок (від меншої до більшої).
     *
     * Приклад використання:
     * books.sort(BookComparator.byPages);
     */
    public static Comparator<Book> byPages = new Comparator<>() {
        @Override
        public int compare(Book b1, Book b2) {
            return Integer.compare(b1.getPages(), b2.getPages());
        }
    };
}