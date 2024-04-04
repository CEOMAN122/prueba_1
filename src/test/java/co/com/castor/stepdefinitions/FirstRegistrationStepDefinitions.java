package co.com.castor.stepdefinitions;

import co.com.castor.tasks.Register;
import co.com.castor.utils.Wait;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.castor.userinterface.LoginPage.TITULOS_APP;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.actors.OnStage;

public class FirstRegistrationStepDefinitions {

    public Actor user;

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario {word} esta en App Deezer")
    public void elUsuarioEstaEnAppContador(String actor) {
        user = theActorCalled(actor);
        user.attemptsTo(
                Wait.theSeconds(8),
                WaitUntil.the(TITULOS_APP, isVisible()).forNoMoreThan(8).seconds()
        );
    }


    @When("completa el registro con los datos user: {word} and password: {word}")
    public void completaSuRegistro(String usuario, String password) {
        user.attemptsTo(
                Register.withCredentialDefault(usuario,password)
        );
    }

    @Then("debe ver la pantalla de bienvenida")
    public void debeVerLaPantallaDeBienvenida() {
        // Verifica la presencia de elementos que indiquen que la pantalla de bienvenida está visible
    }
}
