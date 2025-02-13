package com.ApplicationUp;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CheckGoogleUp {
	
	Response respObj = null;
	
	@Given("Open Google")
	public void open_google() {
		
	             respObj =  RestAssured.get("https://www.google.com/");
	    	}
	@Then("Check Google Up And Running")
	public void check_google_up_and_running() {
		
		    int  statuscode = respObj.getStatusCode();
		    
		    System.out.println("Status code is : "+ statuscode);
		    Assert.assertTrue(statuscode==200);
		    
	   	}




}
