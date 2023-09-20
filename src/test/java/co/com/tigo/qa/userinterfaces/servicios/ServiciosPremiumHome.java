package co.com.tigo.qa.userinterfaces.servicios;

import net.serenitybdd.screenplay.targets.Target;

import java.util.HashMap;
import java.util.Map;

public class ServiciosPremiumHome {


    public static final Target BTN_GESTIONAR_TUS_PLANES = Target.the("Boton que accede a los card").locatedBy("//button[contains(.,'Gestionar')]");
    public static final Target CARD_AMAZON_PRIME = Target.the("Card de Amazon Prime").locatedBy("//*[@class = 'amazonVideo at-rw between card-services']{0}");
    public static final Target CARD_HBO_MAX = Target.the("Card de HBO MAX").locatedBy("//*[@class = 'at-rw between card-services hbo-max']{0}");
    public static final Target CARD_HOT_PACK = Target.the("Card de HOT PACK").locatedBy("//*[@class = 'at-rw between card-services hot']{0}");
    public static final Target CARD_WIN_SPORTS = Target.the("Card WIN SPORTS").locatedBy("//*[@class = 'at-rw between card-services outstanding win']{0}");
    public static final Target CARD_MENSAJE_PROMO_SERVICIO = Target.the("Texto del mensake").locatedBy("//h3[contains(.,'¡Estás disfrutando 3 meses Cortesía de Tigo!')]");
    public static final Target CARD_PRECIO_PROMO_SERVICIO = Target.the("precio en el card").locatedBy("//*[@class = 'title-box']//h3");
    public static final Target CARD_PRIME_VIDEO = Target.the("Card Prime Video").locatedBy("//div[contains(@class,'amazonVideo at-rw item-product')]");



    public static Map<String, Target> llamarCard() {
        Map<String, Target> Card = new HashMap<String, Target>();
        Card.put("AMAZON", CARD_AMAZON_PRIME);
        Card.put("HBO MAX", CARD_HBO_MAX);
        Card.put("HOT PACK", CARD_HOT_PACK);
        Card.put("WIN", CARD_WIN_SPORTS);
        Card.put("PRIME VIDEO", CARD_PRIME_VIDEO);


        return Card;
    }


}
