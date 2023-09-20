package co.com.tigo.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import static co.com.tigo.qa.userinterfaces.ConsultaDispositivoUI.SELECT_CITY;
import static co.com.tigo.qa.userinterfaces.ConsultaDispositivoUI.SELECT_DPTO;
import static co.com.tigo.qa.utils.EjecutarScript.ejecutarScript;

public class ServicioBloqueo implements Task {

private WebDriver driver;

    public ServicioBloqueo(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        ejecutarScript(driver,SELECT_DPTO,"arguments[0].setAttribute('value','Antioquia')");
        ejecutarScript(driver,SELECT_CITY,"arguments[0].setAttribute('value','Medellin')");

    }
    public static ServicioBloqueo ejecutar(WebDriver driver){
        return Tasks.instrumented(ServicioBloqueo.class, driver);
    }
}
