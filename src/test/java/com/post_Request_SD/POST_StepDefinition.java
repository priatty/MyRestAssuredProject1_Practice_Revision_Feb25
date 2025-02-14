package com.post_Request_SD;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST_StepDefinition {
	
          Response response=null;
          @Given("Create User With Data")
          public void create_user_with_data() {
  
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
	                    	 		.post("https://reqres.in/api/users");
	                            }
          
          
          @Then("Validate user created")
          public void validate_user_created() {
        	  
	     String allresp = response.asString();
		System.out.println("All details " + allresp);
		int Statuscode =response.getStatusCode();
		System.out.println("StatusCode :" + Statuscode);
		Assert.assertTrue("Status code not matching", Statuscode==201);
	    	}

          @Then("validate user ID is non null value")
          public void validate_user_id_is_non_null_value() {
              
        	  String actID = response.getBody().jsonPath().getString("id");
        	  Assert.assertTrue(actID !=null);
        	  Assert.assertTrue(Integer.parseInt(actID)>0);
          }




	   
	}


