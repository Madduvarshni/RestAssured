Feature: Assignment_06 Rates API testing

  Scenario: Assignment_06_Specific Date  exchange Rates
    Given Assignment_06_Specific Date exchange rates URI
    When Assignment_06_the API is available with future date url
    Then Assignment_06_assert the response for the prsence of current date