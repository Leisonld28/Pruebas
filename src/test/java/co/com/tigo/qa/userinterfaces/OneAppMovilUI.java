package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OneAppMovilUI {


    public static final Target LINEA_PREPAGO = Target.the("Opcion linea prepago").locatedBy("(//ion-row[contains(.,' Prepago 3015010696 ')])[2]");
    public static final Target OPCION_CONSUMOS = Target.the("Opcion para ver consumos").locatedBy("//ion-label[contains(.,' Consumos')]");
    public static final Target VER_DETALLES_MINUTOS = Target.the("Opcion para ver consumos").locatedBy("(//ion-label[@id='verDetallesBtnClick'])[1]");
    public static final Target VER_DETALLES_LLAMADAS = Target.the("Objeto detalles de llamadas").locatedBy("(//*[contains(., 'Detalle de llamadas')])[12]");
    public static final Target OPCION_DETALLES_MENSAJES = Target.the("Objeto detalles de mensajes").locatedBy("(//ion-label[@id='verDetallesBtnClick'])[2]");
    public static final Target VER_DETALLES_MENSAJES = Target.the("Objeto detalles de mensajes").locatedBy("(//*[contains(., 'Detalles de SMS')])[12]");
    public static final Target COMPRAS_INTERNET = Target.the("Objeto detalles de compras por internet").locatedBy("//div[@class='at-tab-title active-tab']");
    public static final Target CONSUMOS = Target.the("Boton consumos ").locatedBy("//ion-label[contains(.,' Consumos')]");
    public static final Target INTERNET_CONSUMOS = Target.the("opcion internet desde consumos ").locatedBy("(//ion-button[contains(.,' Comprar ')])[1]");

    public static final Target PAQUETE_SUSCRIPCION = Target.the("Paquete Suscripción ").locatedBy("//div[contains(.,'{0}') and contains(@id,'offerNameformattedValueSuscripciones')]");

    public static final Target TITULO_SUSCRIPCION = Target.the("Titulo Suscripción ").locatedBy("//div[@id='offerNameformattedValueÚltimoPaqueteComprado0']");



}
