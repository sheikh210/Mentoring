package workWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Presence {

    /**
     * isSelected() - Related to input elements, such as checkboxes, options in a select, and radio buttons
     * isEnabled() - Is the element currently enabled? Returns boolean
     * isDisplayed() - Checks element VISIBILITY, not the PRESENCE. If an element is hidden (wrapped), this will return false
     *
     * TO CHECK PRESENCE OF AN ELEMENT, WE NEED TO CREATE OUR OWN METHOD
     */

    static WebDriver driver;
    static String url = "http://wikipedia.org";


    public static int howManyElements(By by){
        int size=driver.findElements(by).size();
        return size;
    }

    public static boolean isElementPresent (By by){
        int size = driver.findElements(by).size();
        if (size==0){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement dropdown = driver.findElement(By.id("searchLanguage"));

        WebDriverWait explicitWait = new WebDriverWait(driver,5);
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("SAMPLE_XPATH")));

        dropdown.sendKeys("Dansk");

//        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(2))
//                .withMessage("USER-DEFINED TIMED OUT AFTER 10 SECONDS")
//                .ignoring(NoSuchElementException.class);

        System.out.println(dropdown.isDisplayed());
        System.out.println(isElementPresent(By.id("searchLanguage")));
        System.out.println(howManyElements(By.tagName("a")));

    }




}
