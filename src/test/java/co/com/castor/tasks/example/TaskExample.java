package co.com.castor.tasks.example;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class TaskExample {

    public static Performable toTheCart(String nameProduct) {
        return Task.where(
                actor -> {
                    String locator = String.format("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"%s\").instance(0))", nameProduct);
                    Target product = Target.the("Title with the name of the prodcut").located(AppiumBy.androidUIAutomator(locator));
                    actor.attemptsTo(Click.on(product));
                    //actor.attemptsTo(Click.on(BTN_ADD_TO_CART));
                }
        );
    }

}
