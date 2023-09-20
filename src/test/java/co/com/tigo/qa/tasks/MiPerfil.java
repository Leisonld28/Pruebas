package co.com.tigo.qa.tasks;

import co.com.tigo.qa.interactions.Espera;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.tigo.qa.userinterfaces.MiPerfilUI.*;

public class MiPerfil {

    public static Performable digitarAntiguaContraseña(){
        return Task.where("Cambiar Contraseña",

                Enter.theValue("2800861d@#D").into(DIGITAR_ANTIGUA_CONTRASEÑA),
                Espera.esperaSeg(3),
                Enter.theValue("2800861d@#D").into(DIGITAR_NUEVA_CONTRASEÑA),
                Espera.esperaSeg(3)
        );

    }
}
