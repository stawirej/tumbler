package library.library;

import java.io.PrintStream;

/**
 * Hello world!
 */
public class App {

    public static void main(final String[] args) {

        final App app = new App();
        app.displayMessage(System.out);
    }

    public void displayMessage(final PrintStream printStream) {
        printStream.println("Tumbler Rulezzz;)");
    }
}
