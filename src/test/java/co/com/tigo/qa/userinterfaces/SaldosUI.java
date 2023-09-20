package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SaldosUI {

    public static final By SHADOWHISTORIAL =By.xpath("//wc-mitigo-transaction-history-intro");

    public static final By VER_MAS_HISTORIAL =By.cssSelector("button.at-button-primary.shadow-none");

    public static final By TITULO_TRANSACCION =By.cssSelector("h4.transaction-title at-font-h4");

    public static final By SHADOWTRANSACCION =By.xpath("//wc-mitigo-transaction-history-all");


    public static final Target BOTON_TIPOPROD = Target.the("Boton Todos")
            .locatedBy("//div[@class='ss-values'][contains(.,'Todos')]");

    public static final Target BOTON_RECARGAS = Target.the("Boton Recargas")
            .locatedBy("(//div[@class='ss-option'])[1] | //div[@class='ss-values'][contains(.,'Recargas')]");

    public static final Target BOTON_SIETEDIAS = Target.the("Boton Ultimos 7 dias")
            .locatedBy("//div[@class='ss-values'][contains(.,'Últimos 7 días')]");

    public static final Target BOTON_MESACTUAL = Target.the("Boton Mes Actual")
            .locatedBy("(//span[contains(.,'Mes actual')])[1]");

    public static final Target TITLE_HISTORIAL = Target.the("Titulo Historial")
            .locatedBy("//ion-row[contains(.,'Historial de transacciones')]");

    public static final Target BOTON_PRIMERITEM = Target.the("Boton Primera ITEM")
            .locatedBy("(//div[contains(@class,'item-type')])[1]");

    public static final Target BOTON_PAQUETES = Target.the("Boton Paquetes")
            .locatedBy("(//div[contains(@class,'ss-option')])[3]");

    public static final Target BOTON_MESANTERIOR = Target.the("Boton Mes Anterior")
            .locatedBy("(//span[contains(.,'Mes anterior')])[1]");

}
