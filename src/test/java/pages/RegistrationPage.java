package pages;

import com.github.javafaker.Faker;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver,this); //constructor for initiating all the dom of Registration
    }

//    public void navigatingToRegistrationPage() {
//       // BrowserSetup.getDriver().get("https://dailyfinance.roadtocareer.net/");
//        scrollDown(driver,500);
//        registrationLink.click();
//    }

    public void validRegistration() throws InterruptedException {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = Utils.randomEmailGenerator();
        String password = faker.internet().password(8, 20);
        String phoneNumber = Utils.randomPhoneNumberGenerator(300000000, 999999999);// calls with class name for  static method
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
        Thread.sleep(7000);


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
