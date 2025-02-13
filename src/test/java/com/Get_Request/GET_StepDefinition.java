package com.Get_Request;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_StepDefinition {
	
	Response resp = null;
	
	@Given("Hit the bookstore api")
	public void hit_the_bookstore_api() {
	     
		resp = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	}
	
	
	@Then("validate status code")
	public void validate_status_code() {
		
		int statuscode  = resp.getStatusCode();
		System.out.println("Status code is : " + statuscode );
		Assert.assertTrue("Status code not matching", statuscode==200);
	    
		
	}
	//Validating single title
	@Then("validate Git Pocket Guide title present")
	public void validate_git_pocket_guide_title_present() {
		
	       String jsondata = resp.getBody().asString();
	       System.out.println("JSON data : " +jsondata);
	       
	       String bookTitle = resp.getBody().jsonPath().getString("books[0].title");
	       
	       Assert.assertTrue("Title not matching", bookTitle.equals("Git Pocket Guide"));
		
		
	}
	
	//Validating single subTitle
	@Then("validate A Working Introduction subtilte is present")
	public void validate_a_working_introduction_subtilte_is_present() {
	    
		String subTitle = resp.getBody().jsonPath().getString("books[0].subTitle");
		
		Assert.assertTrue("Subtitle not matching",subTitle.equals("A Working Introduction"));
	}



	       //validating multiple title
	
	@Then("validate {string} at  jsonpath {string} title present")
	public void validate_title_present(String title, String jsonpath) {
		
	       String jsondata = resp.getBody().asString();
	       System.out.println("JSON data : " +jsondata);
	       
	       String actualbookTitle = resp.getBody().jsonPath().getString(jsonpath);
	       
	       Assert.assertTrue("Title not matching", actualbookTitle.equals(title));
	       
		
	}
	
	//Validating Multiple SubTitle
	

	@Then("validate {string} is present  at json path {string}")
	public void validate_is_present_at_json_path(String subTitle, String jsonpath) {
	 
       String actualsubTitle = resp.getBody().jsonPath().getString(jsonpath);
		
		Assert.assertTrue("Subtitle not matching",actualsubTitle.equals(subTitle));
			}



//Validating single Author
	
	@Then("validate Richard E. Silverman author is present")
	public void validate_richard_e_silverman_author_is_present() {
	  
		String authorname = resp.getBody().jsonPath().getString("books[0].author");
		Assert.assertTrue("Name not matching", authorname.equals("Richard E. Silverman"));
	}
	
	
	
	@Then("validate as status code")
	public void validate_as_status_code() {
	     int statuscode =resp.getStatusCode();
	     System.out.println("Status code : " +statuscode);
	     Assert.assertTrue("Status code not matching", statuscode==200);
	}
	@Then("validate {string} at jsonpath {string} pageNumber present")
	public void validate_at_jsonpath_books_pages_page_number_present(String pageNumber, String jsonpath) {
	    
		int actualpageNum = resp.getBody().jsonPath().getInt(jsonpath);
		
		int expectedpageNum = Integer.parseInt(pageNumber);
		Assert.assertTrue("Invalid page number", actualpageNum == expectedpageNum);
		
	
	}







	   
	}


