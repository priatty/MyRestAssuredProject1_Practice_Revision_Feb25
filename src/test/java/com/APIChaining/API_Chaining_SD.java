  package com.APIChaining;

	import io.cucumber.java.en.*;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
	import static io.restassured.RestAssured.given;
	import static org.hamcrest.Matchers.*;

	public class API_Chaining_SD {
	    private static String baseUrl = "https://reqres.in/api";  // Example API
	    private static String userId;
	    private Response response;
	    private RequestSpecification request;

	    @Given("I create a new user")
	    public void i_create_a_new_user() {
	        RestAssured.baseURI = baseUrl;

	        response = given()
	                .header("Content-Type", "application/json")
	                .body("{ \"name\": \"John\", \"job\": \"QA Engineer\" }")
	                .when()
	                .post("/users")
	                .then()
	                .statusCode(201)
	                .extract().response();

	        userId = response.jsonPath().getString("id");
	        System.out.println("Created User ID: " + userId);
	    }

	    @When("I retrieve the created user")
	    public void i_retrieve_the_created_user() {
	        response = given()
	                .when()
	                .get("/users/" + userId)
	                .then()
	                .statusCode(200)
	                .body("data.id", equalTo(Integer.parseInt(userId)))
	                .extract().response();
	    }

	    @Then("I update the user details")
	    public void i_update_the_user_details() {
	        response = given()
	                .header("Content-Type", "application/json")
	                .body("{ \"name\": \"John Updated\", \"job\": \"Senior QA Engineer\" }")
	                .when()
	                .put("/users/" + userId)
	                .then()
	                .statusCode(200)
	                .body("name", equalTo("John Updated"))
	                .extract().response();
	    }

	    @Then("I delete the user")
	    public void i_delete_the_user() {
	        response = given()
	                .when()
	                .delete("/users/" + userId)
	                .then()
	                .statusCode(204)
	                .extract().response();
	    }

	    @Then("I verify the user is deleted")
	    public void i_verify_the_user_is_deleted() {
	        response = given()
	                .when()
	                .get("/users/" + userId)
	                .then()
	                .statusCode(404) // Expecting "Not Found"
	                .extract().response();
	    }
	}	

	

