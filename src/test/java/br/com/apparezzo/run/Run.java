package br.com.apparezzo.run;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    strict = true,
    features = "src/test/resources/feature",
    glue = "br/com/apparezzo/stepdef",
//    tags = {"@qa"},
    plugin = {"json:target/cucumber.json"}
)
public class Run {

}
