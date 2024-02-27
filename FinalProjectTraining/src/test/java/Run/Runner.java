package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(tags = "@Panier"	
,features = "src/test/features/AutomationExercice"
,glue = {"StepDefinition","Hooks"}
,publish = true
,plugin= {"pretty"
		,"html:target/cucumber-reports.html"
		,"json:target/cucumber-reports"
		,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",}
,snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
,monochrome = true)

public class Runner {

}
