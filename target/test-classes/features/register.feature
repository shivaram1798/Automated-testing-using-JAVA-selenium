
@register
Feature: Registration page

  @test1
  Scenario: Verifying registration page
    Given open browser
    When User enter first_name, Last_name, Email and password
    Then User is navigated to homepage and logged in
