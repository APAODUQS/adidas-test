package com.adidas.test.items;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ItemPage extends PageObject {
    public static final Target ITEM_PANEL_DESCRIPTION =  Target.the("Title Item").locatedBy("//*[contains(@class,'sidebar-wrapper')]");
    public static final Target SIZE_GUIDES = Target.the("Size Guides").locatedBy("//*[@data-auto-id='size-chart-link']");
    public static final Target ADD_ITEM_WISH_LIST = Target.the("Add Item to Wish List").locatedBy("//*[contains(@class,'undefined toggle_wishlist_button')]");
    public static final Target GO_WISH_LIST = Target.the("Wish List").locatedBy("//*[@href='/wishlists']");
    public static final Target SIZE_GUIDES_HEADER_TABLE = Target.the("Header Size Guides Table").locatedBy("//*[contains(@class,'gl-table__row--head')]");
    public static final Target CLOSE_POP_UP = Target.the("Header Size Guides Table").locatedBy("//button[@class='gl-modal__close']");
}
