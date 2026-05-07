package pageobjects;

import commons.BasePage;
import interfaces.pageuis.CustomerPageUI;
import org.openqa.selenium.WebDriver;

public class CustomerInfoPageObject extends BasePage {
    private final WebDriver driver;

    public CustomerInfoPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isGenderMaleSelected() {
        waitForElementSelected(driver, CustomerPageUI.GENDER_MALE_RADIO);
        return isElementSelected(driver, CustomerPageUI.GENDER_MALE_RADIO);
    }

    public String getFirstNameTextboxValue() {
        waitForElementVisible(driver, CustomerPageUI.FIRST_NAME_TEXTBOX);
        return getElementAttribute(driver, CustomerPageUI.FIRST_NAME_TEXTBOX, "value");
    }

    public String getLastNameTextboxValue() {
        waitForElementVisible(driver, CustomerPageUI.LAST_NAME_TEXTBOX);
        return getElementAttribute(driver, CustomerPageUI.LAST_NAME_TEXTBOX, "value");
    }

    public String getEmailTextboxValue() {
        waitForElementVisible(driver, CustomerPageUI.EMAIL_TEXTBOX);
        return getElementAttribute(driver, CustomerPageUI.EMAIL_TEXTBOX, "value");
    }

    public String getCompanyTextboxValue() {
        waitForElementVisible(driver, CustomerPageUI.COMPANY_TEXTBOX);
        return getElementAttribute(driver, CustomerPageUI.COMPANY_TEXTBOX, "value");
    }

    public String getDayDropdownSelectedValue() {
        waitForElementClickable(driver, CustomerPageUI.DAY_DROPDOWN);
        return getSelectedItemInDropdown(driver, CustomerPageUI.DAY_DROPDOWN);
    }

    public String getMonthDropdownSelectedValue() {
        waitForElementClickable(driver, CustomerPageUI.MONTH_DROPDOWN);
        return getSelectedItemInDropdown(driver, CustomerPageUI.MONTH_DROPDOWN);
    }

    public String getYearDropdownSelectedValue() {
        waitForElementClickable(driver, CustomerPageUI.YEAR_DROPDOWN);
        return getSelectedItemInDropdown(driver, CustomerPageUI.YEAR_DROPDOWN);
    }
}
