
package com.Put_Request;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/Put_Request_FF/Put_Request.feature"},
		glue={"com.Put_Request"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report12.json",
		}
		)
public class Put_RunnerFile {

}
