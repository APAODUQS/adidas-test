package com.adidas.test.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class ManageHomePage {

    public static Performable goAdidasPage() {
        return Task.where("{0} opens the Adidas Page",
                Open.browserOn().the(AdidasHomePage.class));
    }

    public static Performable selectFromHomePage(String selection) {
        return Task.where("{0} selects " + selection,
                Click.on(SelectFromHomePageEnum.getValueByName(selection))
        );
    }

}
