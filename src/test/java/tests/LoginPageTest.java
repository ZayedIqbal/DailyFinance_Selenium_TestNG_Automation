package tests;

import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import setup.Setup;

import java.io.IOException;



public class LoginPageTest extends Setup {



//    @BeforeTest
//    public void openLoginPage() {
//        LoginPage loginPg = new LoginPage();
//        loginPg.navigatingLogin();
//    }

    @Test(priority = 1, description = "Verify user login with invalid credential")
    public void invalidUserLoginTest() {
        LoginPage loginPg = new LoginPage(driver);
        loginPg.invalidUserLogin();

    }

    @Test(priority = 2, description = "Verify user login with valid credential")
    public void validUserLoginTest() throws IOException, ParseException {
        LoginPage loginPg = new LoginPage(driver);
       // DashboardPage dashboardPage = new DashboardPage(WebDriver driver);
        loginPg.validUserLogin();
       // dashboardPage.userTableTitleAssertion();
       // dashboardPage.logOut();
    }
//    @Test(priority = 3, description = "Blank Email and Password Login")
//    public void emptyEmailPasswordLoginTest(){
//
//        loginPg.emptyEmailPasswordLogin();
//    }

}
