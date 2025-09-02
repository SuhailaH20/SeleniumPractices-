package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CO2Browser {

    public static void main(String[] args) throws InterruptedException {
        //TC - 02

// Go to www.yahoo.com
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://www.LinkedIn.com");

// Maximize Window
        driver.manage().window().maximize();
        Thread.sleep(1000);
// Go to www.amazon.com
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(1000);
// minimize Window
        driver.manage().window().minimize();
        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        Thread.sleep(1000);

// Navigate Back
        driver.navigate().back();
// Navigate Forward
        driver.navigate().forward();
// Refresh The Page
        driver.navigate().refresh();
        driver.quit();
    }
}
