package Assignments;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assignment_01 {
	
	Response response;
	String url;
	@Given("Assignment_01_Latest Foreign exchange rates")
	public void assignment_01_latest_Foreign_exchange_rates() {
	  url = "https://api.ratesapi.io/api/latest";  
	}

	@When("Assignment_01_API is available")
	public void assignment_01_api_is_available() {
	  response= RestAssured.get(url); 
	  
	}

	@Then("Assignment_01_I validate the outcomes")
	public void assignment_01_i_validate_the_outcomes() {
		Assert.assertFalse(response.getBody().asString().isEmpty());
	    Assert.assertTrue(response.getStatusCode()==200);
	}

}
