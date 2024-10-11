package com.e2etests.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src_spec_features"},//Pour définir l'emplacement des features en format Gherkin
		plugin= {"pretty","html:target/cucumber-report.html"},//Pour définir le format de rapport
		tags=("@Logout"),//pour définir quel cas de test à tester
		monochrome=true,//Pour clarifier le console
		snippets=CAMELCASE
		//glue = {"src/test/java/com/e2etests/automation/stepDefinition"}	//chemin des classes stepDefinition
		)
public class RunWebSuiteTest {

	
}
