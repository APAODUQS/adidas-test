package com.adidas.test.navigation;

import net.serenitybdd.screenplay.targets.Target;

public enum SelectFromHomePageEnum {
    ULTRABOOST_21("Ultraboost", AdidasHomePage.ULTRABOOST_21);

    String id;
    Target target;

    SelectFromHomePageEnum(String id, Target target) {
        this.id = id;
        this.target = target;
    }

    public static Target getValueByName(String selection) {
        Target element = null;
        for (SelectFromHomePageEnum object : SelectFromHomePageEnum.values()) {
            if (object.id.equals(selection)) {
                element = object.target;
            }
        }
        return element;
    }
}
