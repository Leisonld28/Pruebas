package co.com.tigo.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import static co.com.tigo.qa.userinterfaces.ConsultaDispositivoUI.BOTONCONSULTAR;
import static co.com.tigo.qa.userinterfaces.ServiciosUI.MAINSHADOWSOPORTE;
import static co.com.tigo.qa.utils.EjecutarScript.scrollSelenium;
import static co.com.tigo.qa.utils.getShadowRoot.getTargetShadow;

public class SoporteTecnico implements Task{

    private WebDriver driver;

    public SoporteTecnico(WebDriver driver) {
        this.driver = driver;

    }

    @Override
    public <T extends Actor> void performAs(T t) {

        scrollSelenium(driver, getTargetShadow(driver, MAINSHADOWSOPORTE, BOTONCONSULTAR));
        getTargetShadow(driver,MAINSHADOWSOPORTE, BOTONCONSULTAR).click();

        }


    public static SoporteTecnico soportetecnicomovil(WebDriver driver){
        return Tasks.instrumented(SoporteTecnico.class, driver);
    }
}


