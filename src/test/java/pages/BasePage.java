package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import setup.BrowserSetup;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

//import static java.time.Duration.*;

public class BasePage {
    WebDriver driver;
    //WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, ofSeconds(10));


    public void clickAndType(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        element.clear(); // for clear the text field
        element.sendKeys(text);
    }

    public static void scrollDown(WebDriver driver, int px){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, "+px+");");
    }


}
