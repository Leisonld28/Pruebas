package co.com.tigo.qa.tasks;

import static co.com.tigo.qa.userinterfaces.LoginUI.*;
import static java.time.Duration.ofSeconds;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.tigo.qa.interactions.Espera;
import co.com.tigo.qa.utils.PropertiesLoader;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

public class Login {
    static PropertiesLoader propertiesLoader = PropertiesLoader.getInstance();
    WebDriver driver;

    public static Performable autenticar(){
        return Task.where("Autenticar ",
                Open.url(propertiesLoader.getProperty("webdriver.base.url")),
                WaitUntil.the(CAMPO_USUARIO_AUTENTICACION, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(propertiesLoader.getProperty("U_PRUEBA")).into(CAMPO_USUARIO_AUTENTICACION),
                Espera.esperaSeg(4),
                Enter.theValue(propertiesLoader.getProperty("C_PRUEBA")).into(CAMPO_CONTRASEÑA_AUTENTICACION),
                Click.on(BOTON_CONTINUAR)


        );

    }



    public static Performable formulariocompra(){
        return Task.where("Formulariocompra ",
                WaitUntil.the(NOMBRE_COMPRA, isVisible()).forNoMoreThan(8).seconds(),
                Enter.theValue(propertiesLoader.getProperty("N_COMPRA")).into(NOMBRE_COMPRA),
                Espera.esperaSeg(4),
                Enter.theValue(propertiesLoader.getProperty("A_COMPRA")).into(APELLIDO_COMPRA),
                Enter.theValue(propertiesLoader.getProperty("ZIP_COMPRA")).into(CODIGOPOSTAL_COMPRA),
                Click.on(CONTINUAR_COMPRA1)


        );

    }
}

