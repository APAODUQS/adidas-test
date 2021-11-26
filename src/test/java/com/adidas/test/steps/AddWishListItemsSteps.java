package com.adidas.test.steps;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;

public class AddWishListItemsSteps {

    @Given("{actor} navigate to the Adidas Page")
    public void navigateURL(Actor actor) {
        System.out.println(actor + " navigate to the Adidas Page ");
    }

    @Given("{actor} clicks the section: {}")
    public void goSection(Actor actor, String section) {
        System.out.println(actor + " goes to the “" + section + "” section");
    }

    @And("{actor} selects {}")
    public void selectItem(Actor actor, String item) {
        System.out.println("HELLO");
    }

    @And("{actor} can see the page selected with the {}")
    public void viewPageSelected(Actor actor, String page) {
        System.out.println("HELLO");
    }

    @And("{actor} goes to {}")
    public void goesToView(Actor actor, String view) {
        System.out.println("HELLO");
    }

    @And("{actor} can see the size {double} cm value in the table")
    public void verifySize(Actor actor, Double size) {
        System.out.println("HELLO");
    }

    @And("{actor} closes the window and add the product to his wish list")
    public void addItemWishList(Actor actor) {
        System.out.println("HELLO");
    }

    @When("{actor} navigates to the wish list")
    public void goToTheWishList(Actor actor) {
        System.out.println("HELLO");
    }

    @And("{actor} enters the data to login")
    public void login(Actor actor) {
        System.out.println("HELLO");
    }

    @Then("{actor} is logged correctly")
    public void verifyLoggedCorrectly(Actor actor) {
        System.out.println("HELLO");
    }

    @And("{actor} can see the product in his wish list")
    public void verifyWishList(Actor actor) {
        System.out.println("HELLO");
    }

}
