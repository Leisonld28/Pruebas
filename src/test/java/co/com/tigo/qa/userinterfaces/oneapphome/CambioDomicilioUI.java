package co.com.tigo.qa.userinterfaces.oneapphome;

import org.openqa.selenium.By;

public class CambioDomicilioUI {
    public CambioDomicilioUI() {
    }
    public static final By SHADOW_CARD_CAMBIO_DOMICILIO = By.xpath("//wc-mitigo-zendesk-changeaddress-card-co");
    public static final By BOTON_SOLICITAR = By.cssSelector(".at-button-tertiary");
    public static final By SHADOW_PRIMER_FORMULARIO = By.xpath("//wc-mitigo-zendesk-changeaddress-form-co");
    public static final By SHADOW_INTERMEDIO_UNO = By.cssSelector("*[data-tag-name*='step-a']");;
    public static final By SHADOW_INTERMEDIO_DOS = By.cssSelector("*[data-tag-name*='step-b']");;
    public static final By INPUT_CELULAR = By.cssSelector("input[name*='mobile_number']");
    public static final By BOTON_CONTINUAR = By.cssSelector(".at-button-primary");
    public static final By MENU_DEPARTAMENTO_ACTUAL = By.cssSelector("select[name*='actual_department'] option:nth-of-type(2)");
    public static final By MENU_DEPARTAMENTO_NUEVO= By.cssSelector("select[name*='new_department'] option:nth-of-type(3)");
    public static final By INPUT_DIRECCION_ACTUAL = By.cssSelector("input[name*='actual_address']");
    public static final By INPUT_DIRECCION_NUEVA = By.cssSelector("input[name*='new_address']");




}
