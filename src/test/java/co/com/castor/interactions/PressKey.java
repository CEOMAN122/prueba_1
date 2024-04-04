package co.com.castor.interactions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class PressKey implements Interaction {

    private final String cadena;

    public PressKey(String cadena) {
        this.cadena = cadena;
    }

    public static PressKey of(String cadena){
        return new PressKey(cadena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AndroidDriver driver = (AndroidDriver) BrowseTheWeb.as(actor).getDriver();
        for (char caracter : cadena.toCharArray()) {
            AndroidKey tecla = obtenerTeclaAndroid(caracter);
            if (tecla != null) {
                driver.pressKey(new KeyEvent(tecla));
            } else {
                System.out.println("Carácter no reconocido: " + caracter);
            }
        }

    }

    private AndroidKey obtenerTeclaAndroid(char caracter) {
        switch (caracter) {
            case '0':
                return AndroidKey.DIGIT_0;
            case '1':
                return AndroidKey.DIGIT_1;
            case '2':
                return AndroidKey.DIGIT_2;
            case '3':
                return AndroidKey.DIGIT_3;
            case '4':
                return AndroidKey.DIGIT_4;
            case '5':
                return AndroidKey.DIGIT_5;
            case '6':
                return AndroidKey.DIGIT_6;
            case '7':
                return AndroidKey.DIGIT_7;
            case '8':
                return AndroidKey.DIGIT_8;
            case '9':
                return AndroidKey.DIGIT_9;
            default:
                return null;
        }
    }

}
