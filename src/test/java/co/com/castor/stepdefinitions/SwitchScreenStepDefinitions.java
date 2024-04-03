package co.com.castor.stepdefinitions;

import co.com.castor.questions.ObtenerTextoSegunCampoFlutter;
import co.com.castor.utils.ScrollFlutterLargo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.castor.userinterface.PrincipalPage.CARD_BUTTONS_DEMO;
import static co.com.castor.userinterface.PrincipalPage.CARD_SWITCH;
import static co.com.castor.userinterface.SwitchScreenPage.SWITCH;
import static co.com.castor.userinterface.SwitchScreenPage.SWITCH_TILE;
import static co.com.castor.userinterface.SwitchScreenPage.TXT_SWITCH_TILE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static org.hamcrest.CoreMatchers.equalTo;

public class SwitchScreenStepDefinitions {


    @Dado("el usuario {word} esta en Switch Screen")
    public void elUsuarioEstaEnSwitchScreen(String actor) {
        theActorCalled(actor).attemptsTo(
                 WaitUntil.the(CARD_BUTTONS_DEMO, isVisible()).forNoMoreThan(5).seconds(),
                ScrollFlutterLargo.toDown(),
                Click.on(CARD_SWITCH));
    }

    @Cuando("el usuario switchea el Switch Tile")
    public void elUsuarioSwitcheaElSwitchTile() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SWITCH, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SWITCH_TILE)
        );
    }

    @Entonces("deberia ver {string}")
    public void elUsuarioDeberiaVer(String statusValue) {
        theActorInTheSpotlight().should(
                seeThat(ObtenerTextoSegunCampoFlutter.presentaElMensaje(TXT_SWITCH_TILE), equalTo(statusValue))
        );
    }

}
