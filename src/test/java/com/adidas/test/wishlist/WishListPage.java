package com.adidas.test.wishlist;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WishListPage extends PageObject {
    public static final Target DESCRIPTION_ITEM = Target.the("Description Item").locatedBy("#app > div > div:nth-child(1) > div > div > div > div.wishlist-page___bamzc > div > div.col-s-12.col-l-16.col-xl-18 > div:nth-child(1) > div.gl-vspace.wishlist-items-container___eUMbn > div > div.col-s-3 > div > div > div > div > div.gl-product-card__details");
    public static final Target GO_LOGIN = Target.the("Login from Wish List").locatedBy("#app > div > div:nth-child(1) > div > div > div > div.wishlist-page___bamzc > div > div.col-s-12.col-l-16.col-xl-18 > div:nth-child(1) > div.gl-vspace.wishlist-items-container___eUMbn > div > div.col-s-9 > div > div > div > div.gl-vspace-bpall-small > div > button");
}
