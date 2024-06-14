
@tag
Feature: Add Items to Cart

  @tag1
   Scenario: Add Items to Cart and Validate Details
    When login to account
    And add items tocart
    Then the cart item count should be updated to plus one
    And the cart total price should be equal to the previous price plus item price
    And the cart should display the added item titlee

