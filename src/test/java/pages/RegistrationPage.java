package pages;

import com.github.javafaker.Faker;
import jdk.jshell.execution.Util;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.BrowserSetup;
import utils.Utils;

public class RegistrationPage extends BasePage {
    @FindBy(css = "[href = '/register']")
    WebElement registrationLink;
    @FindBy(id = "firstName")
    WebElement firstNameTextField;
    @FindBy(id = "lastName")
    WebElement lastNameTextField;
    @FindBy(id = "email")
    WebElement emailTextField;
    @FindBy(id = "password")
    WebElement passwordTextField;
    @FindBy(id = "phoneNumber")
    WebElement phoneNumberTextField;
    @FindBy(id = "address")
    WebElement addressTextField;
    @FindBy(css = "[value = 'Male']")
    WebElement genderMaleRadioBtn;
    @FindBy(css = "[type='checkbox']")
    WebElement checkbox;
    @FindBy(id = "register")
    WebElement registerBtn;

    public RegistrationPage() {
        PageFactory.initElements(BrowserSetup.getDriver(), this); //constructor for initiating all the dom of Registration
    }

    public void navigatingToRegistrationPage() {
        BrowserSetup.getDriver().get("https://dailyfinance.roadtocareer.net/");
        registrationLink.click();
    }

    public void validRegistration() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = Utils.randomEmailGenerator();
        String password = faker.internet().password(8, 20);
        String phoneNumber = Utils.randomPhoneNumberGenerator();// calls with class name for  static method
        String address = faker.address().country();
        // Utils utils = new Utils();
        // firstNameTextField.sendKeys("Zayed Iqbal");
        clickAndType(firstNameTextField, firstName);
        clickAndType(lastNameTextField, lastName);
        clickAndType(emailTextField, email);
        clickAndType(passwordTextField, password);
        clickAndType(phoneNumberTextField, phoneNumber);
        clickAndType(addressTextField, address);
        genderMaleRadioBtn.click();
        checkbox.click();
        registerBtn.click();


        Utils.savingInFile("./src/test/resources/users.json", "[]");

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("firstName", firstName);
        jsonObject.put("LastName", lastName);
        jsonObject.put("email", email);
        jsonObject.put("password", password);
        jsonObject.put("phone", phoneNumber);
        jsonObject.put("address", address);

        Utils.savingUserData(jsonObject);
    }
}
