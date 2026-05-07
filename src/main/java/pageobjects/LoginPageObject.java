package pageobjects;

import commons.BasePage;
import interfaces.pageuis.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePage {
    private final WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public HomePageObject clickToLoginButton() {
        clickToElement(LoginPageUI.LOGIN_BUTTON);
        return new HomePageObject(driver);
    }

    public void enterToEmailTextbox(String email) {
        sendkeyToElement(LoginPageUI.EMAIL_TEXTBOX, email);
    }

    public void enterToPasswordTextbox(String password) {
        sendkeyToElement(LoginPageUI.PASSWORD_TEXTBOX, password);
    }
}
