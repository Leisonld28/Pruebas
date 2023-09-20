package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuMasUI {

    public static Target setDynamicXpath(String opcion) {

        switch (opcion) {
            case "Consulta tus PQRS":
                System.out.println("---------->//*[contains(@text,'" + opcion + "')]<-----------");
                return Target.the("Selecciona el elemento")
                        .locatedBy("(//ion-text[@class='label md hydrated'][contains(.,'"+ opcion +"')])[2]");

            default:
                System.out.println("---------->//*[contains(.*,'" + opcion + "')]<-----------");
                return Target.the("Selecciona el elemento")
                        .locatedBy("//ion-text[@class='label md hydrated'][contains(.,'"+ opcion +"')]");
        }
    }

    public static final Target OPCION_MENU_MAS_ONEAPP= Target.the("opciones menu mas de oneapp)").locatedBy("//ion-text[@class='label md hydrated'][contains(.,'{0}')]");
    public static final Target PAGINA_CONSULTADA = Target.the("pagina consultada").locatedBy("//ion-row[@class='at-font-label at-font-28 md hydrated'][contains(.,'{0}')]");


    public static final By MAINSHADOWINFORMACION=By.xpath("//wc-mitigo-account-info");
    public static final By NOMBRE= By.cssSelector("div>div.wrapper-block.clearfix>div>div>div:nth-child(1)>div.value");
    public static final By CEDULA = By.cssSelector("div>div.wrapper-block.clearfix>div>div>div:nth-child(2)>div.value");
    public static final By CORREO = By.cssSelector("div>div.wrapper-block.clearfix>div>div>div:nth-child(6)>div.value");
    public static final By TELEFONO= By.cssSelector("div>div.wrapper-block.clearfix>div>div>div:nth-child(7)>div.value");
    }

