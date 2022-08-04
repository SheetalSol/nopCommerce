package stepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.BaseClass;

public class Login extends BaseClass {

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @When("I click on the Login link")
    public void i_click_on_the_login_link() {
        homePage.clickLoginLink();

    }

    @Then("I should be redirected to the login page")
    public void i_should_be_redirected_to_the_login_page() {
        Assert.assertTrue(loginPage.GetLoginPageHeader().contains("Welcome, Please Sign In!"));
    }

    @When("I enter valid email {string}")
    public void i_enter_valid_email(String email) {
        loginPage.enterEmail(email);
    }

    @When("I enter valid password {string}")
    public void i_enter_valid_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("click on the register button")
    public void click_on_the_register_button() {
        loginPage.clickLoginButton();
    }
    @Then("I should be redirected to the account page")
    public void i_should_be_redirected_to_the_account_page()
    {
        Assert.assertTrue(loginPage.IsLogOutLinkDisplayed());
    }
}
