package steps;

import driver.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.CareerPage;

public class CareerPageSteps extends CareerPage {

    String expectedUrl = "https://useinsider.com/careers/";

    @Test
    public void verifyCurrentScreen ()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.initialize();
        Assert.assertEquals("https://useinsider.com/careers/", expectedUrl);
    }

    @Test
    public void isCareerSectionVisible (WebElement element){
        isVisible(locationSection);
    }

    @Test
    public void isTeamsSectionVisible (WebElement element){
        isVisible(teamsSection);
    }

    @Test
    public void isLifeAtInsiderSectionVisible (WebElement element){
        isVisible(lifeAtInsiderSection);
    }

    @Test
    public void clickSeeAllTeams (WebElement element){
        clickElement(seeAllTeamsButton);
    }

    @Test
    public void clickQaOpenPositions (WebElement element){
        clickElement(qaJobsButton);
    }


}
