package PageObjects

import Setup.Constants
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

/**
 * Created by Rocky on 8/14/2016.
 */
class PAGE_Home extends PAGE_Base{
    @Test
    public void homePageTest() {

        WebElement homePage
        String text

        Actions act = new Actions(driver)
        WebElement []list=driver.findElements(By.tagName("a"));
        //Checking all the links on the home page
        for(int i=0;i<list.length;i++)
        {   text=list[i].getText()
           if(text.equals(" "))
                continue;
            println "Clicking on element list[$i]:$text->"+text.replaceAll(" ","*")
            act.click(list[i]).perform()
            Thread.sleep(1000)
            driver.navigate().refresh()
            homePage=driver.findElement(By.linkText(Constants.home_linkText))
            act.click(homePage).perform()
            Thread.sleep(2000)
            list=driver.findElements(By.tagName("a"));
        }
    }
}
