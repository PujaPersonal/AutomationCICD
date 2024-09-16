package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){             //Created Constructor and passed parameter as driver

        this.driver = driver;
        PageFactory.initElements(driver,this);   //Initializing pageFactory with driver parameter so that all annotations of Page factory(@FindBy) should work with help of driver.
    }
}
