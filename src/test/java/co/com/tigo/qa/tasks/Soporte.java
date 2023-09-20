package co.com.tigo.qa.tasks;

import co.com.tigo.qa.interactions.Espera;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static co.com.tigo.qa.userinterfaces.ServiciosUI.IFRAME_SERVICIOS_GENERAL;
import static co.com.tigo.qa.userinterfaces.SoporteUI.*;
import static java.time.Duration.ofSeconds;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Soporte {

    public static Performable testVelocidad(){
        return  Task.where("{0} Selecciona el Test de Velocidad",
                Espera.esperaSeg(5),
                Click.on(BOTON_TEST_VELOCIDAD.waitingForNoMoreThan(ofSeconds(30)))
        );
    }

    public static Performable configuracionWiFi() {
        return  Task.where("{0} Selecciona la Configuración WIFI",
                Espera.esperaSeg(5),
                Click.on(BOTON_CONFIGURACION.waitingForNoMoreThan(ofSeconds(30)))
        );
    }

    public static Performable redyajustes(WebDriver driver) {
        return  Task.where("{0} Selecciona la Configuración WIFI",
                Espera.esperaSeg(5),
                WaitUntil.the(IFRAME_SERVICIOS_GENERAL, isVisible()).forNoMoreThan(20).seconds(),
                Switch.toFrame(driver.findElement(IFRAME_SERVICIOS_GENERAL)),
                WaitUntil.the(CARD_TU_DISPOSITIVO, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_AJUSTES),
                WaitUntil.the(TITULO_MODEM, isVisible()).forNoMoreThan(20).seconds(),
                Espera.esperaSeg(10),
                Switch.toDefaultContext()
        );
    }
}
