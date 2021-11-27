package com.adidas.test.login;

import com.adidas.test.data.DataUser;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class ManageLogin {

    public static Performable login() {
        return Task.where("{0} enters the email and password",
                Enter.theValue(DataUser.USER_EMAIL).into(LoginPage.EMAIL_TEXT_BOX),
                Enter.theValue(DataUser.USER_PW).into(LoginPage.PW_TEXT_BOX).thenHit(Keys.ENTER)
        );
    }

    public static Performable clickLoginButton() {
        return Task.where("{0} clicks Login Button",
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

}
