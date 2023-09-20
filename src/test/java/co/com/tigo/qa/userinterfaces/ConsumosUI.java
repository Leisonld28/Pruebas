package co.com.tigo.qa.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ConsumosUI {
    public static final Target BOTON_DETALLE_LLAMADAS = Target.the("Titulos: {0}").locatedBy("(//ion-label[@aria-label='verDetallesBtnClick'][contains(.,'VER DETALLE')])[2]");
    public static final Target BOTON_DETALLE_SMS = Target.the("Titulos: {0}").locatedBy("(//ion-label[@aria-label='verDetallesBtnClick'][contains(.,'VER DETALLE')])[1]");
    public static final Target BOTON_DETALLE_COMPRAS = Target.the("Titulos: {0}").locatedBy("(//ion-button[@shape='round'][contains(.,'Comprar')])[1]");
    public static final Target SALDO = Target.the("Saldos: {0}").locatedBy("//ion-label[@slot='start'][contains(.,'{0}')]");
    public static final Target DETALLES = Target.the("Titulos: {0}").locatedBy("//ion-label[contains(.,'{0}')] | //div[@class='ud-card-title'][contains(.,'{0}')] | //ion-row[contains(.,'{0}')]");
    public static final Target VER_DETALLES_INTERNET = Target.the("opción Ver detalle del card Internet").locatedBy("//ion-button[@id='verDetallesWcBtnClick']");
    public static final Target VER_DETALLES_MINUTOS = Target.the("opción VER DETALLE del card {0}").locatedBy("(//ion-label[@aria-label='verDetallesBtnClick'][contains(.,'VER DETALLE')])[1]");
    public static final Target VER_DETALLES_SMS = Target.the("opción VER DETALLE del card {0}").locatedBy("(//ion-label[@aria-label='verDetallesBtnClick'][contains(.,'VER DETALLE')])[2]");
    public static final Target BOTON_COMPRAS = Target.the("Botón Compras").locatedBy("//ion-label[contains(.,'Compras')]");

    public static final Target TITULO_CARD_DETALLES_DE_INTERNETCOMPARTIDOS = Target.the("Titulo Card Detalles de Internet").locatedBy("//ion-card-title[contains(.,'Detalles de Internet')]");

    public static final Target TITULO_DATOS_PARA_COMPARTIR = Target.the("Titulo Datos para compartir").locatedBy("//span[contains(.,'Datos para compartir')]");


}

