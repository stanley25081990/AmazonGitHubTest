package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags= {"@AmazonTask"},plugin = {"pretty","html: report"}, monochrome = true, glue = {"testMethods"}, features="src\\test\\resources\\Feature\\Amazon.feature")
public class RunnerTest {

}
