package workWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Elements {

    static WebDriver driver;
    static String url = "http://wikipedia.org";

    public static void main(String[] args) {
//        setLang();
//        getAllLinks();
        getAllLinksFooter();
    }

    public static void setLang(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.findElement(By.id("searchLanguage")).sendKeys("English");
        Select dropdown = new Select(driver.findElement(By.id("searchLanguage")));
        List<WebElement> dropdownList = dropdown.getOptions();
        System.out.println(dropdownList.size());
        dropdown.selectByValue("ar");
//        System.out.println("Element Found");
    }

    public static void getAllLinks(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> linkList = driver.findElements(By.tagName("a"));

        int size = linkList.size();
        for (int i=0; i<size; i++){
            System.out.println(linkList.get(i).getText());
            System.out.println(linkList.get(i).getAttribute("href")+"\n");
        }

    }

    public static void getAllLinksFooter(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class=\"footer\"]//a"));

        System.out.println("Number of footer links: "+footerLinks.size());

        for (WebElement w:footerLinks){
            System.out.println(w.getText());
            System.out.println(w.getAttribute("href"));
        }

    }
}