package tests;


import org.testng.annotations.Test;
import pages.LoginPage;
import setup.Setup;

public class AdminLogin extends Setup {

    @Test(priority = 1,description = "Admin Login Test")
    public void adminLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.adminLogin();



    }



}
