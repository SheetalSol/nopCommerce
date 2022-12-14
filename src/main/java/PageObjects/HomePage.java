package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

import java.util.List;

public class HomePage
{
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Log in")
    public WebElement lnkLogin;

    @FindBy(id="small-searchterms")
    public WebElement searchTextBox;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement btnSearch;

    @FindBy(className = "product-title")
    public List<WebElement> searchResult;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    public WebElement linkRegister;

    public void enterSearchTerm(String searchTerm)
    {
      searchTextBox.sendKeys(searchTerm);
    }
    public void clickSearchButton()
    {
        btnSearch.click();
    }
    public List<WebElement> getSearchResult()
    {
        return searchResult;
    }
    public void clickRegisterLink()
    {
        linkRegister.click();
    }
    public void clickLoginLink()
    {
        lnkLogin.click();
    }



}
