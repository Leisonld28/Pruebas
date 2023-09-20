package co.com.tigo.qa.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import static co.com.tigo.qa.userinterfaces.MenuMasUI.*;
import static java.time.Duration.ofSeconds;


public class SeleccionarMenuMas {


        public static Performable menumas(String opcion) {
           return Task.where("{0} Selecciona la opcion " + opcion,
                    Click.on(OPCION_MENU_MAS_ONEAPP.of(opcion).waitingForNoMoreThan(ofSeconds(30)))
             );
    }

}
