package webDriverArchitechture;

import webDriverArchitechture.WebDriverAPI.WebDriver;
import webDriverArchitechture.chromeDriver.ChromeDriver;
import webDriverArchitechture.firefoxDriver.FirefoxDriver;
import webDriverArchitechture.ieDriver.IEDriver;

public class Test {

    static String url = "http://gmail.com";
    static String browser="firefox"; // Coming from external source (Excel, DB, etc)
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equals("chrome")){
            ChromeDriver driver = new ChromeDriver();
        } else if (browser.equals("firefox")){
            FirefoxDriver driver = new FirefoxDriver();
        } else if (browser.equals("ie")){
            IEDriver driver = new IEDriver();
        }

        driver.get(url);
        driver.getTitle();
        driver.click();
        driver.close();
    }



}
