package com.Background_SD;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/Background_FF"},
		glue={"com.Background_SD"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport.html",
				"json:target/cucumber-report10.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/ExtentReport1.html"
		}
		)
public class Background_Runner {

}
