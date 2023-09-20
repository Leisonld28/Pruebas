package co.com.tigo.qa.tasks;

import co.com.tigo.qa.utils.EsperaForzada;
import co.com.tigo.qa.utils.PropertiesLoader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static co.com.tigo.qa.userinterfaces.ConsultaDispositivoUI.*;
import static co.com.tigo.qa.utils.getShadowRoot.getShadowExistente;
import static co.com.tigo.qa.utils.getShadowRoot.getTargetShadow;

public class LLenarFormaBloqueo implements Task {
    private WebDriver driver;
    private String tipo;
    private WebElement webelementoformuno;
    static PropertiesLoader propertiesLoader = PropertiesLoader.getInstance();

    public LLenarFormaBloqueo(WebDriver driver, String tipo) {

        this.driver = driver;
        this.tipo = tipo;

    }

    @Override
    public <T extends Actor> void performAs(T t) {

        String NOMBRE = propertiesLoader.getProperty("NOMBRES");
        String APELLIDO = propertiesLoader.getProperty("APELLIDO");
        String DOC = propertiesLoader.getProperty("DOCUMENTO");
        String Email = propertiesLoader.getProperty("EMAIL");
        String Phone= propertiesLoader.getProperty("TELEFONO");
        String Direcc= propertiesLoader.getProperty("DIRECCION");
        String Depto= propertiesLoader.getProperty("DEPTO");

        webelementoformuno = getTargetShadow(driver, BLOQUEOONESHADOWDEVICE, BLOQUEOTWOSHADOWDEVICE);

        EsperaForzada.espera(2);

        if (tipo.equals("Robo")){

           getShadowExistente(webelementoformuno, RADIOBUTTON_ROBO).click();


        }else {

           getShadowExistente(webelementoformuno, RADIOBUTTON_PERDIDA).click();


        }


        getShadowExistente(webelementoformuno, INPUT_NOMBRES_FORM_BLOQUEO).sendKeys(NOMBRE);
        getShadowExistente(webelementoformuno, INPUT_APELLIDOS_FORM_BLOQUEO).sendKeys(APELLIDO);
        getShadowExistente(webelementoformuno, INPUT_DOC_FORM_BLOQUEO).sendKeys(DOC);
        getShadowExistente(webelementoformuno, INPUT_EMAIL_FORM_BLOQUEO).sendKeys(Email);
        getShadowExistente(webelementoformuno, INPUT_PHONE_FORM_BLOQUEO).sendKeys(Phone);
        getShadowExistente(webelementoformuno, INPUT_DEPARTAMENTO_FORM_BLOQUEO).sendKeys(Depto);
        getShadowExistente(webelementoformuno, INPUT_ADDRESS_FORM_BLOQUEO).sendKeys(Direcc);
        EsperaForzada.espera(5);
        getShadowExistente(webelementoformuno, CONTINUAR_FORM_BLOQUEO).click();
        EsperaForzada.espera(5);


    }
    public static LLenarFormaBloqueo llenar(WebDriver driver, String tipo){
        return Tasks.instrumented(LLenarFormaBloqueo.class, driver, tipo);
    }
}
