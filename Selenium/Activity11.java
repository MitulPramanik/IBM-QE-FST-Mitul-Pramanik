package selenium;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Activity11 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("Home Page Title is:" +driver.getTitle());

        WebElement checkbox = driver.findElement(By.name("checkbox"));
        System.out.println(checkbox.isDisplayed());
        driver.findElement(By.xpath("//button [text()='Toggle Checkbox']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("heading")));
        System.out.println("Checkbox is visible? " + checkbox.isDisplayed());
        System.out.println(driver.findElement(By.name("checkbox")).isDisplayed());
         driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
        // Check if it is selected
        System.out.println("Checkbox is selected? " + checkbox.isSelected());
        
        driver.quit();


    }
}
