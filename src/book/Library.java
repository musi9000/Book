package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mustafa
 */
public class Library {

    private String name;
    public ArrayList<Book> library = new ArrayList<Book>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }

    public void addBook(String title, String author, String publication, String isbn) {
        library.add(new Book(title, author, publication, isbn));
    }

    public void searchBookByAuthor(String author) {
        boolean b = false;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getAuthor().equals(author)) {
                library.get(i).printBookInfo();
                b = true;
            }
        }
        if (b == false) {
            System.out.print("Not found in library!\n");
        }
    }

    public void deleteBookByAuthor(String author) {
        boolean b = false;
        int count = 0;

        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getAuthor().equals(author)) {
                library.remove(i);
                b = true;
                count++;
            }
        }
        if (b == false && count == 0) {
            System.out.print("Not found in library!\n");
        } else {
            System.out.printf("%d book deleted successfully!\n", count);
        }
        
        
    }

    public void allBooksInfo() {
        for (int i = 0; i < library.size(); i++) {
            library.get(i).printBookInfo();
        }
    }

    

}
