package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TiendaUI {

    public static final By MAINSHADOWTIENDA = By.xpath("(//ion-card[@class='ml-card md hydrated'])[5]");

    public static final By BOTONIR = By.cssSelector("#tiendaonlinetigoDynamicItemClick");

    public static final Target TITULO_TIENDA = Target.the("Titulo tienda")
            .locatedBy("//h1[contains(.,'{0}')]");

}
