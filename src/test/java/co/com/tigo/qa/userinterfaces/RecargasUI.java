package co.com.tigo.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

public class RecargasUI {

    public static final Target TAB_TIPOCOMPRA = Target.the("Tab {0}")
            .locatedBy("(//*[contains(div, '{0}')])[7]");
            
    public static final Target BOTON_OTRO_VALOR_RECARGA = Target.the("Boton otro valor")
            .locatedBy("(//*[contains(., 'Otro valor')])[27]");
            
    public static final Target VALOR_OTRA_RECARGAR = Target.the("Campo otro valor")
            .locatedBy("(//input[@name='amount'])");
            
    public static final Target BOTON_CONTINUAR = Target.the("Boton CONTINUAR")
            .locatedBy("//ion-button[@shape='round'][contains(.,'CONTINUAR')]");
            
    public static final Target BOTON_CONTINUAR_DESACTIVADO = Target.the("Boton CONTINUAR")
            .locatedBy("(//ion-button[@aria-disabled='true'])");

    public static final Target DESCRIPCION_DAVIPLATA = Target.the("Titulo Descripción Codigo OTP")
            .locatedBy("//label[@aria-label='Description Value'][contains(.,'Código OTP')]");

    public static final Target BOTON_CONTINUAR_NEQUI = Target.the("Boton CONTINUAR")
            .locatedBy("//*[contains(.,'CONTINUAR')]");


}


