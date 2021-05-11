package Assignments;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assignment_04 {
	
	Response response;
	String url;
	@Given("Assignment_04_Specific Date exchange rates URI")
	public void assignment_04_specific_Date_exchange_rates_URI() {
	   url= "https://api.ratesapi.io/api/2010-01-12"; 
	}

	@When("Assignment_04_the API is available")
	public void assignment_04_the_API_is_available() {
       response= RestAssured.get(url);
	}

	@Then("Assignment_04_assert the response status")
	public void assignment_04_assert_the_response_status() {
	    Assert.assertTrue(response.getStatusCode()==200);
	}
}
