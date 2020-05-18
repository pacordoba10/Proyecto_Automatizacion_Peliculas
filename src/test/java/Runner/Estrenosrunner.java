package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = ("src/test/java/Features"),
        glue = ("Seleniumgluecode"),
        plugin = ("json:test/report/cucumber_report.json")
)

public class Estrenosrunner {

}
