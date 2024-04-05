package co.com.castor.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target BTN_HOME = Target.the("BTN_HOME")
            .located(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"deezer.android.app:id/navigation_bar_item_icon_view\"])[1]"));

    public static final Target BTN_EXPLORE = Target.the("BTN_EXPLORE")
            .located(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"deezer.android.app:id/navigation_bar_item_icon_view\"])[2]"));

    public static final Target BTN_FAVORITE = Target.the("BTN_FAVORITE")
            .located(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"deezer.android.app:id/navigation_bar_item_icon_view\"])[3]"));

    public static final Target BTN_SEARCH = Target.the("BTN_SEARCH")
            .located(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"deezer.android.app:id/navigation_bar_item_icon_view\"])[4]"));
    public static final Target BTN_PREMIUM = Target.the("BTN_PREMIUM")
            .located(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"deezer.android.app:id/navigation_bar_item_icon_view\"])[5]"));

    //notifcaciones
    public static final Target BTN_NOTIFICATIONS = Target.the("BTN_NOTIFICATIONS")
            .located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Notifications\"]"));

    public static final Target BTN_BACK = Target.the("BTN_PREMIUM")
            .located(AppiumBy.xpath("//android.widget.ImageButton[@resource-id=\"deezer.android.app:id/navigation_button\"]"));


    //MI PERFIL
    public static final Target BTN_PERFIL = Target.the("BTN_NOTIFICATIONS")
            .located(AppiumBy.xpath("//android.view.View[@content-desc=\"Manage settings\"]"));


}
