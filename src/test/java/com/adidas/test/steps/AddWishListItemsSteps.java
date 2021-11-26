package com.adidas.test.steps;

import com.adidas.test.items.ItemPage;
import com.adidas.test.items.ManageItems;
import com.adidas.test.navigation.ManageHomePage;
import com.adidas.test.wishlist.ManageWishList;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class AddWishListItemsSteps {

    @Given("{actor} navigate to the Adidas Page")
    public void navigateURL(Actor actor) {
        System.out.println(actor + " navigate to the Adidas Page ");
        actor.wasAbleTo(ManageHomePage.goAdidasPage());
    }

    @And("{actor} selects {}")
    public void selectItem(Actor actor, String item) {
        System.out.println(actor + " selects " + item);
        actor.attemptsTo(ManageHomePage.selectFromHomePage(item));
        actor.attemptsTo(ManageItems.closePopUp());
    }

    @And("{actor} can see the page selected with the {}")
    public void viewPageSelected(Actor actor, String page) {
        System.out.println(actor + " can see the page selected with the " + page);
        actor.attemptsTo(Ensure.that(ItemPage.TITLE_ITEM).text().containsIgnoringCase(page));
    }

    @And("{actor} goes to {}")
    public void goesToView(Actor actor, String selection) {
        System.out.println(actor + " goes to " + selection);
        actor.attemptsTo(ManageItems.selectFromItem(selection));
    }

    @And("{actor} can see the size {} value in the table")
    public void verifySize(Actor actor, String size) {
        System.out.println(actor + " can see the size " + size + " value in the table ");
        actor.attemptsTo(Ensure.that(ItemPage.SIZE_GUIDES_HEADER_TABLE).text().contains(size));
    }

    @And("{actor} closes the window")
    public void closeSizeGuides(Actor actor) {
        System.out.println(actor + " closes the window");
        actor.attemptsTo(ManageItems.closePopUp());
    }

    @And("{actor} adds the {}")
    public void addItemWishList(Actor actor, String element) {
        System.out.println(actor + " adds the " + element);
        actor.attemptsTo(ManageItems.selectFromItem(element));
    }

    @And("{actor} logins from the Wish List")
    public void userLogins(Actor actor) {
        System.out.println(actor + " logins from the Wish List ");
        actor.attemptsTo(ManageWishList.loginFromWishList());
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
