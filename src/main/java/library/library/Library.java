package library.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    protected final List<Book> books;
    protected Book transactionalBook;

    public Library() {
        books = new ArrayList<Book>();
        transactionalBook = null;
    }

    public Library(final Library library) {
        books = library.books;
        transactionalBook = library.transactionalBook;
    }

    public void addBook(final Book book) {
        books.add(book);
    }

    public List<Book> books() {
        return books;
    }

    public Assignable lend(final Book book) {
        transactionalBook = book;
        return new Transaction(this);
    }

}
