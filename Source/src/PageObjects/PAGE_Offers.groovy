package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import java.util.concurrent.TimeUnit

class PAGE_Offers {
    WebDriver driver
    @Before
    public void driverCreation()
    {
        driver=DriverCreation.getChromeDriver()
        driver.get(Constants.url)
        driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.MINUTES)
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
        driver.manage().window().maximize()
    }
    @Test
    public void blog()
    {
        WebElement offers=driver.findElement(By.partialLinkText(Constants.home_offers_linktext))
        offers.click()
        sleep(6000)

        WebElement offersName=driver.findElement(By.name(Constants.offers_name_name))
        offersName.sendKeys("lunch")

        WebElement fromDate=driver.findElement(By.name(Constants.offers_from_name))
        fromDate.sendKeys("17/07/2016")

        WebElement toDate=driver.findElement(By.name(Constants.offers_to_name))
        toDate.sendKeys("28/07/2016")

        WebElement button=driver.findElement(By.cssSelector("button[class='$Constants.offers_button_class']"))
        button.sendKeys("28/07/2016")

        driver.findElement(By.cssSelector("button[class='$Constants.offers_button_class'")).click()
        sleep(6000)
    }
    @After
    public void exit()
    {
        driver.close()
    }

}
