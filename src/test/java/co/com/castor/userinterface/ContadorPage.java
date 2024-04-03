package co.com.castor.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ContadorPage {

    public static final Target CARD_CONTADOR = Target.the("Card contador")
            .located(AppiumBy.accessibilityId("App Contador"));
    public static final Target BOTON_CONTADOR = Target.the("contador")
            .located(AppiumBy.xpath("//*[@class='android.widget.Button'][2]"));
    public static final Target VALOR_CONTADOR = Target.the("valor en pantalla")
            .located(AppiumBy.xpath("//android.view.View[@content-desc=\"You have pushed the button this many times:\"]/following-sibling::android.view.View[1]"));

}
