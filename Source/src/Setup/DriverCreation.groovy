package Setup //folder name

//
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

/**
 * Created by Rocky on 6/8/2016.
 */
class DriverCreation {
    public static WebDriver getChromeDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rocky\\Downloads\\chromedriver_win32\\chromedriver.exe")
        WebDriver driver=new ChromeDriver()
        return driver
    }
}
