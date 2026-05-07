package pageobjects;

import commons.BasePage;
import interfaces.pageuis.HomePageUI;
import interfaces.pageuis.RegisterPageUI;
import org.openqa.selenium.WebDriver;

public class RegisterPageObject extends BasePage {
    private final WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToMaleRadio() {
        clickToElement(driver, RegisterPageUI.GENDER_MALE_RADIO);
    }

    public void enterToFirstNameTextbox(String firstName) {
        sendkeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXTBOX, firstName);
    }

    public void enterToLastNameTextbox(String lastName) {
        sendkeyToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX, lastName);
    }

    public void selectDayDropdown(String year) {
        selectItemInDropdown(driver, RegisterPageUI.DAY_DROPDOWN, year);
    }

    public void selectMonthDropdown(String month) {
        selectItemInDropdown(driver, RegisterPageUI.MONTH_DROPDOWN, month);
    }

    public void selectYearDropdown(String year) {
        selectItemInDropdown(driver, RegisterPageUI.YEAR_DROPDOWN, year);
    }

    public void enterToEmailTextbox(String email) {
        sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
    }

    public void enterToPasswordTextbox(String password) {
        sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
    }

    public void enterToConfirmPasswordTextbox(String password) {
        sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, password);
    }

    public void enterToCompanyTextbox(String company) {
        sendkeyToElement(driver, RegisterPageUI.COMPANY_TEXTBOX, company);
    }

    public void clickToRegisterButton() {
        clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
    }

    public String getRegisterSuccessMessage() {
        return getElementText(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
    }

    public LoginPageObject clickToLoginButton() {
        clickToElement(driver, RegisterPageUI.LOGIN_LINK);
        return new LoginPageObject(driver);
    }

    public CustomerInfoPageObject clickToMyAccountLink() {
        clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
        return new CustomerInfoPageObject(driver);
    }
}
