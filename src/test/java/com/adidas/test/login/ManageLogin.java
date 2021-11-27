package com.adidas.test.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ManageLogin {

    public static Performable enterEmail(String email) {
        return Task.where("{0} enters the email",
                Enter.theValue(email).into(LoginPage.EMAIL_TEXT_BOX)
        );
    }

    public static Performable enterPW(String pw) {
        return Task.where("{0} enters the password",
                Enter.theValue(pw).into(LoginPage.PW_TEXT_BOX)
        );
    }

    public static Performable clickLoginButton() {
        Ensure.that(LoginPage.LOGIN_BUTTON).isEnabled();
        return Task.where("{0} clicks Login Button",
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
