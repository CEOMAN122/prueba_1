package co.com.castor.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ArtistPanelPage {


    public static Target getArtistElement(int index) {
        String artistElementLocator = String.format("(//android.widget.ImageView[@resource-id=\"deezer.android.app:id/card_cover\"])[%d]", index + 1);
        return Target.the("Artist " + index).located(By.xpath(artistElementLocator));
    }
    public static final Target BTN_CATEGORIA = Target.the("BTN_CATEGORIA")
            .located(AppiumBy.xpath("//android.widget.TextView[@text=\"ROCK\"]"));
    public static final Target BTN_CONT = Target.the("BTN_CONT")
            .located(AppiumBy.xpath("//android.view.View[@content-desc=\"Continue with 16 artists\"]\n"));
    public static final Target BTN_CLOSE = Target.the("BTN_CLOSE")
            .located(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"deezer.android.app:id/validation_btn\"]/android.view.View"));
    public static final Target TXT_HOME = Target.the("TXT_HOME")
            .located(AppiumBy.xpath("(//android.widget.TextView[@text=\"Home\"])[1]"));

}
