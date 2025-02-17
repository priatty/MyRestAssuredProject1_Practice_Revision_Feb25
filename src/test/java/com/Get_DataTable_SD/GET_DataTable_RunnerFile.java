
package com.Get_DataTable_SD;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/GET_DataTable_FF/GET_DataTable.feature"},
		glue={"com.Get_DataTable_SD"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report5.json",
		}
		)
public class GET_DataTable_RunnerFile {

}
