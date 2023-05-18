package najah.test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html: target/cucumber.html"},
features = "tests",
monochrome=true,
snippets=SnippetType.CAMELCASE,
glue = {"najah.test"})
public class Applied {

}
