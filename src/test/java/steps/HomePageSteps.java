package steps;

import driver.ChromeDriver;

import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import javax.swing.text.Utilities;

public class HomePageSteps extends HomePage{

    HomePage openHomePage = new HomePage();

        @Test(groups = "first case")
        public void openHomePages(){
            openHomePage.navigateHomePage();
            openHomePage.waitFor(5);
            openHomePage.click(acceptCookies);
        }

        @Test(dependsOnGroups = "first case")
        public void selectCompany(){
            openHomePage.click(acceptCookies);
        }

        @Test
        public void selectCareer(){
            openHomePage.click(careerButton);
        }

        /*public void selectCompany(){
            String homePageMenuItem = "Company";
            openHomePage.clickHomePageCategory(homePageMenuItem);
        }*/

    }
