package co.com.tigo.qa.utils;
import org.openqa.selenium.*;

public class getShadowRoot {
    public static WebElement getTargetShadow(WebDriver driver, By padreCssSelector, By hijoCssSelector){
        WebElement shadowHostmain = driver.findElement(padreCssSelector);
        return shadowHostmain.getShadowRoot().findElement(hijoCssSelector);
    }
    public static WebElement getShadowExistente(WebElement elemento, By hijoCssSelector){
        return elemento.getShadowRoot().findElement(hijoCssSelector);
    }

}