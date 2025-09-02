package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitle {
    public static void main(String[] args) {
        // TC – 03

// Expected Title
        String expectedTitle ="Google";

// Set Path of the Chrome driver

// Launch Chrome browser
        WebDriver driver =new ChromeDriver();

// Open URL of Website
        driver.navigate().to("https://www.google.com/");

// Maximize Window
        driver.manage().window().maximize();

// Get Title of current Page
      String ActualTitle=  driver.getTitle();
        System.out.println(ActualTitle);
// Validate/Compare Page Title
        if (ActualTitle.equals(expectedTitle)){
            System.out.println("Title is correct!!");
        }
        else {
            System.out.println("Wrong....");
        }
// Close Browser
        driver.quit();
    }

}
