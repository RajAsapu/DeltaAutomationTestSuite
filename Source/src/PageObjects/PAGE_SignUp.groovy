package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

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
        driver.findElement(By.partialLinkText(Constants.home_myaccount_linktext)).click()
        driver.findElement(By.partialLinkText(Constants.home_myaccount_signup_linktext)).click()
        /*
         Details are entered for the registration
         */
        driver.findElement(By.name(Constants.signup_firstname_name)).sendKeys("Raj")
        driver.findElement(By.name(Constants.signup_lastname_name)).sendKeys("Asapu")
        driver.findElement(By.name(Constants.signup_phone_name)).sendKeys("9885779603")
        driver.findElement(By.name(Constants.signup_email_name)).sendKeys("rjsekhar007@yahoo.com")
        driver.findElement(By.name(Constants.signup_password_name)).sendKeys("git@123")
        driver.findElement(By.name(Constants.signup_confirmpassword_name)).sendKeys("git@123")
        driver.findElement(By.className(Constants.signup_button_class)).click()
    }
    @After
    public void exit()
    {
        driver.close()
    }

}
