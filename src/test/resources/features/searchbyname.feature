
@tag
Feature: searching by text

  @tag1
  Scenario: searching products with text
    Given customer login page
    When user login 
    And search products with some text
    Then User will be displayed with all rlevant products with types text