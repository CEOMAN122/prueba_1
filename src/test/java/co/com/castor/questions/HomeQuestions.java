package co.com.castor.questions;

import co.com.castor.userinterface.ArtistPanelPage;
import co.com.castor.userinterface.LoginPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;

import static co.com.castor.userinterface.HomePage.*;


public class HomeQuestions {

    public static Question<Boolean> isDisplayedTextHome() {
        return actor -> Presence.of(ArtistPanelPage.TXT_HOME).answeredBy(actor);
    }
    public static Question<Boolean> isDisplayedHomeBtn() {
        return actor -> Presence.of(BTN_HOME).answeredBy(actor);
    }
    public static Question<Boolean> isDisplayedExploreBtn() {
        return actor -> Presence.of(BTN_EXPLORE).answeredBy(actor);
    }
    public static Question<Boolean> isDisplayedFavoritesBtn() {
        return actor -> Presence.of(BTN_FAVORITE).answeredBy(actor);
    }
    public static Question<Boolean> isDisplayedSearchBtn() {
        return actor -> Presence.of(BTN_SEARCH).answeredBy(actor);
    }

    public static Question<Boolean> isDisplayedPremiumBtn() {
        return actor -> Presence.of(BTN_PREMIUM).answeredBy(actor);
    }


}
