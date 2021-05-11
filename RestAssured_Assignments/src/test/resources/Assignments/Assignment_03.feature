Feature: Assignment_03 Rates API testing

  Scenario: Assignment_03_Latest exchange Rates
    Given Assignment_03_Latest Foreign exchange rates
    When Assignment_03_Incorrect URL is provided
    Then Assignment_03_assert the response
