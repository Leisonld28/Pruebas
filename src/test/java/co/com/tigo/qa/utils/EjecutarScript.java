package co.com.tigo.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EjecutarScript {
    public static void ejecutarScript(WebDriver driver, By objeto, String script){
        WebElement element=driver.findElement(objeto);
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript(script, element);
    }

    public static void scrollSelenium(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static void clickSelenium(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
}
