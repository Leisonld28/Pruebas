package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

public class PaquetesUI {
    public static final Target SPINNER = Target.the("Animacion de carga").located(cssSelector(".group_loader"));
    public static final Target RESUMEN_TRANSACCION = Target.the("Titulo resumen de tu transaccion")
            .locatedBy("(//*[contains(., 'Resumen de tu transacción')])[15]");

    public static final Target OPCION_MENU_PAQUETIGOS= Target.the("opciones paquetigos")
            .locatedBy("//*[contains(@class,'at-sub-container-left') and contains(.,'{0}')]");

    public static final Target TITULO_OFERTA_RECOMENDADA = Target.the("Titulo Oferta Recomendada")
            .locatedBy("//div[@class='at-sub-container-left'][contains(.,'5 GB x 10 días')]");

    public static final Target MENSAJE_TRANSACCION_PAQUETIGOS = Target.the("Mensaje: {0}")
            .locatedBy("//ion-label[@id='primaryTitle' and contains(.,'{0}')]");

    public static final Target OPCION_MENU_FORMA_DE_PAGO= Target.the("Opciones formas de pago: {0}")
            .locatedBy("(//ion-item[contains(.,'{0}')]) | (//ion-item[@lines='full'][contains(.,'{0}}')]) | (//span[@class='at-payment-name'][contains(.,'Tarjeta de Crédito')])");

    public static final Target BOTON_PAGAR= Target.the("Boton pagar de forma de pago saldo")
            .locatedBy("//ion-button[contains(.,'PAGAR')]");

    public static final Target BOTON_TOKENIZADO_BANCOLOMBIA= Target.the("Boton tokenizado bancolombia")
            .locatedBy("//div[@class='at-tokenised-cards'][contains(.,'**** 4324')]");

    public static final Target BOTON_VER_ESTADO= Target.the("Boton ver estado")
            .locatedBy("//ion-button[contains(.,'VER ESTADO')]");

    public static final Target BOTON_PAGAR_TP= Target.the("Boton Pagar Tigo Te Presta")
            .locatedBy("//ion-button[@id='showPaymentSummary']");

    public static final Target BOTON_VOLVER_INICIO= Target.the("Botón Volver a Inicio")
            .locatedBy("//ion-button[@id='redirectToFactura']");

    public static final Target CARD_TIGOTEPRESTA= Target.the("Card Tigo Te Presta")
            .locatedBy("//span[@id='loansTitle']");


    public static final Target SECCION= Target.the("SECCION suscripciones activas").locatedBy("//ion-card[contains(@class,'md hydrated')]//ion-card-title[contains(.,'Suscripciones activas')]");

    public static final Target ICONO_ELIMINAR_SUSCRIPCION = Target.the("icono caneca eliminar suscripcion Aceptar formulario registro agregar tarjeta").locatedBy("//ion-col[contains(@class,'at-delete-icon-col')]");

    public static final Target CONFIRMAR_ELIMINAR_SUSCRIPCION = Target.the("Confirmar eliminacion suscripcion").locatedBy("//*[@id=\"ELIMINARBtn\"]");

    public static final Target MENSAJE_CONFIRMACION= Target.the("Mensaje de confirmacion compra").locatedBy("//ion-label[contains(@id,'primaryTitle')]");

    public static final Target MENSAJE_CONFIRMACION_SUSCRIPCION= Target.the("Mensaje de confirmacion compra final").locatedBy("//ion-card-title[@aria-label='activeSubTitle'][contains(.,'Suscripción activa con Tarjeta de Crédito')]");

    public static final Target MENSAJE_ELIMINACION_SUSCRIPCION= Target.the("Mensaje de eliminacion compra final").locatedBy("//span[contains(@id,'messageNoLink')]");

    public static final Target BOTON_TIGOTEPRESTA = Target.the("Boton Tigo Te Presta").locatedBy("//span[@class='at-payment-name'][contains(.,'Tigo te presta')]");

    public static final Target BOTON_COMPRA_UNAVEZ = Target.the("Check compra una vez").locatedBy("//ion-radio[contains(@id,'1 vez')]");

    public static final Target MENSAJE_PAQUETES = Target.the("Check compra una vez").locatedBy("//p[@class='frequency-note']");

    public static final Target BOTON_COMPRA_RECURRENTE = Target.the("Check compra recurrente").locatedBy("//ion-radio[contains(@id,'Recurrente')]");

    public static final Target TITULO_PAGO_NEQUI = Target.the("Titulo Pago Nequi")
            .locatedBy("//span[contains(.,'{0}')]");


    public static Target paquetesLargaDistanciaInternacional(String paguetigo) {
        return Target.the("Titulo de los paquetes internacionales").locatedBy("//div[@class='at-sub-container-left'][contains(.,'" + paguetigo + "')]");
    }


    public static Target botonesSaldo(String precio) {
        return Target.the("Titulo 10 Minutos Larga Distancia Internacional").locatedBy("//ion-button[contains(.,'" + precio + "')]");
    }

    public static final Target DETALLES_DE_COMPRA = Target.the("Titulo Detalles de compra").locatedBy("//span[contains(.,'Detalles de compra')]");


}


