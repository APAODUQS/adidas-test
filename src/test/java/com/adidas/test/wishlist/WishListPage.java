package com.adidas.test.wishlist;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WishListPage extends PageObject {
    public static final Target DESCRIPTION_ITEM = Target.the("Description Item").locatedBy("//*[@class='gl-product-card__details']");
    public static final Target GO_LOGIN = Target.the("Login from Wish List").locatedBy("//button[contains(@class,'createAccount')]");
    public static final Target LOGIN_PANEL = Target.the("Login successfully").locatedBy("//*[@class='createAccount-container']");
}
