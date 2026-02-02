package selenium;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/webelements/tabs");
        System.out.println(driver.getTitle());
        String parentHandle = driver.getWindowHandle();

        WebElement button = driver.findElement(By.cssSelector("button.bg-purple-200"));
        button.click();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            if (handle != parentHandle) {
                System.out.println(driver.switchTo().window(handle));
            }
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Another One')]"))).click();
        for(String handle : handles) {
            if (handle != parentHandle) {
                System.out.println(driver.switchTo().window(handle));
            }
        }
        System.out.println("Current tab: " + driver.getWindowHandle());
        System.out.println("New Page title: " + driver.getTitle());
        System.out.println("New Page message: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());
        
        driver.quit();
    }
}
