package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import setup.BrowserSetup;

public class RegistrationTest extends BrowserSetup {


//    @BeforeTest()
//    public void toRegistrationPage() {
//        RegistrationPage registrationPage = new RegistrationPage();
//        registrationPage.navigatingToRegistrationPage();
//        // Assert.assertEquals();
//    }

    @Test(priority = 1, description = "Valid User Registration")
    public void validUserRegistration() throws InterruptedException {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.validRegistration();
        //Thread.sleep(10000);

    }


}
