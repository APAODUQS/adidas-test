Feature: Add items to the wish list from the adidas page

  Background: Navigate to adidas.co
    Given user navigate to the Adidas Page

  Scenario Outline: Add items to the wish list and login in
    Given user selects <selection>
    And user can see the page selected with the <selection>
    And user goes to Size Guides
    And user can see the size <size> value in the table
    And user closes the window
    And user adds the item to Wish List
    When user goes to Wish List
    And user goes to Login
    And user enters the data to login
    Then user is logged correctly
    And user can see the product in his wish list
    Examples:
      | selection  | size |
      | Ultraboost | 28.8 cm|