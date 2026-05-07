package nopcommerce.users;

import commons.BaseTest;
import commons.constant.Browsers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageobjects.CustomerInfoPageObject;
import pageobjects.HomePageObject;
import pageobjects.RegisterPageObject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UserRegistrationTest extends BaseTest {
    private HomePageObject homePage;
    private RegisterPageObject registerPage;
    private WebDriver driver;
    private String firstName, lastName, emailAddress, password, companyName;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(@Optional("CHROME") String browserName) {
        driver = getDriverBrowser(browserName);
        homePage = new HomePageObject(driver);
        homePage.selectLanguageDropdown("EN");

        firstName = "John";
        lastName = "Philip";
        emailAddress = "john" + generateRandomNumber() + "@gmail.de";
        companyName = "Continental";
        password = "12345678";
    }

    @Parameters
    @Test
    public void User_01_Register() {
        registerPage = homePage.clickToRegisterLink();

        registerPage.clickToMaleRadio();
        registerPage.enterToFirstNameTextbox(firstName);
        registerPage.enterToLastNameTextbox(lastName);
        registerPage.enterToEmailTextbox(emailAddress);
        registerPage.enterToPasswordTextbox(password);
        registerPage.enterToConfirmPasswordTextbox(password);
        registerPage.enterToCompanyTextbox(companyName);
        registerPage.clickToRegisterButton();

        assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
    }

    @Test
    public void User_02_MyAccount() {
        CustomerInfoPageObject customerInfoPage = registerPage.clickToMyAccountLink();

        assertTrue(customerInfoPage.isGenderMaleSelected());

        assertEquals(customerInfoPage.getFirstNameTextboxValue(), firstName);
        assertEquals(customerInfoPage.getLastNameTextboxValue(), lastName);
        assertEquals(customerInfoPage.getEmailTextboxValue(), emailAddress);
        assertEquals(customerInfoPage.getCompanyTextboxValue(), companyName);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
