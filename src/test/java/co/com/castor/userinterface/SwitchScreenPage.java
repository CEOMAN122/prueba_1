package co.com.castor.userinterface;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;


public class SwitchScreenPage {
    public static final Target SWITCH = Target.the("presionar switch")
            .located(AppiumBy.xpath("//android.view.View[@content-desc='Switch'][2]/following-sibling::android.widget.Switch[1]"));
    public static final Target SWITCH_TILE = Target.the("presionar switch tile")
            .located(AppiumBy.xpath("//android.view.View[@content-desc='Switch'][2]/following-sibling::android.widget.Switch[2]"));
    public static final Target TXT_SWITCH_TILE = Target.the("Texto al activar switch")
            .located(AppiumBy.xpath("//android.widget.Switch[@content-desc='Habilitar Switch']/following-sibling::android.view.View"));
}
