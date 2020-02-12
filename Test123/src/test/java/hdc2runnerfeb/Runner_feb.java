package hdc2runnerfeb;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Myfeaturefile",glue="stepdefinitions",tags= {"@Regression, @Sanity "})
public class Runner_feb {
	

}
