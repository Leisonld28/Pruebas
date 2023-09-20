package co.com.tigo.qa.tasks;

import co.com.tigo.qa.utils.EsperaForzada;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import static co.com.tigo.qa.userinterfaces.ServiciosUI.*;
import static co.com.tigo.qa.utils.getShadowRoot.getTargetShadow;

public class DescuentosVencidos implements Task{

    private WebDriver driver;


    public DescuentosVencidos(WebDriver driver) {
        this.driver = driver;


    }

    @Override
    public <T extends Actor> void performAs(T t) {

        getTargetShadow(driver, SHADOWCARDDESCUENTOVENCIDOS, TITULO_DESCUENTOSVENCIDOS).getRect();
        EsperaForzada.espera(5);
        getTargetShadow(driver, SHADOWCARDDESCUENTOVENCIDOS, BOTON_DESPLIEGUE_DESCUENTOS_VENCIDOS).click();
        EsperaForzada.espera(5);
    }

    public static DescuentosVencidos descuentos(WebDriver driver){
        return Tasks.instrumented(DescuentosVencidos. class, driver);
    }
}



