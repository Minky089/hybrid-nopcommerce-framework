package pageobjects;

import commons.BasePage;
import interfaces.pageuis.HomePageUI;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {
private final WebDriver driver;

    public HomePageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public RegisterPageObject clickToRegisterLink() {
        clickToElement(HomePageUI.REGISTER_LINK);
        return new RegisterPageObject(driver);
    }

    public boolean isMyAccountLinkDisplayed() {
        waitForElementVisible(HomePageUI.MY_ACCOUNT_LINK);
        return isElementDisplayed(HomePageUI.MY_ACCOUNT_LINK);
    }

    public CustomerInfoPageObject clickToMyAccountLink() {
        clickToElement(HomePageUI.MY_ACCOUNT_LINK);
        return new CustomerInfoPageObject(driver);
    }

    public void selectLanguageDropdown(String language) {
        waitForElementVisible(HomePageUI.LANGUAGE_DROPDOWN);
        selectItemInDropdown(HomePageUI.LANGUAGE_DROPDOWN, language);
    }
}
