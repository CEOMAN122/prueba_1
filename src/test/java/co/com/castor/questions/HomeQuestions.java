package co.com.castor.questions;

import co.com.castor.userinterface.ArtistPanelPage;
import co.com.castor.userinterface.LoginPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;


public class HomeQuestions {

    public static Question<Boolean> isDisplayedTextHome() {
        return actor -> Presence.of(ArtistPanelPage.TXT_HOME).answeredBy(actor);
    }



}
