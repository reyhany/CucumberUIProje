Feature: Web login
  @smoke
  Scenario: User should be able to login with valid credentials
    Given The user is on the login page
    When The user enters valid credential
    And hits submit
    Then The user should be logged in successfully