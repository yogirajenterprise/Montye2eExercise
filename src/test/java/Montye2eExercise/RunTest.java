package Montye2eExercise;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Run the test from here
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = ".", format="html:target/Cucumber.Reports", tags="@RegressionTest, @SmokeTest")
public class RunTest{

}
