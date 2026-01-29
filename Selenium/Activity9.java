package selenium;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();      
        Actions builder = new Actions(driver);
        driver.get("https://training-support.net/webelements/keyboard-events");
        System.out.println(driver.getTitle());

        builder.sendKeys("Hello, this is selenium").build().perform();
       System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());
       

        driver.quit();


        


    }
}
