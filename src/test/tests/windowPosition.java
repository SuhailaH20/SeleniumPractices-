package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPosition {
    public static void main(String[] args) {
// TC - 04

// Go to the w3school URL : https://www.w3schools.com/
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/");
// Print the position and size of the page.
        Point windowPositions=driver.manage().window().getPosition();
        int windowPositionsX=windowPositions.getX();
        int windowPositionsY=windowPositions.getY();
        Dimension windowSize=driver.manage().window().getSize();
        System.out.println("Window position in X:"+ windowPositionsX + "Window Position"+
                windowPositions);
        System.out.println(windowSize);

// Adjust the position and size of the page as desired.
        driver.manage().window().setPosition(new Point(900, 400));
        driver.manage().window().setSize(new Dimension(900, 400));

// Test that the page is in the position and size you want. // Close the page.
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        driver.quit();
    }
}
