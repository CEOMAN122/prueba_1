package co.com.castor.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;


public class LoginPage {

    public static final Target TITULO_APP = Target.the("Título de la App")
            .located(AppiumBy.accessibilityId("deezer.android.app:id/welcome_title"));

    public static final Target BTN_CONTINUE = Target.the("BTN_CONTINUE")
            .located(AppiumBy.accessibilityId("deezer.android.app:id/continue_btn"));
    public static final Target BTN_GOOGLE = Target.the("BTN_GOOGLE")
            .located(AppiumBy.accessibilityId("deezer.android.app:id/google_auth_button"));
    public static final Target BTN_FACEBOOK = Target.the("BTN_FACEBOOK")
            .located(AppiumBy.accessibilityId("deezer.android.app:id/facebook_auth_button"));

}


