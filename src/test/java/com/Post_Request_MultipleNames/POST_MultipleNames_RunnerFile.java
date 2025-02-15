
package com.Post_Request_MultipleNames;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/Post_Request_MultipleNamesFF/post_Request.feature"},
		glue={"com.Post_Request_MultipleNames"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report6.json",
		}
		)
public class POST_MultipleNames_RunnerFile {

}
