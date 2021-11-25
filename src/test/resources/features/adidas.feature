Feature: Add items to the wish list from the adidas page

  Background: Navigate to adidas.co
    Given the url adidas.co

  Scenario Outline: Add items to the wish list and login in
    Given the use goes to the “Trends” section
    And the user selects <selection>
    And the user can see the page selected with the <selection>
    And the user goes to “Size guides”
    And the user can see the size <size> cm value in the table
    And Close the window and add the product to his wish list
    When the user navigates to the wish list
    And the user goes to “Log in”
    And the user enters the data to login
    Then the user is logged correctly
    And the user can see the product in his wish list
    Examples:
      | selection  | size |
      | Ultraboost | 28.8 |