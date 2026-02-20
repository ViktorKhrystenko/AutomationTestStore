package pageobjects.home;

import org.openqa.selenium.WebDriver;
import pageobjects.BasePage;

import static constants.BaseUrls.HOME_BASE_URL;

public class HomePage extends BasePage {
    private static final String BASE_URL = HOME_BASE_URL;
    private static final String PAGE_NAME = "Home page";


    public HomePage(WebDriver driver) {
        super(driver);
        checkLocation(BASE_URL, PAGE_NAME);
    }
}
