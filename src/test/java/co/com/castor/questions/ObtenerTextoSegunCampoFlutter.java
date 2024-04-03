package co.com.castor.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ObtenerTextoSegunCampoFlutter implements Question<String> {

    private Target campo;

    public ObtenerTextoSegunCampoFlutter(Target campo) {
        this.campo = campo;
    }

    @Override
    @Step("verifica el mensaje de error en el campo")
    public String answeredBy(Actor actor) {
        String elTexto = "";
        actor.attemptsTo(WaitUntil.the(campo, isVisible()).forNoMoreThan(5).seconds());
        elTexto = campo.resolveFor(actor).getAttribute("content-desc");
        return elTexto;
    }
    public static ObtenerTextoSegunCampoFlutter presentaElMensaje(Target campo) {
        return new ObtenerTextoSegunCampoFlutter(campo);
    }
}
