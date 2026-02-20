package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://dailyfinance.roadtocareer.net/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }


}

// #### For using parallel Testing with Thread ####
    /*   public static final ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

    @BeforeMethod
    public static WebDriver getDriver() {
        if (threadDriver.get() == null) {
            threadDriver.set(new ChromeDriver());
            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        }
        return threadDriver.get();

    }

    @AfterMethod
    public static void quiteDriver() {
        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            threadDriver.set(null);
        }
    }*/

