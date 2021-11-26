Feature: Add items to the wish list from the adidas page

  Background: Navigate to adidas.co
    Given user navigate to the Adidas Page

  Scenario Outline: Add items to the wish list and login in
    Given user clicks the section: Trends
    And user selects <selection>
    And user can see the page selected with the <selection>
    And user goes to Size Guides
    And user can see the size <size> cm value in the table
    And user closes the window and add the product to his wish list
    When user navigates to the wish list
    And user goes to Login
    And user enters the data to login
    Then user is logged correctly
    And user can see the product in his wish list
    Examples:
      | selection  | size |
      | Ultraboost | 28.8 |