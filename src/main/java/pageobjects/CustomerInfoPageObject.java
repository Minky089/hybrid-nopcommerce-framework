package pageobjects;

import commons.BasePage;
import interfaces.pageuis.CustomerPageUI;
import org.openqa.selenium.WebDriver;

public class CustomerInfoPageObject extends BasePage {
    private final WebDriver driver;

    public CustomerInfoPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isGenderMaleSelected() {
        waitForElementSelected(CustomerPageUI.GENDER_MALE_RADIO);
        return isElementSelected(CustomerPageUI.GENDER_MALE_RADIO);
    }

    public String getFirstNameTextboxValue() {
        waitForElementVisible(CustomerPageUI.FIRST_NAME_TEXTBOX);
        return getElementAttribute(CustomerPageUI.FIRST_NAME_TEXTBOX, "value");
    }

    public String getLastNameTextboxValue() {
        waitForElementVisible(CustomerPageUI.LAST_NAME_TEXTBOX);
        return getElementAttribute(CustomerPageUI.LAST_NAME_TEXTBOX, "value");
    }

    public String getEmailTextboxValue() {
        waitForElementVisible(CustomerPageUI.EMAIL_TEXTBOX);
        return getElementAttribute(CustomerPageUI.EMAIL_TEXTBOX, "value");
    }

    public String getCompanyTextboxValue() {
        waitForElementVisible(CustomerPageUI.COMPANY_TEXTBOX);
        return getElementAttribute(CustomerPageUI.COMPANY_TEXTBOX, "value");
    }

    public String getDayDropdownSelectedValue() {
        waitForElementClickable(CustomerPageUI.DAY_DROPDOWN);
        return getSelectedItemInDropdown(CustomerPageUI.DAY_DROPDOWN);
    }

    public String getMonthDropdownSelectedValue() {
        waitForElementClickable(CustomerPageUI.MONTH_DROPDOWN);
        return getSelectedItemInDropdown(CustomerPageUI.MONTH_DROPDOWN);
    }

    public String getYearDropdownSelectedValue() {
        waitForElementClickable(CustomerPageUI.YEAR_DROPDOWN);
        return getSelectedItemInDropdown(CustomerPageUI.YEAR_DROPDOWN);
    }
}
