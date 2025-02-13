package com.Get_DataTable_SD;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_DataTable_StepDefinition {
	
	Response resp = null;

	@Given("Hit the bookstore api")
	public void hit_the_bookstore_api() {
	   
             resp =RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	}
	@Then("validate status code")
	public void validate_status_code() {
	    
		int statuscode = resp.getStatusCode();
		Assert.assertTrue("Status code not matching", statuscode==200);
	}


	@Then("Validate data from respose")
	public void validate_data_from_respose(DataTable allData) {
		
		List<List<String>> allListitems = allData.asLists();
		
	
		for (int i =0 ; i<allListitems.size();i++) {
		String expectedVal = allListitems.get(i).get(0);	
		String actualVal = 	resp.getBody().jsonPath().getString(allListitems.get(i).get(1));
		Assert.assertTrue("Value not Matching", expectedVal.equals(actualVal) );
		}
	   
	}









	
	
	
		   
	}


