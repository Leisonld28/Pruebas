package co.com.tigo.qa.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.tigo.qa.userinterfaces.OneAppMovilUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeleccionarDetalle {
    /*public static Performable Minutos(){
        return Task.where("{0} Selecciona detalles de minutos",
                Consumos.lineaYConsumo(),
                Scroll.to(VER_DETALLES_MINUTOS),
                WaitUntil.the(VER_DETALLES_MINUTOS, isEnabled()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(VER_DETALLES_MINUTOS)
        );
    }
    public static Performable Mensajes(){
        return Task.where("{0} Selecciona detalles de minutos",
                Consumos.lineaYConsumo(),
                WaitUntil.the(OPCION_DETALLES_MENSAJES, isEnabled()).forNoMoreThan(10).seconds(),
                Scroll.to(OPCION_DETALLES_MENSAJES).andAlignToTop(),
                Click.on(OPCION_DETALLES_MENSAJES)
        );
    }
    public static Performable Compras(){
        return Task.where("{0} Selecciona detalles de minutos",
                Consumos.lineaYConsumo(),
                Click.on(CONSUMOS),
                WaitUntil.the(INTERNET_CONSUMOS, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(INTERNET_CONSUMOS)
        );
    }*/
}
