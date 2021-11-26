package com.adidas.test.wishlist;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ManageWishList {

    public static Performable loginFromWishList() {
        return Task.where("{0} logins ",
                Click.on(WishListPage.GO_LOGIN)
        );
    }

}
