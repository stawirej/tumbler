package library.library;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    private final List<Book> books;

    public Reader() {
        books = new ArrayList<Book>();
    }

    public List<Book> books() {
        return books;
    }

    public void addBook(final Book book) {
        books.add(book);
    }

}
