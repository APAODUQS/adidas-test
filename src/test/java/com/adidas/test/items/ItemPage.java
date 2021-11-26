package com.adidas.test.items;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ItemPage extends PageObject {
    public static final Target TITLE_ITEM =  Target.the("Title Item").locatedBy("#app > div > div:nth-child(1) > div > div > div > div.content-wrapper___3AhOy > div.sidebar-wrapper___26z7B > div.sidebar___2C-EP > div > h1 > span");
    public static final Target SIZE_GUIDES = Target.the("Size Guides").locatedBy("#app > div > div:nth-child(1) > div > div > div > div.content-wrapper___3AhOy > div.sidebar-wrapper___26z7B > div.sidebar___2C-EP > section > div.sizes-bottom-controls___3zmLr > a.gl-link.size-chart-link___FoLY2");
    public static final Target ADD_ITEM_WISH_LIST = Target.the("Add Item to Wish List").locatedBy("//*[@id='app']/div/div[1]/div/div/div/div[2]/div[2]/div[2]/section/div[3]/div/div");
    public static final Target GO_WISH_LIST = Target.the("Wish List").locatedBy("//*[@id='app']/div/div[1]/div/div/div/div[1]/div[2]/div[3]/div/div[2]/div[3]/a");
    public static final Target SIZE_GUIDES_HEADER_TABLE = Target.the("Header Size Guides Table").locatedBy("#modal-root > div > div > div > div.gl-modal__main-content > div > section.size-guidance_container > div.gl-table.gl-table--striped-columns.gl-table--sticky-lead-column.gl-vspace > div > div.gl-table__row.gl-table__row--head");
    public static final Target CLOSE_POP_UP = Target.the("Header Size Guides Table").locatedBy("#modal-root > div > div > button");
}
