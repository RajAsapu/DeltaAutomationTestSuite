package Setup

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.RemoteWebDriver

/**
 * Created by Rocky on 6/8/2016.
 */

class DriverCreation {
    public static WebDriver getChromeDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rocky\\Downloads\\chromedriver_win32\\chromedriver.exe")
        WebDriver driver=new ChromeDriver(ConfigureCapabilities.getChromeOptions())
        return driver
    }
    public static WebDriver getEdgeDriver()
    {
        System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
        WebDriver driver=new EdgeDriver()
        return driver
    }
    public static WebDriver getFireFoxDriver() {
        WebDriver driver = new FirefoxDriver()
        return driver
    }
}
