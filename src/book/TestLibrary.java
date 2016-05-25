package book;

/**
 *
 * @author mustafa
 */
public class TestLibrary {

    public static void main(String[] args) {
        Library lib = new Library("BookStore");

        lib.addBook("Аз и майор Блюхер", "Васил Пармаков", "Black Flamingo", "9789542915027");
        lib.addBook("Анатол", "Артур Шницлер", "Black Flamingo", "9789542915089");
        lib.addBook("Тук и сега", "Роланд Шимелпфениг", "Black Flamingo", "9789542915034");
        lib.addBook("22 ноември 1963", "Стивън Кинг", "Плеяда", "9789544093259");
        lib.addBook("Възкресяване", "Стивън Кинг", "Плеяда", "9789544093518");

        lib.allBooksInfo();
        System.out.print("----------------------\n");

        System.out.print("Търсене на книга зададен автор (Стивън Кинг) - ");
        lib.searchBookByAuthor("Стивън Кинг");
        
        System.out.print("Изтриване на книга зададен автор (Толстой) - ");
        lib.deleteBookByAuthor("Толстой");
        
        System.out.print("Изтриване на книга зададен автор (Стивън Кинг) - ");
        lib.deleteBookByAuthor("Стивън Кинг");
        
        System.out.print("----------------------\n");
        lib.allBooksInfo();
    }
}
