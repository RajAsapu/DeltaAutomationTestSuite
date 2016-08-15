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
        WebElement myAcc=driver.findElement(By.linkText("My Account"))
//        Thread.sleep(3000)
        Actions act=new Actions(driver)
        act.click(myAcc).perform()
        Thread.sleep(3000)
//        List<WebElement> list=driver.findElements(By.tagName("a"));
//
//        for(WebElement e:list)
//        {
//            println "Text:"+e.getText().replaceAll(" ","*")
//        }

//        WebElement blog=driver.findElement(By.partialLinkText(Constants.home_blog_linktext))
//        blog.click()
//        sleep(6000)
//
//        WebElement searchField=driver.findElement(By.name(Constants.blog_search_name))
//        searchField.sendKeys("beach")
//        driver.findElement(By.cssSelector("button[class='$Constants.blog_search_button_class'")).click()
    }
}
