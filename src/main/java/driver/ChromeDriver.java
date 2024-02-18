package driver;

import org.openqa.selenium.WebDriver;


public class ChromeDriver {
    public static WebDriver driver;

    public void initialize(){
        driver = ChromeDriverFactory.getDriver("chrome");
    }

    public void terminate(){driver.quit();}

    public void navigate(String url){
        driver.get(url);
    }
}
