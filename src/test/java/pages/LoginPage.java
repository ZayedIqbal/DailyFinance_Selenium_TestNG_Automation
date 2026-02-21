package pages;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import setup.Setup;
import utils.Utils;

import java.io.IOException;
import java.time.Duration;

public class LoginPage extends BasePage {
    @FindBy(id = "email")
    WebElement emailTextField;
    @FindBy(id = "password")
    WebElement passwordTextField;
    @FindBy(css = "[type = 'submit']")
    WebElement loginBtn;
    @FindBy(css = "h2")
    WebElement userDailyCostsLabel;
    @FindBy(xpath = "//p[contains(text(),'Invalid email or password')]")
    WebElement invalidEmailPasswordAlertText;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void invalidUserLogin() {
        clickAndType(emailTextField, Utils.randomEmailGenerator());
        clickAndType(passwordTextField, Utils.randomPhoneNumberGenerator(100000, 99999)); //using phone number as invalid password
        loginBtn.click();
        //Assert.assertEquals(invalidEmailPasswordAlertText.getText(),"Invalid email or password");
    }

    public void emptyEmailPasswordLogin() {
        loginBtn.click();
    }

    public void validUserLogin() throws IOException, ParseException {
        clickAndType(emailTextField, Utils.readingUserInformation(0, "email").toString());
        clickAndType(passwordTextField, Utils.readingUserInformation(0, "password").toString());
        scrollDown(driver, 500);
        loginBtn.click();
        //
    }

    public void adminLogin() {
        String email = System.getProperty("email");
        String password = System.getProperty("password");
//
////        System.out.println("Email: " + email);
////        System.out.println("Password: " + password);

        clickAndType(emailTextField, email);
        clickAndType(passwordTextField, password);
        //  scrollDown(driver,500);
        loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("total-count")));
        //driver.findElement(By.className(".total-count"));
    }

}
