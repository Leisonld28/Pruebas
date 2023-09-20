package co.com.tigo.qa.tasks;

import co.com.tigo.qa.utils.EsperaForzada;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import static co.com.tigo.qa.userinterfaces.ServiciosUI.*;
import static co.com.tigo.qa.utils.getShadowRoot.getTargetShadow;

public class SinDescuentos implements Task{

    private WebDriver driver;


    public SinDescuentos(WebDriver driver) {
        this.driver = driver;


    }

    @Override
    public <T extends Actor> void performAs(T t) {

        getTargetShadow(driver, SHADOWCARDSINDESCUENTOS, BOTON_VER_DESCUENTOS).click();
        EsperaForzada.espera(5);
        getTargetShadow(driver, SHADOWCARDSINDESCUENTOSHOME, TITULO_MISDESCUENTOS).getRect();
        EsperaForzada.espera(5);
    }

    public static SinDescuentos descuentos(WebDriver driver){
        return Tasks.instrumented(SinDescuentos. class, driver);
    }
}



