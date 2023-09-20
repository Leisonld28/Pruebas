package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

public class ComunesUI {
    public static final Target SPINNER = Target.the("Animacion de carga").located(cssSelector(".group_loader"));
}
