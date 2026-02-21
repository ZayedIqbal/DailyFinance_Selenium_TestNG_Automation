package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import setup.Setup;

public class RegistrationTest extends Setup {


//    @BeforeTest()
//    public void toRegistrationPage() {
//        RegistrationPage registrationPage = new RegistrationPage();
//        registrationPage.navigatingToRegistrationPage();
//        // Assert.assertEquals();
//    }

    @Test(priority = 1, description = "Verify Valid User Registration")
    public void validUserRegistration() throws InterruptedException {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        driver.findElement(By.cssSelector("[href = '/register']")).click();
        registrationPage.validRegistration();
        //Thread.sleep(10000);

    }


}
