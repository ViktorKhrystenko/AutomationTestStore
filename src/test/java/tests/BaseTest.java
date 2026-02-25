package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import testnglisteners.ScreenshotListener;

@Listeners(ScreenshotListener.class)
public class BaseTest {
    private WebDriver driver;


    public WebDriver getDriver() {
        return driver;
    }
}
