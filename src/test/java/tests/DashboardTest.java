package tests;


import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import setup.BrowserSetup;

import java.io.IOException;

public class DashboardTest extends BrowserSetup {



    @BeforeTest
    public void openLoginPageAndLogin() throws IOException, ParseException {
        LoginPage login = new LoginPage();
        login.navigatingLogin();
        login.validUserLogin();
    }

    @Test(priority = 1, description = "Add item test")
    public void addItemTest() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.addItem();

    }
}
