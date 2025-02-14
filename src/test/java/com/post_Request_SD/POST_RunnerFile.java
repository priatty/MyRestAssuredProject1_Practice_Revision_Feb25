
package com.post_Request_SD;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/post_Request_FF/post_Request.feature"},
		glue={"com.post_Request_SD"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report2.json",
		}
		)
public class POST_RunnerFile {

}
