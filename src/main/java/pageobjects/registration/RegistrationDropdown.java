package pageobjects.registration;

import org.openqa.selenium.By;

public enum RegistrationDropdown implements RegistrationInput {
    REGION_STATE_DROPDOWN(By.id("AccountFrm_zone_id")),
    COUNTRY_DROPDOWN(By.id("AccountFrm_country_id"));


    private final By locator;


    RegistrationDropdown(By locator) {
        this.locator = locator;
    }


    @Override
    public By getLocator() {
        return locator;
    }
}
