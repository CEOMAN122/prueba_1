package co.com.castor.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Home.feature",
        tags = "@interactuar-home",
        glue = "co.com.castor.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class InteractionHomeRunner {
}
