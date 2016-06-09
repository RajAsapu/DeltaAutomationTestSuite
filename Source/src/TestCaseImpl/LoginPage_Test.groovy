package TestCaseImpl

import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

/**
 * Created by Rocky on 6/9/2016.
 */
class LoginPage_Test {
    WebDriver driver=null;

    @Before
    public void browserSetup()
    {
        driver=DriverCreation.getChromeDriver()
    }
    @Test
    public void login()
    {
        driver.get(Constants.url)
        driver.findElement(By.id("usernm")).sendKeys("Venkat")
        driver.findElement(By.id("pwd")).sendKeys("SunilBro")
        driver.findElement(By.id("submit1")).click()
    }
    @After
    public void postExecution()
    {
        driver.close()
    }
}
