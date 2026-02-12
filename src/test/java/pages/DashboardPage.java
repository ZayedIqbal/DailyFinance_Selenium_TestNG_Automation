package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import setup.BrowserSetup;
import utils.Utils;

public class DashboardPage extends BasePage {
    @FindBy(css = "h2")
    WebElement userDailyCostsLabel;
    @FindBy(css = ".add-cost-button")
    WebElement addCostButton;
    @FindBy(xpath = "//button[@aria-label='account of current user']")
    WebElement currentUserIcon;
    @FindBy(xpath = "//li[contains(text(),'Logout')]")
    WebElement logOutButton;
    @FindBy(id = "itemName")
    WebElement itemNameTextField;
    @FindBy(css = "[type ='number']")
    WebElement quantityField;
    @FindBy(id = "amount")
    WebElement amountField;
    @FindBy(css = "[type = 'submit']")
    WebElement submitButton;

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void userTableTitleAssertion() {
        Assert.assertEquals(userDailyCostsLabel.getText(), "User Daily Costs");
    }

    public void logOut() {
        currentUserIcon.click();
        logOutButton.click();
    }

    public void addItem() throws InterruptedException {
        Faker faker = new Faker();
        addCostButton.click();
        clickAndType(itemNameTextField, faker.food().fruit());
        clickAndType(amountField, Utils.randomPhoneNumberGenerator(1, 100));
        scrollDown(500);
        submitButton.click();
        Thread.sleep(2000); //wait for clicking alert
        // using driver from any class BrowserSetup.getDriver()
        BrowserSetup.getDriver().switchTo().alert().accept();
    }
}
