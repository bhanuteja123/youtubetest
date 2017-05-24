package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by bhanu_000 on 18-05-2017.
 */
public class test {

    @Test
    public static void main() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=gwt+tree&oq=gwt&aqs=chrome.0.69i59j69i57j69i60j0l2j69i60.970j0j7&sourceid=chrome&ie=UTF-8#q=gwt+");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        System.out.println("fffffffff");
        Actions ac= new Actions(driver);
        WebElement we=driver.findElement(By.xpath("//div[3]/div/div[3]/div/div/h3/a"));
        ac.moveToElement(we).click().build().perform();
    }
    @AfterTest
    void t(){
        System.out.println("ddddddd");
    }
}
