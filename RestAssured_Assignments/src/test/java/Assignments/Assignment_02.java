package Assignments;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Assignment_02 {
	
	Response response;
	String url;
	@Given("Assignment_02_Latest Foreign exchange rates")
	public void assignment_02_latest_Foreign_exchange_rates() {
	 url ="https://api.ratesapi.io/api/latest";
	}

	@When("Assignment_02_API is available")
	public void assignment_02_api_is_available() {
	 response= RestAssured.get(url);
	}

	@Then("Assignment_02_assert the response body")
	public void assignment_02_assert_the_response_body() {
		
	
	 Assert.assertFalse(response.getBody().asString().isEmpty());
	 JsonPath jsonPathEvaluator= response.jsonPath();
	 Assert.assertTrue(jsonPathEvaluator.get("rates.INR").toString().contains("88.6375"));
	
	}	 

}
