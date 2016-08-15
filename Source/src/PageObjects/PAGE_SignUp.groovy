package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.bouncycastle.crypto.prng.RandomGenerator
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.apache.commons.lang3.RandomStringUtils

import java.security.SecureRandomSpi
import java.sql.Driver
import java.util.concurrent.TimeUnit

/**
 * Created by Rocky on 6/15/2016.
 */
class PAGE_SignUp extends PAGE_Base {
    @Test
    public void signup()
    {
        Thread.sleep(3000)
        Actions action=new Actions(driver)
        action.moveToElement(driver.findElement(By.className(Constants.home_myaccount_class))).click().perform()
        Thread.sleep(2000)
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
        String random= RandomStringUtils.randomAlphabetic(5)
        /*
          Saving the latest created email id
         */
        String emailId="rjsekhar008$random@yahoo.com"
        FileWriter writef=new FileWriter(new File("saveEmail.txt"))
        writef.write(emailId)
        writef.close()

        driver.findElement(By.name(Constants.signup_email_name)).sendKeys(emailId)
        driver.findElement(By.name(Constants.signup_password_name)).sendKeys("git@123")
        driver.findElement(By.name(Constants.signup_confirmpassword_name)).sendKeys("git@123")
        driver.findElement(By.cssSelector("button[class='"+Constants.signup_button_class+"']")).click()
        Thread.sleep(3000)
    }
}
