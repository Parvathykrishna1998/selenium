package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class HomeWork3 {
    static WebDriver driver;

    public static void testInitials(String browser) {
        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium driver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\selenium\\selenium driver\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\selenium\\selenium driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            try {
                throw new Exception("Invalid browser name");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public static void main(String args[]) {
        testInitials("Chrome");
        driver.get("http://demowebshop.tricentis.com/search");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String pageSource = driver.getPageSource();
        WebElement name = driver.findElement(By.name("Q"));
        WebElement name1 = driver.findElement(By.className("search-text"));
        WebElement name2 = driver.findElement(By.id("Q"));
        WebElement name3 = driver.findElement(By.cssSelector("#Q"));
        WebElement name4 = driver.findElement(By.xpath("//*[@id=\"Q\"]"));
        WebElement name5 = driver.findElement(By.linkText("Log in"));
        WebElement name6 = driver.findElement(By.partialLinkText("Log"));
        List<WebElement> name7 = driver.findElements(By.tagName("div"));
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
        System.out.println(name6);
        System.out.println(name7.size());
        driver.close();
    }
}