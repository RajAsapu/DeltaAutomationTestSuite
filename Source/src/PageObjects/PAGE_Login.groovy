package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.apache.commons.lang3.RandomStringUtils
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions

import java.util.concurrent.TimeUnit

/**
 * Created by Rocky on 6/20/2016.
 */
class PAGE_Login {
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
    public void login()
    {
        Thread.sleep(3000)
        Actions action=new Actions(driver)
        action.moveToElement(driver.findElement(By.className(Constants.home_myaccount_class))).click().perform()
        Thread.sleep(2000)
        action.moveToElement(driver.findElement(By.partialLinkText(Constants.home_myaccount_login_linktext))).click().perform()

        /*
          Read Credentials from file
         */
        FileReader readf=new FileReader(new File("saveEmail.txt"))
        String emailId= readf.readLine()
        readf.close()

        /*
         Details are entered to login
         */
        Thread.sleep(3000)
        driver.findElement(By.name(Constants.login_email_name)).sendKeys(emailId)
        driver.findElement(By.name(Constants.login_password_name)).sendKeys("git@123")
        driver.findElement(By.cssSelector("button[class='"+Constants.login_login_class+"']")).click()
        Thread.sleep(3000)
    }
    @After
    public void exit()
    {
        driver.close()
    }

}
