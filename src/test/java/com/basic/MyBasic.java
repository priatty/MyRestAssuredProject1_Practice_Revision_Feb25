package com.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.When.Whens;

public class MyBasic {
	
	
	@Given("Login to HRMS system with valid user")
	public void login_to_hrms_system_with_valid_user() {
	    System.out.println("I am Login with User");
	}
	@When("go to PIM tab")
	public void go_to_pim_tab() {
	    System.out.println("Performing Action");	
	    }
	
	@Then("add button check")
	public void add_button_check() {
	   System.out.println("Validating Button");
	   
	}
	   @When("go to admin tab")
	   public void go_to_admin_tab() {
	       System.out.println("Performing Action");
	   }
	   @Then("delete button check")
	   public void delete_button_check() {
	      System.out.println("Validating Delete Button");
	      
	   }

	}



