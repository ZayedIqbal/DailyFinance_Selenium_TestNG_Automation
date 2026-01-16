package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.time.Duration;

public class BrowserSetup {
    public static final ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (threadDriver.get() == null) {
            threadDriver.set(new ChromeDriver());
            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        return threadDriver.get();

    }
   @AfterTest
    public static void quiteDriver() {
        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            threadDriver.set(null);
        }
    }
}
