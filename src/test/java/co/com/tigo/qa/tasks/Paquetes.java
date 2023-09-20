package co.com.tigo.qa.tasks;

import co.com.tigo.qa.interactions.Espera;
import co.com.tigo.qa.models.Paquetigos;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;

import static co.com.tigo.qa.userinterfaces.PaquetesUI.*;

public class Paquetes {

    public static Performable conSaldo(String tipoPago, Paquetigos paquetigo) {
        return Task.where("{0} realiza la selección y compra de paquetigo",
                Espera.esperaSeg(5),
                Scroll.to(OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())),
                Espera.esperaSeg(5),
                JavaScriptClick.on(OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())),
                Espera.esperaSeg(15),
                Scroll.to(OPCION_MENU_FORMA_DE_PAGO.of(tipoPago + "")).andAlignToTop(),
                Espera.esperaSeg(15)
        );
    }
    public static Performable CompraUnaVezPaquetigo(String tipoPago, Paquetigos paquetigo) {
        return Task.where("{0} realiza la selección y compra de paquetigo",
                Espera.esperaSeg(5),
                Scroll.to(OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())).andAlignToTop(),
                Espera.esperaSeg(5),
                JavaScriptClick.on(OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())),
                Espera.esperaSeg(15),
                Click.on(BOTON_COMPRA_UNAVEZ),
                Espera.esperaSeg(5),
                Scroll.to(OPCION_MENU_FORMA_DE_PAGO.of(tipoPago + "")).andAlignToTop()
        );
    }
    public static Performable CompraPaquetigo(String tipoPago, Paquetigos paquetigo) {
        return Task.where("{0} realiza la selección y compra de paquetigo",
                Espera.esperaSeg(5),
                Scroll.to(OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())).andAlignToTop(),
                Espera.esperaSeg(5),
                JavaScriptClick.on(OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())),
                Espera.esperaSeg(15),
                Click.on(BOTON_COMPRA_RECURRENTE),
                Scroll.to(OPCION_MENU_FORMA_DE_PAGO.of(tipoPago)).andAlignToTop()
        );
    }
    public static Performable TigoTePresta(Paquetigos paquetigo) {
        return Task.where("{0} realiza la selección de Tigo Te Presta",
                Scroll.to(OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())).andAlignToTop(),
                Espera.esperaSeg(5),
                JavaScriptClick.on(OPCION_MENU_PAQUETIGOS.of(paquetigo.getPaquetigo())),
                Espera.esperaSeg(10),
                JavaScriptClick.on(BOTON_TIGOTEPRESTA),
                Scroll.to(BOTON_PAGAR_TP).andAlignToTop(),
                Click.on(BOTON_PAGAR_TP)
        );
    }

    public static Performable PagueTigo(Paquetigos paguetigo, String precio) {
        return Task.where("haceClickenelPaguetigoLargaDistancia",
                Espera.esperaSeg(10),
                Scroll.to(paquetesLargaDistanciaInternacional(paguetigo.getPaquetigo())),
                Click.on(botonesSaldo(precio))
        );
    }

    public static Performable DetallesdeCompra() {
        return Task.where("detallesdepaqueteinternacional",
                Espera.esperaSeg(15),
                Scroll.to(DETALLES_DE_COMPRA),
                Espera.esperaSeg(15)

        );
    }
}