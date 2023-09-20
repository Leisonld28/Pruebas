package co.com.tigo.qa.tasks;

import co.com.tigo.qa.utils.EjecutarScript;
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

public class LLenarSegundaForma implements Task {
    private WebDriver driver;
    private String tipo;
    private WebElement webelementoformtheft;
    private WebElement webelementoformloss;
    static PropertiesLoader propertiesLoader = PropertiesLoader.getInstance();

    public LLenarSegundaForma(WebDriver driver, String tipo) {

        this.driver = driver;
        this.tipo = tipo;

    }

    @Override
    public <T extends Actor> void performAs(T t) {

        String Fecha = propertiesLoader.getProperty("FECHA");
        String Hora = propertiesLoader.getProperty("HORA");
        String Desc = propertiesLoader.getProperty("DESC_RYP");
        String Direcc= propertiesLoader.getProperty("DIRECC");
        String Depto= propertiesLoader.getProperty("DEPTO");






        if (tipo.equals("Robo")){

            webelementoformtheft = getTargetShadow(driver, BLOQUEOONESHADOWDEVICE, BLOQUEOTHEFTSHADOWDEVICE);
            getShadowExistente(webelementoformtheft, INPUT_DEPTO_ROBO).sendKeys(Depto);
            getShadowExistente(webelementoformtheft, INPUT_FECHA_ROBO).sendKeys(Fecha);
            getShadowExistente(webelementoformtheft, INPUT_HORA_ROBO).sendKeys(Hora);
            EsperaForzada.espera(3);
            getShadowExistente(webelementoformtheft, INPUT_DIR_ROBO).sendKeys(Direcc);
            EsperaForzada.espera(5);
            EjecutarScript.scrollSelenium(driver,getShadowExistente(webelementoformtheft, INPUT_DESC_ROBO));
            getShadowExistente(webelementoformtheft, INPUT_DESC_ROBO).click();
            getShadowExistente(webelementoformtheft, INPUT_DESC_ROBO).clear();
            getShadowExistente(webelementoformtheft, INPUT_DESC_ROBO).sendKeys(Desc);




        }else {

            webelementoformloss = getTargetShadow(driver, BLOQUEOONESHADOWDEVICE, BLOQUEOLOSSSHADOWDEVICE);
            EjecutarScript.scrollSelenium(driver,getShadowExistente(webelementoformloss, INPUT_DEPTO_LOSS));
            getShadowExistente(webelementoformloss, INPUT_DEPTO_LOSS).sendKeys(Depto);
            getShadowExistente(webelementoformloss, INPUT_FECHA_LOSS).sendKeys(Fecha);
            getShadowExistente(webelementoformloss, INPUT_HORA_LOSS).sendKeys(Hora);
            EsperaForzada.espera(3);
            getShadowExistente(webelementoformloss, INPUT_DIR_LOSS).sendKeys(Direcc);
            EsperaForzada.espera(5);
            getShadowExistente(webelementoformloss, INPUT_DESC_LOSS).click();
            getShadowExistente(webelementoformloss, INPUT_DESC_LOSS).clear();
            getShadowExistente(webelementoformloss, INPUT_DESC_LOSS).sendKeys(Desc);
            EjecutarScript.scrollSelenium(driver,getShadowExistente(webelementoformloss, BOTON_FINALIZAR));


        }




    }
    public static LLenarSegundaForma llenar(WebDriver driver, String tipo){
        return Tasks.instrumented(LLenarSegundaForma.class, driver, tipo);
    }
}
