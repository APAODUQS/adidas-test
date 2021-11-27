package com.adidas.test.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://adidas.co")
public class AdidasHomePage extends PageObject {
    public static final Target ULTRABOOST_21 = Target.the("Trends Ultraboost 21").locatedBy("#app > div > div:nth-child(1) > div > div > div > div.main___3cBug.has_usp___1zXsg > div:nth-child(11) > section > div > div:nth-child(2) > div > div > div > div:nth-child(3)");
}
