package pageobjects;

import commons.BasePage;
import interfaces.pageuis.HomePageUI;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {
    private final WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterPageObject clickToRegisterLink() {
        clickToElement(driver, HomePageUI.REGISTER_LINK);
        return new RegisterPageObject(driver);
    }

    public boolean isMyAccountLinkDisplayed() {
        waitForElementVisible(driver, HomePageUI.MY_ACCOUNT_LINK);
        return isElementDisplayed(driver, HomePageUI.MY_ACCOUNT_LINK);
    }

    public CustomerInfoPageObject clickToMyAccountLink() {
        clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
        return new CustomerInfoPageObject(driver);
    }

    public void selectLanguageDropdown(String language) {
        waitForElementVisible(driver, HomePageUI.LANGUAGE_DROPDOWN);
        selectItemInDropdown(driver, HomePageUI.LANGUAGE_DROPDOWN, language);
    }
}
