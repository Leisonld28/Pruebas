package co.com.tigo.qa.userinterfaces;

import org.openqa.selenium.By;

public class FacturaDigitalMovilUI {




    public static final By MAINSHADOWDIGITALMOVIL=By.xpath("//wc-change-digital-billing-co-launcher");
    public static final By SECONDSHADOWDIGITALMOVIL=By.xpath("//wc-change-digital-billing-co-detail");



    public static final By TITULO_FACTURADIGI = By.cssSelector("h4.at-font-h4");
    public static final By BOTONMODIFICAR = By.cssSelector("a#action-get-detail");

    public static final By BOTONMODIFICAR2 =By.cssSelector("a#show-email-form");
    public static final By INPUT_EMAIL = By.cssSelector("input#user_email");
   public static final By BOTONACEPTAR =By.cssSelector("a#submit-button");




}
