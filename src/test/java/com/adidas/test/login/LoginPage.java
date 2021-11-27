package com.adidas.test.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {
    public static final Target EMAIL_TEXT_BOX = Target.the("Email").locatedBy("#login-email");
    public static final Target PW_TEXT_BOX = Target.the("Password").locatedBy("#login-password");
    public static final Target LOGIN_BUTTON = Target.the("Login Button").locatedBy("//button[@type='submit']");
    public static final Target LOGIN_WINDOW = Target.the("Login Window").locatedBy("//*[@role='dialog']");
}
