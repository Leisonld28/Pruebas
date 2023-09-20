package co.com.tigo.qa.tasks;

import co.com.tigo.qa.utils.EsperaForzada;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static co.com.tigo.qa.userinterfaces.ServiciosUI.*;
import static co.com.tigo.qa.utils.getShadowRoot.getTargetShadow;
import static org.aspectj.weaver.ResolvedType.isVisible;

public class ProductoVoz implements Task{

    private WebDriver driver;


    public ProductoVoz(WebDriver driver) {
        this.driver = driver;


    }

    @Override
    public <T extends Actor> void performAs(T t) {
        EsperaForzada.espera(6);
        getTargetShadow(driver, SHADOW_CARD_INFORMACION_VOZ,BOTON_HISTORIAL_VOZ).click();
        EsperaForzada.espera(8);
        getTargetShadow(driver, SHADOW_CARD_HISTORICO,TITULO_HISTORICO_CONSUMO).getRect();
        EsperaForzada.espera(10);
    }

    public static ProductoVoz voz(WebDriver driver){
        return Tasks.instrumented(ProductoVoz. class, driver);
    }
}



