package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ServiciosUI {
    public ServiciosUI() {
    }

    public static final Target BOTON_SUSCRIPCION = Target.the("Boton Subscripcion").locatedBy("(//ion-button[contains(.,'AÑADIR SUSCRIPCIÓN')])");
    public static final Target BOTON_AGREGAR_NUEVA_TARJETA = Target.the("Boton {0}").locatedBy("(//ion-button[contains(.,'{0}')]) | //ion-button[contains(.,'Nueva tarjeta')] | //ion-button[@id='addCard']");
    public static final Target MENSAJE_AGREGAR_NUEVA_TARJETA_EXITOSA = Target.the("Boton {0}").locatedBy("(//span[contains(.,'¡Tarjeta añadida con éxito!')])");
    public static final Target BOTON_TARJETA_MASTER = Target.the("Boton Tarjeta MasterCard").locatedBy("(//ion-col[@class='at-font-sub-header md hydrated'][contains(.,'**** 5562')])");
    public static final Target BOTON_ELIMINAR_TARJETA = Target.the("Boton Eliminar Tarjeta").locatedBy("(//ion-col[contains(@id,'deleteSelectedCardNi0')])");
    public static final Target BOTON_ELIMINAR_TARJETA_DOS = Target.the("Boton Eliminar Tarjeta").locatedBy("(//ion-col[contains(@id,'deleteSelectedCardNi1')])");
    public static final Target BOTON_CONFIRMAR_ELIMINAR_TARJETA = Target.the("Boton confirmar Eliminar Tarjeta").locatedBy("(//span[contains(.,'BORRAR')])");
    public static final Target BOTON_ELIMINAR_SUBSCRIPCION = Target.the("Boton Eliminar Suscripcion").locatedBy("(//ion-col[contains(@class,'at-delete-icon-col md hydrated')])");
    public static final Target BOTON_CONFIRMAR_ELIMINAR_SUSCRIPCION = Target.the("Boton confirmar Eliminar Suscripcion").locatedBy("(//span[contains(.,'ELIMINAR')])");
    public static final Target BOTON_ACTIVAR_SERVICIO = Target.the("boton activar servicios premium").locatedBy("(//button[@class='normal_background'][contains(.,'Activar')])[1]");
    public static final Target ACTIVALO = Target.the("icono de activalo").locatedBy("//strong[contains(.,'Actívalo')]");
    public static final Target BOTON_TERMINOS_CONDICIONES = Target.the("boton terminos y condiciones").located(By.xpath("//a[contains(.,'Términos y Condiciones de Tigo')]"));
    public static final Target TITULO_MI_PLAN = Target.the("Titulo mi plan").located(By.xpath("//ion-card-title[contains(text(),'Mi plan')]"));
    public static final Target BTN_GESTIONAR = Target.the("Botón gestionar").located(By.xpath("//button[contains(.,'Gestionar')]"));
    public static final Target TITULO_AFILIACIONES = Target.the("Titulo de afiliaciones a otros sistemas de pago").located(By.xpath("//ion-col[@aria-label='titleValue'][contains(.,'Afiliaciones a otros sistemas de pago')]"));
    public static final Target BANCO_A_AFILIAR = Target.the("Banco a afiliar: {0}").locatedBy("//ion-card-content[@class='ion-no-padding md card-content-md hydrated'][contains(.,'{0}')]");
    public static final Target BTN_COMENZAR_AFILIACIONES = Target.the("Boton comenzar afiliaciones a otros sistemas de pago").located(By.xpath("//ion-button[contains(.,'COMENZAR')]"));
    public static final Target CAMPO_NUM_NEQUI = Target.the("Campo numero nequi").located(By.xpath("//input[contains(@name,'phoneNumber')]"));
    public static final Target TITLE_OTP = Target.the("Titulo OTP").located(By.xpath("//ion-label[@aria-label='Title Value']"));
    public static final Target BTN_AFILIAR = Target.the("Boton Afiliar").located(By.xpath("//ion-button[contains(.,'Afiliar')]"));
    public static final Target CAMPO_DOC = Target.the("Campo numero de identificacion").located(By.xpath("//input[@id='documentNumber']"));
    public static final Target CAMPO_CORREO = Target.the("Campo correo electronico").located(By.xpath("//input[@id='email']"));


    public static final Target MEJORA_MI_PLAN = Target.the("boton mejora mi plan").located(By.xpath("//ion-button[contains(@id,'openWebViewCambiar')]"));
        public static final Target SERVICIO_HIBRIDO_HOME = Target.the(" servicio movil Hibrido").locatedBy("//ion-list//ion-item[contains(.,'{0}')]");
    public static final Target OPCION_SERVICIO_HIBRIDO = Target.the("Opcion servicios").locatedBy("//ion-label[contains(@id,'currentTabTitle2')]");
    //public static final Target COMPRAR_SERVICIO_PREMIUM_HOME = Target.the("Opcion comprar servicios").locatedBy("//button[contains(text(),'Explora tus servicios premium')]");
    public static final Target COMPRAR_SERVICIO_PREMIUM_HOME = Target.the("Opcion comprar servicios").locatedBy("//ion-label[@id='adquiereserviciospremiumDynamicItemClick'] | //button[contains(text(),'Gestionar')]");
    public static final Target TITULO_SERVICIO_PREMIUM_HOME = Target.the("Titulo comprar servicios").locatedBy("//h3[contains(.,'Servicios Premium')]");
    public static final Target SERVICIO_HIBRIDO = Target.the(" servicio movil Hibrido").locatedBy("//ion-row[contains(@id,'itemPlanLabelValidateCountry0')]");
    public static final Target ACTIVAR_SERVICIO_PREMIUM = Target.the("Opcion activar {0}").locatedBy("(//button[contains(.,'Activar')])[{0}]");
    //public static final Target ACTIVAR_SERVICIO_PREMIUM = Target.the("Opcion activar {0}").locatedBy("(//button[@class='normal_background'][contains(.,'Activar')])[2]");
    public static final Target TITULO_AMAZON_MUSIC = Target.the("Titulo Amazon Music").locatedBy("//h2[contains(.,'Amazon Music')]");
    public static final By IFRAME_SERVICIOS = By.xpath("//iframe[contains(@frameborder,'0')]");
    public static final By IFRAME_SERVICIOS_GENERAL = By.xpath("//iframe[contains(@class,'ml-iframe')]");
    public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar").locatedBy("//a[contains(@target,'blank')]");
    public static final Target TEXTO_CREAR_CUENTA = Target.the("Texto Crear Cuenta Amazon Music").locatedBy("//div[@class='a-box-inner']//h1");

    public static final Target VALIDACION_CAMBIO_DOMICILIO = Target.the("Validar cambio domicilio pagina wpp").locatedBy("//a[contains(@title,'Comparte en WhatsApp')]");

    public static final Target TRANSLADAR_MIS_SERVICIOS = Target.the("Titulo transladar mis servicios en wpp").locatedBy("//p[contains(.,'Trasladar mis servicios')]");

    public static final Target CARD_ROAMING = Target.the("Card Roaming").locatedBy("//wc-mitigo-roaming-step-one");
    public static final By ACTIVAR_ROAMING = By.cssSelector("(//input[@class='select-dropdown'])[2]");
    public static final Target CARD_CONSULTA_DISPOSITIVO = Target.the("Card Consuta Tu Dispositivo").locatedBy("//wc-mitigo-device-leg");
    public static final Target BOTON_CONSULTA_DISPOSITIVO = Target.the("Card Consuta Tu Dispositivo").locatedBy("//wc-mitigo-device-leg");
    public static final Target CARACTERISTICAS_DISPOSITIVO = Target.the("Caracteristica del dispositivo {0}").locatedBy("//div[@class='value'][contains(.,'{0}')]");
    public static final Target BOTON_BLOQUEO_DISPOSITIVO = Target.the("Boton bloqueo del dispositivo ").locatedBy("//a[contains(@id,'action_Bloqueo de equipo y sim')]");

    public static final Target TITULO_PLAN = Target.the("Titulo Mi plan").locatedBy("//ion-card-title[contains(.,'Mi plan')]");
    public static final Target NOMBRE_PLAN = Target.the("Nombre del Plan").locatedBy("//ion-card-subtitle[contains(.,'{0}')]");
    public static final Target INTERNET_PLAN = Target.the("Internet del Plan").locatedBy("//ion-text[contains(.,'{0}')]");
    public static final Target MINUTOS_PLAN = Target.the("Minutos del Plan").locatedBy("(//ion-text[contains(.,'{0}')])[1]");
    public static final Target MENSAJES_PLAN = Target.the("Mensajes del Plan").locatedBy("(//ion-text[contains(.,'{0}')])[2]");
    public static final Target PAGO_PLAN = Target.the("Pago del Plan").locatedBy("//ion-text[contains(.,'{0}')]");
    public static final Target CARGO_PLAN = Target.the("Cargo del Plan").locatedBy("//p[@aria-label='monthlyAmountFormattedValue'][contains(.,'$ 23.019')]");

    public static final By MAINSHADOWSOPORTE=By.xpath("//wc-mitigo-technical-support-co-launcher");
    public static final By MAINSHADOWCARD_SOPORT=By.xpath("//wc-mitigo-technical-support-co-details");
    public static final By BOTON_TIENDASSOPORT = By.cssSelector(".at-button-primary");

    public static final Target TITULO_PROMOCION= Target.the("Titulo Promocion").locatedBy("//div[@class='at-cl s5'][contains(.,'Promoción:')]");

    public static final Target INFO_CARDS = Target.the("Info card: {0}").locatedBy("//h3[contains(.,'{0}')]");
    public static final Target LLENAR = Target.the("llenar: {0}").locatedBy("//div[@class='at-cl s7'][contains(.,'{0}')]");
    public static final Target BTN_REGRESAR = Target.the("Boton regresar").locatedBy("(//div[contains(.,'REGRESAR')])[8]");
    public static final Target TITULO_BLOQUEODEEQUIPO = Target.the("Titulo bloqueo de equipo").locatedBy("//ion-card-title[contains(text(),' Bloquea por robo o pérdida ')]");

    public static final Target CARD_VOZ = Target.the("Card voz").locatedBy("//ion-row[contains(.,'Voz')]");

    public static final Target DETALLES_VOZ= Target.the("Subtitulo detalles").locatedBy("//button[contains(@class,'at-plan-details')]");

    public static final Target TITULO_PRODUCTOS_CONTRATADOS= Target.the("Titulo productos contratados").locatedBy("//ion-card-title[contains(.,'Productos contratados')]");


    //Shadow productos contratados voz home

    public static final By SHADOW_CARD_INFORMACION_VOZ=By.xpath("//wc-mitigo-service-details");

    public static final By BOTON_HISTORIAL_VOZ= By.cssSelector("div.at-rw.float-right");

    public static final By SHADOW_CARD_HISTORICO=By.xpath("//wc-mitigo-service-details-graph");

    public static final By TITULO_HISTORICO_CONSUMO= By.cssSelector("H4.at-font-h4.card-title.margin-title");



    //ServiciosRoaming
    public static final Target SERVICIO_PRIME_VIDEO = Target.the("Prime Video").locatedBy("(//div[@class='logo'])[4]");
    public static final Target SERVICIO_DEEZER = Target.the("DEEZER").locatedBy("(//div[@class='logo'])[8]");
    public static final Target SERVICIO_ACTIVO = Target.the("Servicio Premium Activo").locatedBy("(//div[@class='active'][contains(.,'Activo')])[{0}]");

    public static final Target BTN_DETALLES = Target.the("Boton detalles").locatedBy("(//button[contains(.,'Detalles')])[{0}]");

    public static final Target SERVICIOS_PREMIUM_DETALLES = Target.the("Servicio Premium Detalles").locatedBy("//button[contains(.,'Detalles')]");

    public static final Target ABRIR_PRIMEVIDEO = Target.the("Boton Abrir Prime Video").locatedBy("//a[@target='_blank'][contains(.,'Abrir')]");

    public static final Target CARD_ACTIVARHOTPACK= Target.the("Servicio Premium Activo").locatedBy("(//button[contains(.,'Activar')])[4]");

    //Productos Contratados
    public static final By SHADOWCARDPRODUCTOS=By.xpath("//wc-mitigo-service-details");
    public static final By TIPO_PRODUCTO =By.cssSelector("p.at-font-p.label");
    public static final Target TITULO_PRODUCTOS = Target.the("Titulo productos contratados").locatedBy("//ion-card-title[contains(text(),'Productos contratados')]");
    public static final Target ITEMS_PRODUCTOS = Target.the("Item en productos {0}").locatedBy("(//*[@class='row-padding-left md hydrated'])[{0}] | (//*[@aria-label='itemLabel'][contains(.,'Internet')])[{0}]");
    public static final Target DETALLE_PRODUCTOS = Target.the("Detalle de Producto {0}").locatedBy("//button[contains(.,'Detalles')]");
    public static final Target BOTON_REGRESAR = Target.the("Boton Regresar").locatedBy("//span[contains(.,'REGRESAR')]");

    //Descuentos

    public static final By TITULO_CONOCETUSDESCUENTOS= By.cssSelector("at-font-h4 title-launcher");
    public static final By BOTON_VER_DESCUENTOS= By.cssSelector("button.at-button-tertiary.padding-0");
    public static final By SHADOWCARDDESCUENTOS=By.xpath("//wc-launcher-disccounts");
    public static final By SHADOWCARDDESCUENTOSACTIVOS=By.xpath("//wc-my-discounts");
    public static final By TITULO_DESCUENTOSACTIVOS= By.cssSelector("H5.at-font-h5.discounts-title");
    public static final Target TITULO_MISDESCUENTOSACTIVOS = Target.the("Titulo mis descuentos activos").locatedBy("//ion-row[contains(.,'Mis Descuentos')]");
    public static final By SHADOWCARDDESCUENTOVENCIDOS=By.xpath("//wc-my-discounts");
    public static final By TITULO_DESCUENTOSVENCIDOS= By.cssSelector("H5.at-font-h5.discounts-title");
    public static final By BOTON_DESPLIEGUE_DESCUENTOS_VENCIDOS= By.cssSelector("i.pt-expand-more");
    public static final By SHADOWCARDSINDESCUENTOS=By.xpath("//wc-launcher-disccounts");
    public static final By SHADOWCARDSINDESCUENTOSHOME=By.xpath("//wc-my-discounts");
    public static final By TITULO_MISDESCUENTOS = By.cssSelector("button.at-button-primary");
    public static final Target TITULO_SINDESCUENTOS = Target.the("Titulo mis descuentos activos").locatedBy("//ion-row[contains(.,'Mis Descuentos')]");

}
