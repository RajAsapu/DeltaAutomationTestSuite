package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import java.sql.Driver

/**
 * Created by Rocky on 6/15/2016.
 */
class PAGE_SignUp {
    WebDriver driver
    @Before
    public void driverCreation()
    {
        driver=DriverCreation.getChromeDriver()
        driver.get(Constants.url)
    }
    @Test
    public void signup()
    {
        Thread.sleep(3000)
        //WebElement myaccount=driver.findElement(By.partialLinkText(Constants.home_myaccount_linktext))

        Actions action=new Actions(driver)
        action.moveToElement(driver.findElement(By.className(Constants.home_myaccount_class))).click().perform()
        Thread.sleep(1000)
        action.moveToElement(driver.findElement(By.partialLinkText(Constants.home_myaccount_signup_linktext))).click().perform()
        /*
         Details are entered for the registration
         */
        Thread.sleep(3000)
        driver.findElement(By.name(Constants.signup_firstname_name)).sendKeys("Raj")
        driver.findElement(By.name(Constants.signup_lastname_name)).sendKeys("Asapu")
        driver.findElement(By.name(Constants.signup_phone_name)).sendKeys("9885779603")
        /*
         Implement random number
         */
        driver.findElement(By.name(Constants.signup_email_name)).sendKeys("rjsekhar008@yahoo.com")
        driver.findElement(By.name(Constants.signup_password_name)).sendKeys("git@123")
        driver.findElement(By.name(Constants.signup_confirmpassword_name)).sendKeys("git@123")
        driver.findElement(By.cssSelector("button[class='"+Constants.signup_button_class+"']")).click()
        Thread.sleep(3000)
    }
    @After
    public void exit()
    {
        driver.close()
    }

}
