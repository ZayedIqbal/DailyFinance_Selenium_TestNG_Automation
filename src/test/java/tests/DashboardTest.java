package tests;


import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import setup.Setup;

import java.io.IOException;

public class DashboardTest extends Setup {



    @BeforeTest
    public void openLoginPageAndLogin() throws IOException, ParseException {
        LoginPage login = new LoginPage(driver);
        login.validUserLogin();
    }

    @Test(priority = 1, description = "Verify successful add item test")
    public void addItemTest() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.addItem();

    }
}
