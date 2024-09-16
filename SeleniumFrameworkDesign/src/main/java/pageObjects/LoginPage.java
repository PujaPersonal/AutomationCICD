package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){                    //Created Constructor and passed parameter as driver

        super(driver);
    }

    @FindBy(id="userEmail")
    WebElement userEmailVar;

    @FindBy(id="userPassword")
    WebElement userPasswordVar;

    @FindBy(id="login")
    WebElement submitVar;


    public void loginApplication(String email, String password)
    {
        userEmailVar.sendKeys(email);
        userPasswordVar.sendKeys(password);
        submitVar.click();
    }

    public void goTo()
    {
        driver.get("https://rahulshettyacademy.com/client");
    }
}
