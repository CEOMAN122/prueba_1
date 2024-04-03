package co.com.castor.userinterface;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;


public class PrincipalPage {
    public static final Target CARD_CONTADOR = Target.the("Card contador")
            .located(AppiumBy.accessibilityId("App Contador"));
    public static final Target CARD_BUTTONS_DEMO = Target.the("Card buttons demo")
            .located(AppiumBy.accessibilityId("Buttons Demo"));
    public static final Target CARD_SWITCH = Target.the("Card Switch")
            .located(AppiumBy.accessibilityId("Switch screeen"));

    public static final Target CARD_DATEPICKER = Target.the("Card date picker")
            .located(AppiumBy.accessibilityId("DatePicker screeen"));


    private PrincipalPage() {
        throw new IllegalStateException("user interface class");
    }
}
