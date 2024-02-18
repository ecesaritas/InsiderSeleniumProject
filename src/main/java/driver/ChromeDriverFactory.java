package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ChromeDriverFactory {
    public static WebDriver getDriver(String driverName) {
        Properties properties = new Properties();

        try {
            properties.load(new FileReader("src/main/resources/test.properties"));
        } catch (IOException ignored) {
        }

        ChromeOptions chromeOptions = new ChromeOptions();
        //System.setProperty("web driver.chrome.driver", "src/main/resources/drivers/chromedriver");

        chromeOptions.addArguments("--disable-notifications");
        WebDriver driver;
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
