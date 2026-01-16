package runner;

import io.qameta.allure.testng.AllureTestNg;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import setup.BrowserSetup;

import java.io.IOException;


@Listeners(AllureTestNg.class)
public class LoginPageTestRunner extends BrowserSetup {
    LoginPage loginPg = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @BeforeMethod
    public void openLoginPage() {
        loginPg.navigatingLogin();
    }

    @Test(priority = 1, description = "User Login with invalid email and password")
    public void invalidUserLoginTest() {
        loginPg.invalidUserLogin();
    }

    @Test(priority = 2, description = "valid user login")
    public void validUserLoginTest() throws IOException, ParseException {
        loginPg.validUserLogin();
        dashboardPage.userTableTitleAssertion();
        dashboardPage.logOut();
    }
    @Test(priority = 3, description = "Blank Email and Password Login")
    public void emptyEmailPasswordLoginTest(){

        loginPg.emptyEmailPasswordLogin();
    }

}
