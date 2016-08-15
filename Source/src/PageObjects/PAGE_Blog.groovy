package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Action
import org.openqa.selenium.interactions.Actions

import java.util.concurrent.TimeUnit

class PAGE_Blog extends PAGE_Base {

    @Test
    public void blog()
    {
        WebElement blog=driver.findElement(By.partialLinkText(Constants.home_blog_linktext))
        blog.click()
        sleep(6000)

        WebElement searchField=driver.findElement(By.name(Constants.blog_search_name))
        searchField.sendKeys("beach")
        driver.findElement(By.cssSelector("button[class='$Constants.blog_search_button_class'")).click()
    }
}
