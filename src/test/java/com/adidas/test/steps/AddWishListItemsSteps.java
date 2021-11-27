package com.adidas.test.steps;

import com.adidas.test.items.ItemPage;
import com.adidas.test.items.ManageItems;
import com.adidas.test.login.LoginPage;
import com.adidas.test.login.ManageLogin;
import com.adidas.test.navigation.ManageHomePage;
import com.adidas.test.wishlist.ManageWishList;
import com.adidas.test.wishlist.WishListPage;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AddWishListItemsSteps {

    @Given("{actor} navigate to the Adidas Page")
    public void navigateURL(Actor actor) {
        actor.wasAbleTo(ManageHomePage.goAdidasPage());
    }

    @And("{actor} selects {}")
    public void selectItem(Actor actor, String item) {
        actor.attemptsTo(ManageHomePage.selectFromHomePage(item));
        actor.attemptsTo(ManageItems.closePopUp());
    }

    @And("{actor} can see the page selected with the {}")
    public void viewPageSelected(Actor actor, String page) {
        actor.attemptsTo(Ensure.that(ItemPage.ITEM_PANEL_DESCRIPTION).text().containsIgnoringCase(page));
    }

    @And("{actor} goes to {}")
    public void goesToView(Actor actor, String selection) {
        actor.attemptsTo(ManageItems.selectFromItem(selection));
    }

    @And("{actor} can see the size {} value in the table")
    public void verifySize(Actor actor, String size) {
        actor.attemptsTo(Ensure.that(ItemPage.SIZE_GUIDES_HEADER_TABLE).text().contains(size));
    }

    @And("{actor} closes the window")
    public void closeSizeGuides(Actor actor) {
        actor.attemptsTo(ManageItems.closePopUp());
    }

    @And("{actor} adds the {}")
    public void addItemWishList(Actor actor, String element) {
        actor.attemptsTo(ManageItems.selectFromItem(element));
    }

    @And("{actor} logins from the Wish List")
    public void userLogins(Actor actor) {
        actor.attemptsTo(ManageWishList.loginFromWishList());
    }

    @And("{actor} enters the data to login")
    public void login(Actor actor) throws InterruptedException {
        actor.attemptsTo(ManageLogin.login());
        Thread.sleep(1000);
        actor.attemptsTo(ManageLogin.clickLoginButton());
    }

    @Then("{actor} is logged correctly")
    public void verifyLoggedCorrectly(Actor actor) {
        actor.attemptsTo(WaitUntil.the(LoginPage.LOGIN_WINDOW, isNotVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Ensure.that(WishListPage.LOGIN_PANEL).isNotDisplayed());
    }

    @And("{actor} can see the product {} in his wish list")
    public void verifyWishList(Actor actor, String product) {
        actor.attemptsTo(Ensure.that(WishListPage.DESCRIPTION_ITEM).text().containsIgnoringCase(product));
    }

}
