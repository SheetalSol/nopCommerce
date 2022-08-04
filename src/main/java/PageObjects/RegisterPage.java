package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

public class RegisterPage extends BaseClass {
    public RegisterPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id ="gender-male")
    public WebElement genderMale;

    @FindBy(id="gender-female")
    public WebElement genderFemale;

    @FindBy(id="FirstName")
    public WebElement txtFirstName;

    @FindBy(id="LastName")
    public WebElement txtLastName;

    @FindBy(name = "DateOfBirthDay")
    public WebElement txtDateOfBirthDay;

    @FindBy(name ="DateOfBirthMonth")
    public WebElement txtDateOfBirthMonth;

    @FindBy(name = "DateOfBirthYear")
    public WebElement txtDateOfBirthYear;

    @FindBy(id="Email")
    public WebElement txtEmail;

    @FindBy(id ="Password")
    public WebElement txtPassword;

    @FindBy(id ="ConfirmPassword")
    public WebElement txtConfirmPassword;

    @FindBy(id="register-button")
    public WebElement registerButton;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    public WebElement registrationMessage;

    public void selectGender(String gender)
    {
        if (gender == "Male" || gender == "male" || gender =="M"){
            genderMale.click();
        }
        else
            genderFemale.click();
    }
    public void enterFirstName(String firstName){
        txtFirstName.sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        txtLastName.sendKeys(lastName);
    }
    public void selectBirthDay(String day){
        Select birthdays = new Select(txtDateOfBirthDay);
        birthdays.selectByValue(day);
    }
    public void selectBirthMonth(String month){
        Select birthMonth = new Select(txtDateOfBirthMonth);
        birthMonth.selectByVisibleText(month);
    }
    public void selectBirthYear(String year){
        Select birthYear = new Select(txtDateOfBirthYear);
        birthYear.selectByValue(year);
    }
    public void enterEmail(String email){
        txtEmail.sendKeys(email);
    }
    public void enterPassword(String password){
        txtPassword.sendKeys(password);
    }
    public void enterConfirmPassword(String confirmPassword){
        txtConfirmPassword.sendKeys(confirmPassword);

    }
    public void clickRegisterButton()
    {
        registerButton.click();
    }
    public String getRegistrationMessage()
    {
        return registrationMessage.getText();
    }
}
