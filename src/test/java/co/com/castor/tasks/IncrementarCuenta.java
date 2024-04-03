package co.com.castor.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.castor.userinterface.ContadorPage.BOTON_CONTADOR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class IncrementarCuenta {

    public static Performable numVeces(int times) {
        return Task.where("Click en el contador",
                actor -> {
                   actor.attemptsTo(WaitUntil.the(BOTON_CONTADOR, isEnabled()).forNoMoreThan(5).seconds());
                    for (int i = 0; i < times; i++) {
                        actor.attemptsTo(Click.on(BOTON_CONTADOR));
                    }
                }
        );
    }
}

