package com.adidas.test.items;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ManageItems {

    public static Performable selectFromItem(String selection) {
        return Task.where("{0} selects " + selection,
                Click.on(SelectFromItemEnum.getValueByName(selection))
        );
    }

    public static Performable closePopUp() {
        return Task.where("{0} closes the popup ",
                Click.on(ItemPage.CLOSE_POP_UP)
        );
    }

}
