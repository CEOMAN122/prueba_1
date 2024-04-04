package co.com.castor.questions;

import co.com.castor.userinterface.LoginPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;


public class RegisterQuestions {

    public static Question<Boolean> isDisplayedTextWelcome() {
        return actor -> Presence.of(LoginPage.TITLE_WELCOME).answeredBy(actor);
    }



}
