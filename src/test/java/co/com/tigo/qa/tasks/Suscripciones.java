package co.com.tigo.qa.tasks;

import co.com.tigo.qa.interactions.Espera;

import static java.time.Duration.ofSeconds;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.tigo.qa.userinterfaces.PaquetesUI.*;
import static co.com.tigo.qa.userinterfaces.OneAppMovilUI.*;

public class Suscripciones {

    public static Performable seleccionarSuscripcion(String suscripcion){
        return Task.where("selecciona suscripción {0}",
                Scroll.to(PAQUETE_SUSCRIPCION.of(suscripcion).waitingForNoMoreThan(ofSeconds(30))),
                Click.on(PAQUETE_SUSCRIPCION.of(suscripcion).waitingForNoMoreThan(ofSeconds(30)))
        );
    }

    public static Performable pagarSuscripcion(String tipoPago){
        return Task.where("selecciona forma de pago {0} y pagar suscripcion ",
                Espera.esperaSeg(5),
                Scroll.to(OPCION_MENU_FORMA_DE_PAGO.of(tipoPago)).andAlignToTop(),
                Click.on(OPCION_MENU_FORMA_DE_PAGO.of(tipoPago).waitingForNoMoreThan(ofSeconds(30))),
                Scroll.to(BOTON_PAGAR).andAlignToTop(),
                Click.on(BOTON_PAGAR)
        );
    }
    public static Performable ir(String seccion) {
        return Task.where("{0} scroll a la sección {0}",
                Scroll.to(SECCION.of(seccion).waitingForNoMoreThan(ofSeconds(30)))
        );

    }

    public static Performable EliminarSuscripcion () {
        return Task.where("{0}El selecciona el icono borrar Suscripcion",
                Click.on(ICONO_ELIMINAR_SUSCRIPCION)
        );
    };

    public static Performable ConfirmarBorradoSuscripcion () {
        return Task.where("{0}El selecciona confirmación de borrado Suscripcion",
                Click.on(CONFIRMAR_ELIMINAR_SUSCRIPCION)
        );
    };
}
