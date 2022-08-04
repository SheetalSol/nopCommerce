package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Log out")
    public WebElement lnkLogout;

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    public WebElement loginPageHeader;

    @FindBy(id="Email")
    public WebElement txtEmail;

    @FindBy(id ="Password")
    public WebElement txtPassword;

    @FindBy(className = "login-button")
    public WebElement btnLogin;

    public void enterEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    public void enterPassword(String password)
    {
        txtPassword.sendKeys(password);
    }
    public void clickLoginButton()
    {
        btnLogin.click();
    }
    public String GetLoginPageHeader()
    {
        return loginPageHeader.getText();
    }
    public boolean IsLogOutLinkDisplayed()
    {
        return lnkLogout.isDisplayed();
    }


}
