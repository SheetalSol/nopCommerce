package stepDefinitions;

import PageObjects.HomePage;
import PageObjects.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.BaseClass;

public class Register  extends BaseClass {
    HomePage homePage = new HomePage(driver);
    RegisterPage registerPage = new RegisterPage(driver);

    @When("I click on the register link on the homepage")
    public void i_click_on_the_register_link_on_the_homepage() {
        homePage.clickRegisterLink();

    }
    @Then("I should be redirected to the register page")
    public void i_should_be_redirected_to_the_register_page() {
    }
    @When("I select gender {string}")
    public void i_select_gender(String gender) {
        registerPage.selectGender(gender);
    }

    @When("I enter FirstName {string}")
    public void i_enter_first_name(String firstName) {
        registerPage.enterFirstName(firstName);
    }

    @When("I enter LastName {string}")
    public void i_enter_last_name(String lastName) {
        registerPage.enterLastName(lastName);
    }

    @When("I select Birthday {string} from DropDownList")
    public void i_select_birthday_from_drop_down_list(String birthDay) {
        registerPage.selectBirthDay(birthDay);
    }

    @When("I select BirthMonth {string} from DropDownList")
    public void i_select_birth_month_from_drop_down_list(String birthMonth) {
        registerPage.selectBirthMonth(birthMonth);
    }


    @When("I select BirthYear {string} from DropDownList")
    public void i_select_birth_year_from_drop_down_list(String birthYear) {
        registerPage.selectBirthYear(birthYear);
    }

    @When("When I enter Email {string}")
    public void when_i_enter_email(String email) {
        registerPage.enterEmail(email);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        registerPage.enterPassword(password);
    }

    @When("I enter ConfirmPassword {string}")
    public void i_enter_confirm_password(String confirmPassword) {
        registerPage.enterConfirmPassword(confirmPassword);
    }

    @When("Click on the Register button")
    public void click_on_the_register_button() {
        registerPage.clickRegisterButton();
    }

    @Then("I should be redirected to the Registerresult page")
    public void i_should_be_redirected_to_the_registerresult_page() {
        Assert.assertEquals("Your registration completed",registerPage.getRegistrationMessage());
    }

}
