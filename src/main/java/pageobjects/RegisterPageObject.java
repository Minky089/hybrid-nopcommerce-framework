package pageobjects;

import commons.BasePage;
import interfaces.pageuis.HomePageUI;
import interfaces.pageuis.RegisterPageUI;
import org.openqa.selenium.WebDriver;

public class RegisterPageObject extends BasePage {
    private final WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickToMaleRadio() {
        clickToElement(RegisterPageUI.GENDER_MALE_RADIO);
    }

    public void enterToFirstNameTextbox(String firstName) {
        sendkeyToElement(RegisterPageUI.FIRST_NAME_TEXTBOX, firstName);
    }

    public void enterToLastNameTextbox(String lastName) {
        sendkeyToElement(RegisterPageUI.LAST_NAME_TEXTBOX, lastName);
    }

    public void selectDayDropdown(String year) {
        selectItemInDropdown(RegisterPageUI.DAY_DROPDOWN, year);
    }

    public void selectMonthDropdown(String month) {
        selectItemInDropdown(RegisterPageUI.MONTH_DROPDOWN, month);
    }

    public void selectYearDropdown(String year) {
        selectItemInDropdown(RegisterPageUI.YEAR_DROPDOWN, year);
    }

    public void enterToEmailTextbox(String email) {
        sendkeyToElement(RegisterPageUI.EMAIL_TEXTBOX, email);
    }

    public void enterToPasswordTextbox(String password) {
        sendkeyToElement(RegisterPageUI.PASSWORD_TEXTBOX, password);
    }

    public void enterToConfirmPasswordTextbox(String password) {
        sendkeyToElement(RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, password);
    }

    public void enterToCompanyTextbox(String company) {
        sendkeyToElement(RegisterPageUI.COMPANY_TEXTBOX, company);
    }

    public void clickToRegisterButton() {
        clickToElement(RegisterPageUI.REGISTER_BUTTON);
    }

    public String getRegisterSuccessMessage() {
        return getElementText(RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
    }

    public LoginPageObject clickToLoginButton() {
        clickToElement(RegisterPageUI.LOGIN_LINK);
        return new LoginPageObject(driver);
    }

    public CustomerInfoPageObject clickToMyAccountLink() {
        clickToElement(HomePageUI.MY_ACCOUNT_LINK);
        return new CustomerInfoPageObject(driver);
    }
}
