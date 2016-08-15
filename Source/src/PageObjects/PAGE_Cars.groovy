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

class PAGE_Cars extends PAGE_Base{

    @Test
    public void blog()
    {
        WebElement cars=driver.findElement(By.partialLinkText(Constants.home_cars_linktext))
        cars.click()
        sleep(6000)

        WebElement pickup=driver.findElement(By.xpath(Constants.cars_pickup_xpath))
        pickup.click()

        WebElement pickup_text=driver.findElement(By.className(Constants.cars_pickup_text_class))
        pickup_text.sendKeys("Dubai")
        pickup_text.submit()

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
}
