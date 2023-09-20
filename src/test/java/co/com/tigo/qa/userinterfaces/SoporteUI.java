package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SoporteUI {

    public static final Target BOTON_TEST_VELOCIDAD = Target.the("Boton Test de Velocidad").locatedBy("//ion-label[@id='testdevelocidadDynamicItemClick']");

    public static final Target BOTON_INICIAR_TEST = Target.the("Boton Iniciar Test de Velocidad").locatedBy("//span[contains(text(),'INICIAR')]");

    public static final Target BOTON_CONFIGURACION = Target.the("Boton Ingresar Configuracion").locatedBy("//ion-button[contains(@id,'reloadLabel')]");

    public static final Target CARD_TU_DISPOSITIVO = Target.the("Card tu Dispositivo").locatedBy("//*[@id='device-online-card']/div/span");

    public static final Target BOTON_AJUSTES = Target.the("Card tu Dispositivo").locatedBy("//*[@id='mat-tab-label-0-1']");

    public static final Target TITULO_MODEM = Target.the("Card tu Dispositivo").locatedBy("//*[@id='mat-expansion-panel-header-3']/span/mat-panel-title/span");


}
