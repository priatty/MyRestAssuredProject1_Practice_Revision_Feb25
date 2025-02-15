package com.Put_Request;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Put_StepDefinition {
	
          Response response=null;
          @Given("Upadate User With Data")
          public void upadate_user_with_data() {
  
		 response =RestAssured
		                    .given()
	                    	 .relaxedHTTPSValidation()
	                    	 .accept(ContentType.JSON)
	                    	 .body("{\r\n"
	                    	 		+ "\"name\"  : \"Priya P\",\r\n"
	                    	 		+ "\"job\"       : \"Automation Engineer\",\r\n"
	                    	 		+ "\"dept\"     : \"QA Automation\",\r\n"
	                    	 		+ "\"mob\"     : \"1234667890\"\r\n"
	                    	 		+ "}\r\n"
	                    	 		+ "\r\n"
	                    	 		+ "")
	                    	 		.put("https://reqres.in/api/users");
	                            }
          
          
          


	   
	}


