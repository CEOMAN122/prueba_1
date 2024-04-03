package co.com.castor.stepdefinitions;

import co.com.castor.questions.ObtenerTextoSegunCampoFlutter;
import co.com.castor.tasks.IncrementarCuenta;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.castor.userinterface.ContadorPage.VALOR_CONTADOR;
import static co.com.castor.userinterface.PrincipalPage.CARD_BUTTONS_DEMO;
import static co.com.castor.userinterface.PrincipalPage.CARD_CONTADOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;


public class ContadorStepDefinitions {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("el usuario {word} esta en App Contador")
    public void elUsuarioEstaEnAppContador(String actor) {
       theActorCalled(actor).attemptsTo(
                WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CARD_CONTADOR)
        );
    }

    @Cuando("el usuario incrementa la cuenta {int} veces")
    public void elUsuarioIncrementaLaCuentaVez(int times) {
        theActorInTheSpotlight().attemptsTo(IncrementarCuenta.numVeces(times));
    }

    @Entonces("el usuario deberia ver la cuenta en {int}")
    public void elUsuarioDeberiaVerLaCuentaEn(int times) {
        theActorInTheSpotlight().should(
                seeThat("La cuenta actual", ObtenerTextoSegunCampoFlutter.presentaElMensaje(VALOR_CONTADOR),equalTo(Integer.toString(times)))
        );
    }
}
