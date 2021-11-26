package com.adidas.test.items;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ItemPage extends PageObject {
    public static final Target TITLE_ITEM =  Target.the("Title Item").locatedBy("#app > div > div:nth-child(1) > div > div > div > div.content-wrapper___3AhOy > div.sidebar-wrapper___26z7B > div.sidebar___2C-EP > div > h1 > span");
    public static final Target SIZE_GUIDES = Target.the("Size Guides").locatedBy("#");
    public static final Target ADD_SIZE = Target.the("Size Guides").locatedBy("#");
    public static final Target ADD_ITEM_WISH_LIST = Target.the("Size Guides").locatedBy("#");
    public static final Target GO_WISH_LIST = Target.the("Size Guides").locatedBy("#");
}
