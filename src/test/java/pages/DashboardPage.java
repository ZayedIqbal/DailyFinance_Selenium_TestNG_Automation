package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import setup.BrowserSetup;

public class DashboardPage extends BasePage {
    @FindBy(css = "h2")
    WebElement userDailyCostsLabel;
    @FindBy(xpath = "//button[text()='Add Cost']")
    WebElement addCostButton;
    @FindBy(xpath = "//button[@aria-label='account of current user']")
    WebElement currentUserIcon;
    @FindBy(xpath = "//li[contains(text(),'Logout')]")
    WebElement logOutButton;

    public DashboardPage(){
        PageFactory.initElements(BrowserSetup.getDriver(),this);
    }
    public void userTableTitleAssertion(){
        Assert.assertEquals(userDailyCostsLabel.getText(),"User Daily Costs");
    }

    public void logOut(){
        currentUserIcon.click();
        logOutButton.click();
    }
}
