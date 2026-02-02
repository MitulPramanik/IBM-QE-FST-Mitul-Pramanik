package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;


public class Activity15 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
         WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(200));        
        driver.get(" https://training-support.net/webelements/dynamic-attributes");
        System.out.println("Page title: " + driver.getTitle());

        driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]")).sendKeys("admin singh");
        driver.findElement(By.xpath("//input[contains(@id, '-email')]")).sendKeys("admin.@gmail.com");
        driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]")).sendKeys("2025-06-25");
        driver.findElement(By.xpath("//textarea[contains(@id,'-additional-details-')]")).sendKeys("Help Others");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")))
                .getText());
    
    
        driver.quit();
    }
   
}
