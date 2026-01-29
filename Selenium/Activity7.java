package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/webelements/dynamic-controls\r\n");

        System.out.println(driver.getTitle());

        driver.findElement(By.name("textInput"));
        System.out.println(driver.findElement(By.id("textInput")).isEnabled());
        driver.findElement(By.xpath("//button[text()='Enable Input']")).click();
        System.out.println(driver.findElement(By.id("textInput")).isEnabled());

        
    }
}
