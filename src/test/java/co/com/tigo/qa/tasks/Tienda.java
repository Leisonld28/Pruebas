package co.com.tigo.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import static co.com.tigo.qa.userinterfaces.TiendaUI.BOTONIR;
import static co.com.tigo.qa.userinterfaces.TiendaUI.MAINSHADOWTIENDA;
import static co.com.tigo.qa.utils.EjecutarScript.scrollSelenium;
import static co.com.tigo.qa.utils.getShadowRoot.getTargetShadow;

public class Tienda implements Task {

    private final WebDriver driver;

    public Tienda(WebDriver driver) {
        this.driver = driver;

    }

    @Override
    public <T extends Actor> void performAs(T t) {
        scrollSelenium(driver, getTargetShadow(driver, MAINSHADOWTIENDA, BOTONIR));
        getTargetShadow(driver, MAINSHADOWTIENDA, BOTONIR).click();

    }

    public static Tienda irATienda(WebDriver driver) {
        return Tasks.instrumented(Tienda.class, driver);
    }
}