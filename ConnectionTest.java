package fall2022droject;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions
(plugin= {"html: target/cucumber.html"} ,features="use-cases", glue="fall2022droject")






public class ConnectionTest {

}
