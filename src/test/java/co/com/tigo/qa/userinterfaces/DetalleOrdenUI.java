package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

import org.openqa.selenium.By;

public class DetalleOrdenUI {

    public static final Target BOTON_METODO_TC = Target.the("Metodo de pago TC")
            .locatedBy("//span[contains(.,'Tarjeta de Crédito')] | //span[contains(.,'Tarjeta crédito / débito con CVV')] | //span[contains(.,'Tarjeta crédito/débito con CVV')] | (//span[@class='at-payment-name'][contains(.,'Tarjeta de Crédito')]) | (//span[@class='at-payment-name'][contains(.,'tarjeta de crédito')])");

    public static final Target BOTON_AGREGAR_TARJETA = Target.the("Boton agregar TC")
            .locatedBy("(//*[contains(ion-label,'Agregar Tarjeta')]) | (//input[@aria-label='cardNumber'])");

    public static final Target CAMPO_NUMERO_TARJETA = Target.the("Campo numero TC")
            .locatedBy("(//input[@formcontrolname='creditCard'])");

    public static final Target CAMPO_EXP_TARJETA = Target.the("Campo expira TC")
            .locatedBy("(//input[@aria-label='Expiration Date'])");

    public static final Target CAMPO_CVV_TARJETA = Target.the("Campo expira TC")
            .locatedBy("(//input[@aria-label='cvc']) | (//input[contains(@id,'cvv')])");

    public static final Target CAMPO_NOMBRE_CLIENT_TARJETA = Target.the("Campo Nombre TC")
            .locatedBy("(//input[@aria-label='Name On Card']) | (//input[contains(@formcontrolname,'nameOnCard')])");

    public static final Target CAMPO_DIRECCION_TARJETA = Target.the("Campo direccion TC")
            .locatedBy("//input[contains(@aria-label,'address')]");

    public static final Target CAMPO_IDENTIFICACION_TARJETA = Target.the("Campo direccion TC")
            .locatedBy("(//input[contains(@aria-label,'Document Number')])");

    public static final Target TITULO_METODOS_PAGO = Target.the("Titulo del card metodos de pago")
            .locatedBy("//ion-row[contains(.,'Escoge tu forma de pago')]");

    public static final Target BOTON_METODO_PSE = Target.the("Metodo de pago PSE")
            .locatedBy("(//*[@class='at-payment-name'][contains(.,'Tarjeta débito')]) | (//span[@class='at-payment-name'][contains(.,'Tarjeta de Débito')]) | //span[@class='at-payment-name'][contains(.,'Tarjeta Débito')] | (//span[@class='at-payment-name'][contains(.,'Cuenta de ahorros')])");

    public static final Target CAMPO_BANCO_PSE = Target.the("Selecciona el banco")
            .locatedBy("//*[@placeholder='A continuación seleccione su banco']");

    public static final Target LISTA_BANCO_PSE = Target.the("Lista Nombre del banco")
            .locatedBy("//ion-card[@class='at-items-card md hydrated']");

    public static final Target CAMPO_NOMBRE_PERSONA_PSE = Target.the("Label tipo persona")
            .locatedBy("(//input[contains(@formcontrolname,'customerName')])");

    public static final Target CAMPO_DOCUMENTO_PERSONA_PSE = Target.the("Label tipo persona")
            .locatedBy("(//input[contains(@formcontrolname,'documentNumber')])");

    public static final Target CAMPO_CORREO_PERSONA_PSE = Target.the("Label tipo persona")
            .locatedBy("(//input[contains(@formcontrolname,'email')])");

    public static final Target CAMPO_CORREO_BANCOLOMBIA= Target.the("Label tipo correo")
            .locatedBy("//input[contains(@name,'tokenBoxEmail')]");

    public static final Target CAMPO_TELEFONO = Target.the("Label Telefono")
            .locatedBy("//input[contains(@formcontrolname,'phoneNumber')]");

    public static final Target BOTON_CONTINUAR = Target.the("Boton CONTINUAR")
            .locatedBy("(//ion-button[contains(.,'Continuar')]) | (//ion-button[@id='continueToPayBill'])");

    public static final Target BOTON_CONTINUAR_TRANSFERIR_SALDO = Target.the("Boton CONTINUAR")
            .locatedBy("(//ion-button[contains(.,'CONTINUAR')])");

    public static final Target BOTON_EMERGENTE = Target.the("Boton EMERGENTE")
            .locatedBy("//ion-button[@fill='clear'][contains(.,'cancelar')]");

    public static final Target BOTON_ACEPTAR = Target.the("Boton ACEPTAR")
            .locatedBy("(//ion-button[contains(.,'Aceptar')])");

    public static final Target BOTON_RESUMEN_PAGO = Target.the("Boton RESUMEN Pago")
            .locatedBy("(//ion-button[@class='at-button at-pagar-button md button button-solid ion-activatable ion-focusable hydrated'][contains(.,'CONTINUAR')]) | //ion-button[contains(@id,'showPaymentSummary')]");

    public static final Target BOTON_PAGAR_ACH = Target.the("Boton Pagar ACH")
            .locatedBy("//input[contains(@name,'btnPay')]");

    public static final Target TITULO_PAY_DESCRIP = Target.the("Titulo Payment Description")
            .locatedBy("//span[@id='lblPaymentDescription']");

    public static final Target BOTON_PAGAR_SALDO = Target.the("Boton de pago Saldo")
            .locatedBy("(//*[contains(ion-row,'Saldo')]) | //span[contains(.,'Saldo de recargas')]");

    public static final Target BOTON_METODO_BBC = Target.the("Metodo de pago BBC")
            .locatedBy("(//*[contains(ion-row,'Bancolombia')])");

    public static final Target CAMPO_NOMBRE_PERSONA_BBC = Target.the("Lable tipo persona")
            .locatedBy("//input[contains(@formcontrolname,'customerName')]");

    public static final Target CAMPO_DOCUMENTO_PERSONA_BBC = Target.the("Lable tipo persona")
            .locatedBy("(//input[@formcontrolname='documentNumber'])");

    public static final Target CAMPO_CORREO_PERSONA_BBC = Target.the("Lable tipo persona")
            .locatedBy("//input[contains(@formcontrolname,'email')]");

    public static final Target BOTON_METODO_NEQUI = Target.the("Metodo de pago NEQUI")
            .locatedBy("//div[@class='at-without-description'][contains(.,'Nequi')]");

    public static final Target BOTON_METODO_NEQUI_HOME = Target.the("Metodo de pago NEQUI HOME")
            .locatedBy("(//span[@class='at-payment-name'][contains(.,'Nequi')])[2]");

    public static final Target CARD_METODO_NEQUI_EXPRESS = Target.the("Card de pago NEQUI")
           // .locatedBy("(//label[contains(.,'Utiliza nequi para pagar')])");
            .locatedBy("//ion-radio[@name='radio_list']");

    public static final Target BOTON_CUENTA_NEQUI = Target.the("Seleccion Cuenta Nequi")
            .locatedBy("//ion-radio[contains(@id,'addNewNumber')]");

    public static final Target CUENTA_NEQUI = Target.the("Seleccion Cuenta Nequi")
            .locatedBy("//input[contains(@name,'phoneNumber')]");

    public static final Target BOTON_PAGAR = Target.the("Boton pagar de forma de pago saldo")
            .locatedBy("//ion-button[contains(@id,'showPaymentSummary')]");

    public static final Target LABEL_PAGO = Target.the("Boton $12000")
            .locatedBy("//ion-button[contains(text(),'$ 12.000')]");

    public static final Target BOTON_ADELANTASALDO = Target.the("Boton pagar de forma de pago Adelantasaldo")
            .locatedBy("//ion-button[@class='loan-button md button button-solid ion-activatable ion-focusable hydrated'][contains(.,'{0}')]");

    public static final Target BOTON_CAMBIAR = Target.the("Boton cambiar")
            .locatedBy("//ion-label[@aria-label='editPaymentDetail'][contains(.,'CAMBIAR')]");

    public static final Target BOTON_VER_ESTADO = Target.the("Boton ver estado")
            .locatedBy("(//ion-button[contains(.,'VER ESTADO')])");

    public static final Target BOTON_CERRAR_SURVEY = Target.the("Boton cerrar survey")
            .locatedBy("(//button[@aria-label='Close Survey'])[1]");

    public static final Target MENSAJE_TRANSACCION = Target.the("Mensaje: {0}")
            .locatedBy("(//ion-label[@aria-label='primaryTitle'][contains(.,'{0}')]) | (//ion-label[contains(.,'{0}')]) | (//*[@class='box-sub-container'][contains(.,'{0}')]) | //h2[contains(.,'Thank you for your order!')]");

    public static final Target MENSAJE_EXITOSO = Target.the("Mensaje Exitoso: {0}")
            .locatedBy("//span[contains(@id,'messageNoLink')]");

    /*public static final Target BOTON_TARJETA_CREDITO = Target.the("Boton seleccionar Tarjeta de credito")
            .locatedBy("//span[contains(@class,'at-payment-name set-height')]");*/

    public static final Target BOTON_TARJETA_CREDITO = Target.the("Boton seleccionar Tarjeta de credito")
            .locatedBy("//ion-item[contains(.,'**** 7376  Expira 04/2026')] | //ion-item[contains(.,'**** 1111  Expira 06/2026')]") ;

    public static final Target TITULO_ADELANTA_SALDO = Target.the("Titulo adelanta saldo")
            .locatedBy("//div[@class='at-sub-container-left'][contains(.,'Adelantasaldo')]");

    public static final Target BOTON_VOLVER_INICIO = Target.the("Boton volver al inicio")
            .locatedBy("//ion-button[contains(@id,'redirectToFactura')]");

    public static final Target BOTON_RENOVAR_AHORA = Target.the("Boton renovar ahora")
            .locatedBy("//ion-button[@mode='md'][contains(.,'RENOVAR AHORA')]");

    public static final Target TITULO_SUSCRIPCION_ACTIVA = Target.the("Boton suscripcion activa")
            .locatedBy("//ion-card-header[contains(.,'Suscripción activa con Tarjeta de Crédito')]");

    public static final Target SELECCION_PAQUETE_ACTIVO = Target.the("Seleccion paquete activo")
            .locatedBy("//ion-col[@class='at-blue-fonts md hydrated'][contains(.,'500 MB x 1 día')]");

    public static final Target BOTON_ELIMINAR_PAQUETE_ACTIVO = Target.the("Boton eliminar paquete activo")
            .locatedBy("//ion-text[contains(@id,'deleteAutoPackEnrollment')]");

    public static final Target BOTON_CONFIRMAR_ELIMINAR = Target.the("Boton confirmar eliminar paquete activo")
            .locatedBy("//span[@class='alert-button-inner sc-ion-alert-md'][contains(.,'ELIMINAR')]");

    public static final Target NUMERO_IDENTIFICACION = Target.the("Mensaje: {0}")
            .locatedBy("//input[contains(@formcontrolname,'documentNumber')]");

    public static final Target BOTON_METODO_BANCOLOMBIA = Target.the("Metodo de pago BANCOLOMBIA")
            .locatedBy("//span[@class='at-payment-name'][contains(.,'Bancolombia')]");

    public static final Target BOTON_METODO_DAVIPLATA = Target.the("Metodo de pago DAVIPLATA")
            .locatedBy("//span[@class='at-payment-name'][contains(.,'Daviplata')]");
    public static final Target BOTON_METODO_DAVIPLATA_HOME = Target.the("Metodo de pago DAVIPLATA HOME")
            .locatedBy("(//span[@class='at-payment-name'][contains(.,'Daviplata')])[2]");

    public static final Target BOTON_CUENTA_BC = Target.the("Agregar Cuenta BC")
            .locatedBy("//ion-radio[@id='addNewNumber']");

    public static final Target BOTON_CUENTA_BC_TOKENIZADA = Target.the("Agregar Cuenta BC")
            .locatedBy("//ion-radio[contains(@id,'radio0')]");

    /*public static final Target BOTON_CONTINUAR_BANCOLOMBIA = Target.the("Mensaje: {0}")
            .locatedBy("//ion-button[@class='at-button at-add-card-button md button button-solid ion-activatable ion-focusable hydrated'][contains(.,'Continuar')]");
*/
    public static final Target BOTON_CONTINUAR_BANCOLOMBIA = Target.the("Mensaje: {0}")
            .locatedBy("//ion-button[contains(@id,'showVerifySection')]");

    public static final Target BOTON_TRANSFERIR_SALDO = Target.the("Boton transferir en el card saldo")
            .locatedBy("//ion-label[contains(.,'Transferir')]");

    public static final Target CAMPO_DESTINATARIO_TIGO = Target.the("Campo para ingresar el numero de linea")
            .locatedBy("//input[@placeholder='Ingresa el número de línea']");

    public static final Target CAMPO_VALOR_TRANSFERIR = Target.the("Campo para ingresar el valor a transferir")
            .locatedBy("//input[contains(@inputmode,'decimal')]");

    public static final Target BOTON_CONFIRMAR = Target.the("Boton confirmar transferencia")
            .locatedBy("//ion-button[contains(.,'CONFIRMAR')]");

    public static final Target TITLE_VERIFICAR = Target.the("Titulo verificar")
            .locatedBy("//ion-row[@aria-label='verificationTitle'][contains(.,'Verificación')]");



    public static final Target TITLE_TIGO_PRESTA = Target.the("Titulo de tigo te presta")
            .locatedBy("//span[contains(.,'Tigo te presta')]");

    public static final Target TITLE_SALDO_DISPONIBLE = Target.the("Titulo de saldo disponible")
            .locatedBy("//ion-label[@slot='start'][contains(.,'Saldo Disponible')]");
}
