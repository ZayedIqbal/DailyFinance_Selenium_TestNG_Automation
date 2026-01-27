package pages;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import setup.BrowserSetup;
import utils.Utils;

import java.io.IOException;

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

    public LoginPage() {
        PageFactory.initElements(BrowserSetup.getDriver(), this);
    }

    public void navigatingLogin() {
        BrowserSetup.getDriver().get("https://dailyfinance.roadtocareer.net/");

    }


    public void invalidUserLogin(){
        clickAndType(emailTextField,Utils.randomEmailGenerator());
        clickAndType(passwordTextField,Utils.randomPhoneNumberGenerator(100000, 99999)); //using phone number as invalid password
        loginBtn.click();
        //Assert.assertEquals(invalidEmailPasswordAlertText.getText(),"Invalid email or password");
    }
    public void emptyEmailPasswordLogin(){
        loginBtn.click();
    }
    public void validUserLogin() throws IOException, ParseException {
        clickAndType(emailTextField, Utils.readingUserInformation(0, "email").toString());
        clickAndType(passwordTextField, Utils.readingUserInformation(0, "password").toString());
        scrollDown(500);
        loginBtn.click();
        //
    }

}
