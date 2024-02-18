package pages;

import driver.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ChromeDriver {


    public void navigateHomePage() {
       ChromeDriver driver = new ChromeDriver();
        driver.initialize();
        driver.navigate("https://useinsider.com/");
    }


    /*@FindBy(css = "[class=navbar-nav]")
    public List<WebElement> homePageCategories;


    public void clickHomePageCategory(String categoryName) {
        for (WebElement category : homePageCategories) {
            if (category.getText().equalsIgnoreCase(categoryName)) {
                category.click();
                return;
            }
        }
        Assert.fail("No category name found");
    } */

    @FindBy(css = "[class=navbar-nav]:nth-child(1)")
    public WebElement company;

    @FindBy(css = "[class=\"new-menu-dropdown-layout-6-mid-container\"]")
    public WebElement careerButton;


    @FindBy(id = "[id=\"wrap-close-button-1454703513202\"]")
    public WebElement popupClose;
    

    @FindBy(id = "[id=\"wt-cli-accept-all-btn\"]")
    public WebElement acceptCookies;


    /*public void clickPageElement(WebElement element){

        if (element != null) {
            element.click();
        } else {
            System.out.println("Element not found");
        }

    }*/

    public void click(WebElement element) {element.click();}


    public void waitFor(double seconds) {
        try {Thread.sleep((long) (seconds*1000));}
        catch (InterruptedException ignored){}
    }
    

}

