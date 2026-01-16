package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import setup.BrowserSetup;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

//import static java.time.Duration.*;

public class BasePage {
    WebDriverWait wait = new WebDriverWait(BrowserSetup.getDriver(), ofSeconds(10));

    public void clickAndType(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        element.sendKeys(text);
    }
}
