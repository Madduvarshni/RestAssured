package Assignments;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Assignment_05 {
	
	Response response;
	String url;
	@Given("Assignment_05_Specific Date exchange rates URI")
	public void assignment_05_specific_Date_exchange_rates_URI() {
		 url= "https://api.ratesapi.io/api/2010-01-12"; 
	}

	@When("Assignment_05_the API is available")
	public void assignment_05_the_API_is_available() {
		 response= RestAssured.get(url);
	}

	@Then("Assignment_05_assert the response")
	public void assignment_05_assert_the_response() {
	 Assert.assertFalse(response.getBody().asString().isEmpty());
	 JsonPath jsonPathEvaluator= response.jsonPath();
	 Assert.assertTrue(jsonPathEvaluator.get("rates.INR").toString().contains("66.21"));
	}

}
