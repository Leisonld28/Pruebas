package co.com.tigo.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.targets.Target;

public class ObjetosClicleables implements Question {

    private static Target objeto;

    public ObjetosClicleables(Target objeto) {
        this.objeto= objeto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Enabled.of(objeto).answeredBy(actor);
    }

    public static ObjetosClicleables estaVisible(Target objeto){
        return new ObjetosClicleables(objeto);
    }
}
