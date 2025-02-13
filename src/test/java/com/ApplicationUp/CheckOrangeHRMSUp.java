package com.ApplicationUp;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CheckOrangeHRMSUp {
	
	Response response = null;
			@Given("Open Orange HRMS")
	public void open_orange_hrms() {
	    
				response =RestAssured.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Then("Check OrangeHRMS Up And Running")
	public void check_orange_hrms_up_and_running() {
		int statuscode = response.getStatusCode(); 
		
		System.out.println("Status code is = " + statuscode);
		
		Assert.assertTrue(statuscode==200);
	}




}
