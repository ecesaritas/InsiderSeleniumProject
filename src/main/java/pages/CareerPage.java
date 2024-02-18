package pages;

import driver.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class CareerPage extends ChromeDriver {



    @FindBy(css = "[class=\"glide__slides\"]")
    public WebElement locationSection;


    @FindBy(css = "[id=\"career-find-our-calling\"]")
    public WebElement teamsSection;


    @FindBy(css = "[class=\"elementor-swiper\"]")
    public WebElement lifeAtInsiderSection;


    @FindBy(css = "[class*=\"btn btn-outline-secondary\"]")
    public WebElement seeAllTeamsButton;


    @FindBy(css = "[href=\"https://useinsider.com/careers/quality-assurance/\"] [class=\"img-fluid mx-auto\"]")
    public WebElement qaJobsButton;


    public void isVisible (WebElement element){

        driver.findElement(By.id("element")).isDisplayed();

    }

    public void clickElement (WebElement element)
    {
        driver.findElement(By.id("element")).click();
    }


}
