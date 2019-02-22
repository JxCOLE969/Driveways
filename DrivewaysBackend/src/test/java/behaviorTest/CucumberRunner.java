package behaviorTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		// The outline for the test
		
		features = {"src/test/resources/DrivewaySearch.feature"},
		
		// where our actual code/step implementations are 
		glue = {"behaviorTest"}
		
		)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
