
package com.Get_DataDriven;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/Get_DataDriven_FF/GET_Datadriven.feature"},
		glue={"com.Get_DataDriven"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report2.json",
		}
		)
public class GET_Datadriven_RunnerFile {

}
