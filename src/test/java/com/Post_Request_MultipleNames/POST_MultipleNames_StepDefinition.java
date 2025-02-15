package com.Post_Request_MultipleNames;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST_MultipleNames_StepDefinition {
	   
	   Response response = null;
	
	@Given("Create User {string} With Data From File")
	public void create_user_with_data_from_file(String username) throws IOException {
	  
		String jsondata = new String(Files.readAllBytes(Paths.get("src/test/resources/com/Post_Request_MultipleNamesFF/user.json")));
		Files.readAllBytes(Paths.get("src/test/resources/com/Post_Request_MultipleNamesFF/user.json"));
		
		JSONObject jsonobj = new JSONObject(jsondata);
		jsonobj.put("name", username);
		
		String actjson = jsonobj.toString();
		
		System.out.println("Json before post = "  + actjson);
		
		response =RestAssured
                .given()
            	 .relaxedHTTPSValidation()
            	 .accept(ContentType.JSON)
            	 .body(jsonobj)
            	 		.post("https://reqres.in/api/users");
                   
	}
	
	



                
       
	   
	}


