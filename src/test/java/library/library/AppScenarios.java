package library.library;

import static tumbler.Tumbler.Given;
import static tumbler.Tumbler.Then;
import static tumbler.Tumbler.When;

import java.io.PrintStream;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import tumbler.Scenario;
import tumbler.Story;
import tumbler.TumblerRunner;

@RunWith(TumblerRunner.class)
@PrepareForTest(App.class)
@Story("Display message about Tumbler")
public class AppScenarios {

    @Scenario("Should display message about Tumbler")
    public void shouldDisplayMessage() {
        Given("'Tumbler Rulezzz;)' message to display");
        final PrintStream printStream = Mockito.mock(PrintStream.class);
        final App app = new App();

        When("Request to display message");
        app.displayMessage(printStream);

        Then("Display 'Tumbler Rulezzz;)'");
        Mockito.verify(printStream).println("Tumbler Rulezzz;)");
    }
}
