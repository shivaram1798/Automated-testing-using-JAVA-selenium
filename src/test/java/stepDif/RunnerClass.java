package stepDif;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/sortingproducts.feature",
glue= {"stepDif"},
plugin = {"pretty", "html:out/cucumber-reports/report.html",
"json:out/cucumber-reports/Cucumber.json" })



public class RunnerClass {
	
	

}
