package com.adidas.test.items;

import net.serenitybdd.screenplay.targets.Target;

public enum SelectFromItemEnum {
    SIZE_GUIDES("Size Guides", ItemPage.SIZE_GUIDES),
    ADD_ITEM_WISH_LIST("item to Wish List", ItemPage.ADD_ITEM_WISH_LIST),
    GO_WISH_LIST("Wish List", ItemPage.GO_WISH_LIST);

    String id;
    Target target;

    SelectFromItemEnum(String id, Target target) {
        this.id = id;
        this.target = target;
    }

    public static Target getValueByName(String selection) {
        Target element = null;
        for (SelectFromItemEnum object : SelectFromItemEnum.values()) {
            if (object.id.equals(selection)) {
                element = object.target;
            }
        }
        return element;
    }
}
