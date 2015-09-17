package library.library;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static tumbler.Tumbler.Given;
import static tumbler.Tumbler.Narrative;
import static tumbler.Tumbler.Then;
import static tumbler.Tumbler.When;

import org.junit.runner.RunWith;

import tumbler.Scenario;
import tumbler.Story;
import tumbler.TumblerRunner;

@RunWith(TumblerRunner.class)
@Story("Library")
public class LibraryScenarios {

    public LibraryScenarios() {
        Narrative(
            "As a library user, In order to borrow a book, I want librarian to give me that book, So that I can take it home");
    }

    @Scenario("Should lend an existing book from the library")
    public void shouldLendAnExistingBookFromTheLibrary() {
        Given("'Children from Bullerbyn' book in the library and a pretty librarian.");
        final Library library = new Library();
        final Book book = new Book("Children from Bullerbyn");
        library.addBook(book);
        final Reader reader = new Reader();

        When("this book is borrowed from the library and the librarian is blinking at you");
        library.lend(book).to(reader);

        Then(
            "the library doesn't contain it anymore, you have it and the librarian wants to go out with you but you're already married, so no way.");
        assertThat(reader.books().size(), is(1));
        assertThat(library.books().size(), is(0));
    }

    @Scenario()
    public void shouldNotLendANonexistingBookFromTheLibrary() {
        Given("empty library");
        final Library library = new Library();
        final Book book = new Book("Children from Bullerbyn");
        final Reader reader = new Reader();

        When("we try to borrow 'Children from Bullerbyn' from the library");
        library.lend(book).to(reader);

        Then("the library doesn't let it to be borrowed.");
        assertThat(reader.books().size(), is(0));
    }

    @Scenario(value = "Should accept back a book previously borrowed - PENDING REASON HERE", pending = true)
    // @Scenario(pending = true)
    public void shouldAcceptBackABookPreviouslyBorrowed() {
        Given("'Children from Bullerbyn' has been borrowed from the library");
        // final Library library = new Library();
        // final Book book = new Book("Children from Bullerbyn");
        // library.addBook(book);
        // final Reader reader = new Reader();
        // reader.addBook(book);

        When("this book is given back");
        // library.getBack(book).from(reader);

        Then("the library contains it.");
        // assertThat(library.books().size(), is(1));
        // assertThat(reader.books().size(), is(0));
    }
}