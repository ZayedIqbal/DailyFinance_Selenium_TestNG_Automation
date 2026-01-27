package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BrowserSetup {
    public static final ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

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
    }
}
