package com.Get_DataDriven;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_Datadriven_StepDefinition {
	
	            Response resp = null;
	@Given("Hit the bookstore api")
	public void hit_the_bookstore_api() {
	    
		resp = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	}
	@Then("validate status code")
	public void validate_status_code() {
	    
		int statuscode = resp.getStatusCode();
		Assert.assertTrue("Status code not matching", statuscode==200);
	}
	@Then("Validate data {string} from {string} response")
	public void validate_data_from_response(String ExpValue, String jsonPath) {
		
		String actValue = resp.getBody().jsonPath().getString(jsonPath);
	    Assert.assertTrue("value Not matching" ,  ExpValue.equals(actValue));
		
	}



	
	
		}


