package stepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

import java.util.List;

public class Search extends BaseClass {

    HomePage homePage = new HomePage(driver);
    @Given("I am on the homepage {string}")
    public void i_am_on_the_homepage(String url) {
        driver.navigate().to(url);
    }

    @When("I enter seacrhterm in search textbox")
    public void i_enter_seacrhterm_in_search_textbox() {
        homePage.enterSearchTerm("laptop");
    }

    @When("click on the search button")
    public void click_on_the_search_button() {
        homePage.clickSearchButton();
    }

    @Then("I should be see relavant result on the search page")
    public void i_should_be_see_relavant_result_on_the_search_page() {
    List<WebElement> result = homePage.getSearchResult();
    for(WebElement e : result)
    {
        System.out.println("Item name : "+ e.getText());
        Assert.assertTrue(e.getText().contains("Laptop"));

    }
    }

}
