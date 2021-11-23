package com.adidas.test.steps;

import io.cucumber.java.en.*;

public class AddWishListItemsSteps {
    @Given("^the url (.*)$")
    public void navigateURL(String url) {
        System.out.println("HELLO");
    }

    @Given("^the use goes to the “(.*)” section$")
    public void goSection(String section) {
        System.out.println("HELLO");
    }

    @And("^the user selects (.*)$")
    public void selectItem(String item) {
        System.out.println("HELLO");
    }

    @And("^the user can see the page selected with the (.*)$")
    public void viewPageSelected(String page) {
        System.out.println("HELLO");
    }

    @And("^the user goes to “(.*)”$")
    public void goesToView(String view) {
        System.out.println("HELLO");
    }

    @And("^the user can see the size (.*) cm value in the table$")
    public void verifySize(Double size) {
        System.out.println("HELLO");
    }

    @And("^Close the window and add the product to his wish list$")
    public void addItemWishList() {
        System.out.println("HELLO");
    }

    @When("^the user navigates to the wish list$")
    public void goToTheWishList() {
        System.out.println("HELLO");
    }

    @And("^the user enters the data to login$")
    public void login() {
        System.out.println("HELLO");
    }

    @Then("^the user is logged correctly$")
    public void verifyLoggedCorrectly() {
        System.out.println("HELLO");
    }

    @And("^the user can see the product in his wish list$")
    public void verifyWishList() {
        System.out.println("HELLO");
    }
}
