package co.com.tigo.qa.tasks;

import co.com.tigo.qa.utils.EsperaForzada;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import static co.com.tigo.qa.userinterfaces.ServiciosUI.*;
import static co.com.tigo.qa.utils.getShadowRoot.getTargetShadow;

public class DescuentosActivos implements Task{

    private WebDriver driver;


    public DescuentosActivos(WebDriver driver) {
        this.driver = driver;


    }

    @Override
    public <T extends Actor> void performAs(T t) {

        getTargetShadow(driver, SHADOWCARDDESCUENTOS, BOTON_VER_DESCUENTOS).click();
        EsperaForzada.espera(5);
        getTargetShadow(driver, SHADOWCARDDESCUENTOSACTIVOS, TITULO_DESCUENTOSACTIVOS).getRect();
        EsperaForzada.espera(5);
    }

    public static DescuentosActivos descuentos(WebDriver driver){
        return Tasks.instrumented(DescuentosActivos. class, driver);
    }
}



