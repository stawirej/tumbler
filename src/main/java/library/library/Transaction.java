package library.library;

public class Transaction extends Library implements Assignable {

    public Transaction(final Library library) {
        super(library);
    }

    @Override
    public void to(final Reader reader) {
        if (books.contains(transactionalBook)) {
            reader.addBook(transactionalBook);
            books.remove(transactionalBook);
            transactionalBook = null;
        }
    }
}
