Feature: Assignment_02 Rates API testing

  Scenario: Assignment_02_Latest exchange Rates
    Given Assignment_02_Latest Foreign exchange rates
    When Assignment_02_API is available
    Then Assignment_02_assert the response body