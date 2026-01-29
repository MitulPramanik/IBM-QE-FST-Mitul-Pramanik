package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args){
         WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/login-form");
        System.out.println("Home page title: " + driver.getTitle());

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        // Find the password field and enter the password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        // Find the login button and click it
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Print the confirmation message
       // String message = driver.findElement(By.xpath("//h1[contains(text(), 'Success')]")).getText();
        //System.out.println(message);

        // Close the browser
        driver.quit();


        
    }
}
