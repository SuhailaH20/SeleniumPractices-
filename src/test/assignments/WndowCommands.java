package assignments;

/* Assignment 3*/

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndowCommands {
    public static void main(String[] args) throws InterruptedException {

        //Go to Amazon
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");

        //Print the position and Size
        Point windowPosition = driver.manage().window().getPosition();
        Dimension windowSize = driver.manage().window().getSize();
        System.out.println("Postion: "+windowPosition);
        System.out.println("Size: "+windowSize);

        //Adjust the size and Position
        driver.manage().window().setPosition(new Point(300,400));
        Thread.sleep(1000);
        driver.manage().window().setSize(new Dimension(900,700));
        Thread.sleep(1000);

        //Test that the page is in the position and size
        System.out.println("New Position: "+ driver.manage().window().getPosition());
        System.out.println("New Size: "+driver.manage().window().getSize());

        //Close the Window
        driver.quit();

    }
}
