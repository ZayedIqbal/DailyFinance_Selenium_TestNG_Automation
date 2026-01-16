package runner;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import setup.BrowserSetup;

public class RegistrationTestRunner extends BrowserSetup {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test(priority = 1, description = "Navigating to Registration Page")
    public void toRegistrationPage() {
        registrationPage.navigatingToRegistrationPage();
        // Assert.assertEquals();
    }
@Test(priority = 2)
    public void validUserRegistration() {
        registrationPage.validRegistration();

    }


}
