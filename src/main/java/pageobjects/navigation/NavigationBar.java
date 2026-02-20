package pageobjects.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BasePage;
import pageobjects.login.LoginPage;

public class NavigationBar extends BasePage {
    @FindBy(xpath = "//*[@id='customernav']//a[contains(@href, 'account/login')]")
    private WebElement loginOrRegisterLink;


    public NavigationBar(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public LoginPage clickOnLoginOrRegisterLink() {
        loginOrRegisterLink.click();
        waitUntilPageIsLoaded();
        return new LoginPage(driver);
    }
}
