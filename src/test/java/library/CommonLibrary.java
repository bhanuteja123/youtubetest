package library;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonLibrary {
    private static WebDriver driver;
    private static Properties pro_Noraml_page;
    private static FileOutputStream Os_Normal_page;
    private static File file_Normal_page;

    private static WebElement get_Web_Element(String locatorType, String locator) throws IOException {
        WebElement webElement = null;
        try {

            if (locatorType.equalsIgnoreCase("XPATH")) {

                webElement = driver.findElement(By.xpath(locator));

            } else if (locatorType.equalsIgnoreCase("ID")) {

                webElement = driver.findElement(By.id(locator));

            } else if (locatorType.equalsIgnoreCase("NAME")) {

                webElement = driver.findElement(By.name(locator));

            } else if (locatorType.equalsIgnoreCase("CSS")) {

                webElement = driver.findElement(By.cssSelector(locator));

            } else if (locatorType.equalsIgnoreCase("LINKTEXT")) {

                webElement = driver.findElement(By.linkText(locator));
            }

        } catch (NoSuchElementException e) {

            e.printStackTrace();

        }
        return webElement;
    }

    private static List<WebElement> GET_WEB_ELEMENTS(String locatorType, String locator) throws IOException {
        List<WebElement> webElement = null;
        try {

            if (locatorType.equalsIgnoreCase("XPATH")) {

                webElement = driver.findElements(By.xpath(locator));

            } else if (locatorType.equalsIgnoreCase("ID")) {

                webElement = driver.findElements(By.id(locator));

            } else if (locatorType.equalsIgnoreCase("NAME")) {

                webElement = driver.findElements(By.name(locator));

            } else if (locatorType.equalsIgnoreCase("CSS")) {

                webElement = driver.findElements(By.cssSelector(locator));

            } else if (locatorType.equalsIgnoreCase("LINKTEXT")) {

                webElement = driver.findElements(By.linkText(locator));
            }
        } catch (NoSuchElementException e) {

            e.printStackTrace();

        }
        return webElement;
    }

    private static void properties_all() throws IOException {
        File dic = new File("C:\\Users\\bhanu_000\\IdeaProjects\\Test\\src\\test\\UiConstants");
        String extension = ".properties";
        file_Normal_page = new File(dic + "\\Normal" + extension);
        FileInputStream fis_Normal_page = null;
        Os_Normal_page = null;
        try {
            fis_Normal_page = new FileInputStream(file_Normal_page);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pro_Noraml_page = new Properties();
        try {
            pro_Noraml_page.load(fis_Normal_page);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static void Send_value_to_Normal_properties(String Key_name, String value_object) throws IOException {
        properties_all();
        try {
            pro_Noraml_page.setProperty(Key_name, value_object);
            Os_Normal_page = new FileOutputStream(file_Normal_page);
            pro_Noraml_page.store(Os_Normal_page, null);
            System.out.println("Adding the Key name into the properties file = [" + Key_name + "], The Value of the key is = [" + value_object + "]");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (Os_Normal_page != null) {
                try {
                    Os_Normal_page.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    protected static String Get_properties_value(String value_name) throws IOException {
        properties_all();
        String value = null;
        try {
            value = pro_Noraml_page.getProperty(value_name);

        } catch (Exception e) {
            System.out.println(
                    "The element Cannot be found in properties file");
        }
        return value;
    }

    protected static void Browser_Launch(String browser) {
        try {
            properties_all();
            System.out.println("Opening the web page in: " + browser.toUpperCase());
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
                driver = new ChromeDriver();
                driver.get(Get_properties_value("Url_page"));
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.getProperty("webdriver.gecko.driver", "C://geckodriver.exe");
                driver = new FirefoxDriver();
                driver.get(Get_properties_value("Url_page"));
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            }
        } catch (Exception e) {
            System.out.println("Can't initiate the broswer: " + browser);
        }
    }

    protected static void sign_in() throws IOException {
        properties_all();
        try {
            System.out.println("User is trying to sign in");
            Element_to_be_clicked("xpath", Get_properties_value("Signin_button"));
            Element_to_be_Sent("xpath", Get_properties_value("Username_input_field"),
                    Get_properties_value("Username"));
            Element_to_be_clicked("xpath", Get_properties_value("Username_next"));
            Element_to_be_Sent("xpath", Get_properties_value("Password_input_field"),
                    Get_properties_value("Password"));
            Element_to_be_clicked("xpath", Get_properties_value("Password_next"));
            System.out.println("User got singed into the site");
        } catch (Exception e) {
            System.out.println("Sign in method not working");
        }

    }

    protected static void Web_Element_wait(String locatorType, String locator, int sec) throws IOException {

        try {
            System.out.println("Waiting for the Element to be displayed in browser");
            if (locatorType.equalsIgnoreCase("XPATH")) {
                new WebDriverWait(driver, sec)
                        .until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));

            } else if (locatorType.equalsIgnoreCase("ID")) {

                new WebDriverWait(driver, sec)
                        .until(ExpectedConditions.elementToBeClickable(By.id(locator)));
            } else if (locatorType.equalsIgnoreCase("NAME")) {

                new WebDriverWait(driver, sec)
                        .until(ExpectedConditions.elementToBeClickable(By.name(locator)));
            } else if (locatorType.equalsIgnoreCase("CSS")) {

                new WebDriverWait(driver, sec)
                        .until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
            } else if (locatorType.equalsIgnoreCase("LINKTEXT")) {

                new WebDriverWait(driver, sec)
                        .until(ExpectedConditions.elementToBeClickable(By.linkText(locator)));
            }

        } catch (NoSuchElementException e) {

            e.printStackTrace();

        }

    }

    protected static void Element_to_be_clicked(String locatorType, String locator)
            throws InterruptedException, IOException {
        try {
            get_Web_Element(locatorType, locator).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Not a valid locator: " + locator);
        }
    }

    protected static void Element_to_be_Sent(String locatorType, String locator, String charatertobesent)
            throws InterruptedException, IOException {
        try {
            System.out.println("Sending input to the browser: " + charatertobesent);
            get_Web_Element(locatorType, locator).sendKeys(charatertobesent);
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Not a valid locator: " + locator);

        }
    }

    protected static String Get_text(String locatorType, String locator) throws InterruptedException, IOException {
        String text = null;
        try {
            System.out.println("Getting the test from the browser");
            text = get_Web_Element(locatorType, locator).getText();
            System.out.println(text);
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Not a valid locator: " + locator);

        }
        return text;
    }

    protected static String Get_Attribue_text(String locatorType, String locator, String Attribute_name) throws InterruptedException, IOException {
        String text = null;
        try {
            System.out.println("Getting the test from the browser");
            text = get_Web_Element(locatorType, locator).getAttribute(Attribute_name);
            System.out.println(text);
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Not a valid locator: " + locator);

        }
        return text;
    }

    protected static void closeApplication() throws InterruptedException {
        Thread.sleep(6000);
        System.out.println("Stopping the Browser...");
        driver.close();
    }

    protected static void Find_elements(String locatorType, String locator, String charater) {
        List<String> a = new ArrayList<>();

        List<WebElement> text;
        try {
            text = GET_WEB_ELEMENTS(locatorType, locator);
            for (WebElement aText : text) {
                a.add(aText.getText());
            }
            if (a.contains(charater)) {
                System.out.println("Video found By name: " + charater);
            } else {
                System.out.println("Video not found By name : " + charater);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static void Scroll_to_element(String locator) throws IOException {
        properties_all();
        System.out.println("Scrolling the browser");
        WebElement element = driver.findElement(By.xpath(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
