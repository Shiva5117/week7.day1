package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefenition.ProjectSpecificMethods;

@CucumberOptions(features = "src\\test\\java\\features", 
				glue = "stepDefenition",
				monochrome = true, publish = true)
public class RunTests extends ProjectSpecificMethods{

}
