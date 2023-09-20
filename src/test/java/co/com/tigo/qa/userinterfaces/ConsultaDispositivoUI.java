package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsultaDispositivoUI {

    public static final By MAINSHADOWDEVICE=By.xpath("//wc-mitigo-device-leg");
    public static final By SECONDSHADOWDEVICE=By.xpath("//wc-mitigo-device-details-leg");
    public static final By BLOQUEOONESHADOWDEVICE=By.xpath("//wc-mitigo-lock-device-form-co");
    public static final By BLOQUEOTWOSHADOWDEVICE=By.cssSelector("#container-step-user-info");
    public static final By BLOQUEOTHEFTSHADOWDEVICE=By.cssSelector("#container-step-theft");
    public static final By BLOQUEOLOSSSHADOWDEVICE=By.cssSelector("#container-step-loss");


    public static final By BOTONCONSULTAR=By.cssSelector(".at-button-tertiary");
    public static final By MARCA_EQUIPO = By.cssSelector("h5.at-font-h5");
    public static final By LINEA_EQUIPO = By.cssSelector("p.at-font-p.label-detail");
    public static final By IMEI_EQUIPO = By.cssSelector("#carrousel_slide_0>div:nth-child(3)>div:nth-child(2)>p");
    public static final By ESTADO_EQUIPO_REGISTRADO = By.cssSelector(".at-font-p.label-detail.green-status");
    public static final By ESTADO_EQUIPO_NO_REGISTRADO = By.cssSelector(".at-font-p.label-detail.yellow-status");
    public static final By BOTON_BLOQUEO = By.cssSelector("button.at-button-primary.align-right");
    public static final By BOTON_BLOQUEAR = By.cssSelector("#btn_modal_block");

    public static final Target BOTON_CERRAR_AVISO= Target.the("Boton cerrar aviso advertencia)")
            .locatedBy("//img[contains(@id,'closeButtonNotDesktop')]");

    public static final By RADIOBUTTON_PERDIDA = By.cssSelector("div.at-input-radio>input[type=radio][value=loss]");
    public static final By RADIOBUTTON_ROBO = By.cssSelector("div.at-input-radio>input[type=radio][value=theft]");
    public static final By INPUT_NOMBRES_FORM_BLOQUEO=By.cssSelector("input#first_name");
    public static final By INPUT_APELLIDOS_FORM_BLOQUEO=By.cssSelector("input#last_name");
    public static final By INPUT_DOC_FORM_BLOQUEO = By.cssSelector("#document_number");
    public static final By INPUT_EMAIL_FORM_BLOQUEO = By.cssSelector("#email");
    public static final By INPUT_PHONE_FORM_BLOQUEO = By.cssSelector("#phone_number");
    public static final By INPUT_DEPARTAMENTO_FORM_BLOQUEO = By.cssSelector("#department_name");
    public static final By INPUT_ADDRESS_FORM_BLOQUEO = By.cssSelector("input#address");
    public static final By CONTINUAR_FORM_BLOQUEO = By.cssSelector("#actions-container>a.netx-step-action.at-button-primary");
    public static final By SELECT_DPTO = By.cssSelector("#department_name");
    public static final By SELECT_CITY = By.cssSelector("#city_name");

    public static final By INPUT_DEPTO_ROBO = By.cssSelector("#theft_department_name");
    public static final By INPUT_FECHA_ROBO = By.cssSelector("#theft_date");
    public static final By INPUT_HORA_ROBO = By.cssSelector("#theft_hour");
    public static final By INPUT_DIR_ROBO = By.cssSelector("#theft_address");
    public static final By INPUT_DESC_ROBO = By.cssSelector("#theft_description");

    public static final By INPUT_DEPTO_LOSS = By.cssSelector("#loss_department_name");
    public static final By INPUT_FECHA_LOSS = By.cssSelector("#loss_date");
    public static final By INPUT_HORA_LOSS = By.cssSelector("#loss_hour");
    public static final By INPUT_DIR_LOSS = By.cssSelector("#loss_address");
    public static final By INPUT_DESC_LOSS = By.cssSelector("#loss_description");
    public static final By BOTON_FINALIZAR = By.cssSelector("#actions-container>a.netx-step-action.at-button-primary");


}
