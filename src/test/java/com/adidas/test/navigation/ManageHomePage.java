package com.adidas.test.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;


public class ManageHomePage {

    public static Performable goAdidasPage() {
        return Task.where("{0} opens the Adidas Page",
                Open.browserOn().the(AdidasHomePage.class));
    }

    public static Performable selectFromHomePage(String selection) {
        return Task.where("{0} selects " + selection,
                Click.on(new By.ByPartialLinkText(selection))
        );
    }

}
