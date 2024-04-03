package co.com.castor.userinterface.example;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class exampleLocalizatorsPage {
    public static final Target TXT_USERNAME = Target.the("Username Input").locatedForAndroid(AppiumBy.accessibilityId("test-Username")).locatedForIOS(AppiumBy.accessibilityId("test-Usuario"));
    public static final Target TXT_PASSWORD = Target.the("Password Input").locatedForAndroid(AppiumBy.accessibilityId("test-Password")).locatedForIOS(AppiumBy.accessibilityId("test-Contraseña"));
    public static final Target BTN_LOGIN = Target.the("Login Button").located(AppiumBy.accessibilityId("test-LOGIN"));
    public static final Target BTN_ADD_TO_CART = Target.the("Button Add Product to Cart").located(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ADD TO CART\").instance(0))"));
    public static final Target BTN_BACK_TO_HOME= Target.the("Button Back to the Home").located(AppiumBy.accessibilityId("test-BACK TO PRODUCTS"));
    public static final Target BTN_OPEN_SHOP_CART= Target.the("Button Cart").located(AppiumBy.accessibilityId("test-Cart"));

    public static final Target BTN_CHECKOUT = Target.the("Button to checkut").located(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CHECKOUT\").instance(0))"));
    public static final Target TXT_NAME = Target.the("Name Input").located(AppiumBy.accessibilityId("test-First Name"));
    public static final Target TXT_LAST_NAME = Target.the("Lastname Input").located(AppiumBy.accessibilityId("test-Last Name"));
    public static final Target TXT_POST_CODE = Target.the("Post Code Input").located(AppiumBy.accessibilityId("test-Zip/Postal Code"));
    public static final Target BTN_CONTINUE = Target.the("Button to Continue").located(AppiumBy.accessibilityId("test-CONTINUE"));
    public static final Target BTN_FINISH = Target.the("Button to Finish").located(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"FINISH\").instance(0))"));

}
