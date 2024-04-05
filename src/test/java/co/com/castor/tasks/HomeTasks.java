package co.com.castor.tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.castor.userinterface.HomePage.*;
import static co.com.castor.userinterface.LoginPage.TITULOS_APP;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HomeTasks {

    public static Performable interactWithButtonPerfil() {
        return Task.where("{0} Interaccion con el boton de perfil",
                actor -> {

                    actor.attemptsTo(
                            Click.on(BTN_PERFIL),
                            Click.on(BTN_BACK)
                    );
                }
        );
    }
    public static Performable interactWithButtonNotifications() {
        return Task.where("{0} Interaccion con el boton de notificaciones",
                actor -> {

                    actor.attemptsTo(
                            WaitUntil.the(BTN_NOTIFICATIONS, isVisible()).forNoMoreThan(12).seconds(),
                            Click.on(BTN_NOTIFICATIONS),
                            WaitUntil.the(BTN_BACK, isVisible()).forNoMoreThan(12).seconds(),
                            Click.on(BTN_BACK)
                    );
                }
        );
    }


}
