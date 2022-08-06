
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BaseClass;

public class Hooks {
    BaseClass baseClass = new BaseClass();


    @Before
    public void browserSetUp()
    {
        baseClass.openBrowser();
    }

    @After
    public void browserTearDown()
    {
      baseClass.closeBrowser();
    }
}
