package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {
    public static WebDriver driver;
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Edge Driver Setup
        /*WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();*/

        /* WebDriverManager.operadriver().setup();
        driver = new OperaDriver(); */

       driver.manage().window().maximize();
    }

    public void closeBrowser()
    {
        driver.quit();
    }
}
