package co.com.castor.stepdefinitions;

import co.com.castor.questions.HomeQuestions;
import co.com.castor.questions.RegisterQuestions;
import co.com.castor.tasks.HomeTasks;
import co.com.castor.tasks.Register;
import co.com.castor.tasks.SeleccionarArtistasPorLote;
import co.com.castor.utils.Wait;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.castor.userinterface.ArtistPanelPage.BTN_CLOSE;
import static co.com.castor.userinterface.ArtistPanelPage.BTN_CONT;
import static co.com.castor.userinterface.LoginPage.TITULOS_APP;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HomeStepDefinitions {
    public Actor user;
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("ell usuario {word} esta en App Deezer")
    public void elUsuarioEstaEnAppContador(String actor) {
        user = theActorCalled(actor);
        user.attemptsTo(
                Wait.theSeconds(8),
                WaitUntil.the(TITULOS_APP, isVisible()).forNoMoreThan(8).seconds()
        );
    }
    @When("completo el registro con los datos user: {word} and password: {word}")
    public void completaSuRegistro(String usuario, String password) {
        user.attemptsTo(
                Register.withCredentialDefault(usuario,password)
        );
        user.remember("textWelcomeIsPresent", RegisterQuestions.isDisplayedTextWelcome());
    }
    @When("selecciono la lista de artistas")
    public void seleccionArtistas() {
        user.attemptsTo(
                SeleccionarArtistasPorLote.conTotal(16),
                Click.on(BTN_CONT),
                Wait.theSeconds(10),
                Click.on(BTN_CLOSE)
        );
        user.remember("textHomeIsPresent", HomeQuestions.isDisplayedTextHome());
    }
    @When("Interactua con el tab bar inferior")
    public void interactua_con_el_tab_bar_inferior() {

        user.remember("homeIsPresent", HomeQuestions.isDisplayedHomeBtn());
        user.remember("exploreIsPresent", HomeQuestions.isDisplayedExploreBtn());
        user.remember("favoritesIsPresent", HomeQuestions.isDisplayedFavoritesBtn());
        user.remember("searchIsPresent", HomeQuestions.isDisplayedSearchBtn());
        user.remember("premiumIsPresent", HomeQuestions.isDisplayedPremiumBtn());


    }

    @When("Interactua con el boton de notificaciones")
    public void interactua_con_el_boton_de_notificaciones() {
        user.attemptsTo(
                HomeTasks.interactWithButtonNotifications()
        );
    }

    @When("Interactua con el boton del perfil")
    public void interactua_con_el_boton_del_perfil() {
        user.attemptsTo(
                HomeTasks.interactWithButtonPerfil()
        );
    }

    @Then("debe haber encontrado todos los elementos")
    public void debe_haber_encontrado_todos_los_elementos() {

        assertThat("boton home",
                user.recall("homeIsPresent"), equalTo(true));
        assertThat("boton explore",
                user.recall("exploreIsPresent"), equalTo(true));
        assertThat("boton favorites",
                user.recall("favoritesIsPresent"), equalTo(true));
        assertThat("boton search",
                user.recall("searchIsPresent"), equalTo(true));
        assertThat("boton premium",
                user.recall("premiumIsPresent"), equalTo(true));

    }

}
