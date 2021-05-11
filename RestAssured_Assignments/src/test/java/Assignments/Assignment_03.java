package Assignments;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assignment_03 {
	
	Response response;
	String url;
	@Given("Assignment_03_Latest Foreign exchange rates")
	public void assignment_03_latest_Foreign_exchange_rates() {
	  url = "https://api.ratesapi.io/api/";  
	}

	@When("Assignment_03_Incorrect URL is provided")
	public void assignment_03_incorrect_URL_is_provided() {
	  response = RestAssured.get(url); 
	}

	@Then("Assignment_03_assert the response")
	public void assignment_03_assert_the_response() {
	   System.out.println(response.getStatusCode()); 
	   Assert.assertTrue(response.getStatusCode()>=400);
	}

}
