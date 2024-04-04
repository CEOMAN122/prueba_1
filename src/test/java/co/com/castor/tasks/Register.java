package co.com.castor.tasks;

import co.com.castor.interactions.PressKey;
import co.com.castor.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.castor.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Register implements Task {

    private final String user;
    private final String password;

    public Register(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static Performable withCredentialDefault(String user, String password) {
        return new Register(user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Register
        actor.attemptsTo(
                Click.on(BTN_CONTINUE),
                WaitUntil.the(TITULOS_APP, isVisible()).forNoMoreThan(12).seconds(),
                Enter.theValue(user).into(CAMPOS_GENERALES),
                Click.on(BTN_CONTINUE),
                WaitUntil.the(TITULOS_APP, isVisible()).forNoMoreThan(12).seconds(),
                Enter.theValue(password).into(CAMPOS_GENERALES),
                Click.on(BTN_CONTINUE),
                WaitUntil.the(TITULOS_APP, isVisible()).forNoMoreThan(12).seconds(),
                Click.on(BTN_CONTINUE),
                WaitUntil.the(TITULOS_APP, isVisible()).forNoMoreThan(12).seconds(),
                Enter.theValue("20").into(CAMPOS_GENERALES),
                Click.on(BTN_CONTINUE),
                WaitUntil.the(TITULOS_APP, isVisible()).forNoMoreThan(12).seconds(),
                Click.on(BTN_MASCULINO),
                Click.on(BTN_CONTINUE),
                Wait.theSeconds(5),
                WaitUntil.the(TITLE_COOKIES, isVisible()).forNoMoreThan(12).seconds(),
                Click.on(BTN_ACEPTAR),
                WaitUntil.the(TITLE_WELCOME, isVisible()).forNoMoreThan(3).seconds()

        );

    }
}
