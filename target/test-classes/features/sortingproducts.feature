
@tag3
Feature: sorting of porducts check

  @tag4
  Scenario: checking sorting of products
    Given customer home page
    And login into user account
    When user chooses sort by price low to high
    Then products must be sorted in low to high price


