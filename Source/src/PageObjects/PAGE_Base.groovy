package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.openqa.selenium.WebDriver

import java.util.concurrent.TimeUnit

/**
 * Created by Rocky on 8/14/2016.
 */
class PAGE_Base {
    WebDriver driver=null
    @Before
    public void driverCreation()
    {
        driver=DriverCreation.getChromeDriver()
        driver.get(Constants.url)
        driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.MINUTES)
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
        driver.manage().window().maximize()
    }

    @After
    public void exit()
    {
        driver.close()
    }
}
