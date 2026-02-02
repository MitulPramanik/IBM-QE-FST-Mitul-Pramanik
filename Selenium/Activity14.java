package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity14 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rows.size());

        List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println(cols.size());

        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
        driver.findElement(By.xpath("//table[contains(@class, 'table-auto']/thead/tr/th[5]")).click();      
        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
    }
    
}
