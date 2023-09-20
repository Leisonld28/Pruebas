package co.com.tigo.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ObjetoVisibles implements Question<Boolean>{

    private Target Objeto;

    public ObjetoVisibles(Target objeto) {
        Objeto = objeto;
        this.Objeto = objeto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(Objeto).answeredBy(actor);
    }

    public static ObjetoVisibles esVisible(Target objeto) {
        return new ObjetoVisibles(objeto);
    }
}
