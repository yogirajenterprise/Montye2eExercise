package Montye2eExercise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * this is browser selector class according to instruction given from .properties file
 */
public class BrowserSelector extends BasePage {

    LoadProp loadProp = new LoadProp();

    public void selectBrowser()
    {
        String browser = loadProp.getProperty("browser");

        if (browser.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();

        } else if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("IE"))
        {
            System.setProperty("webdriver.ie.driver","src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Your Browser name is wrong");
        }
    }
}
