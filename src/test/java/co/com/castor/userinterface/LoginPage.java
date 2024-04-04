package co.com.castor.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;


public class LoginPage {

             // SE ubica lo correspondiente al registro para iniciar

    //
    public static final Target TITULOS_APP = Target.the("Título de la App")
            .located(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"deezer.android.app:id/welcome_title\"]"));

    public static final Target BTN_CONTINUE = Target.the("BTN_CONTINUE")
            .located(AppiumBy.xpath("//android.widget.Button[@resource-id=\"deezer.android.app:id/continue_btn\"]"));
    public static final Target BTN_GOOGLE = Target.the("BTN_GOOGLE")
            .located(AppiumBy.accessibilityId("deezer.android.app:id/google_auth_button"));
    public static final Target BTN_FACEBOOK = Target.the("BTN_FACEBOOK")
            .located(AppiumBy.accessibilityId("deezer.android.app:id/facebook_auth_button"));

    public static final Target CAMPOS_GENERALES = Target.the("CAMPOS_GENERALES")
            .located(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"deezer.android.app:id/input\"]"));

    public static final Target BTN_MASCULINO = Target.the("BTN_MASCULINO")
            .located(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"deezer.android.app:id/male_container\"]"));

    //COOKIES
    public static final Target TITLE_COOKIES = Target.the("TITLE_COOKIES")
            .located(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"deezer.android.app:id/title_cookies\"]"));

    public static final Target BTN_ACEPTAR = Target.the("BTN_ACEPTAR")
            .located(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"deezer.android.app:id/acceptButton\"]/android.view.View/android.view.View/android.view.View/android.widget.Button"));
    public static final Target TITLE_WELCOME = Target.the("TITLE_WELCOME")
            .located(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"deezer.android.app:id/subtitle\"]"));

}


