package TestNG;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver  = new FirefoxDriver();
        driver.get("https://training-support.net");
    }

    @Test(priority =1)
    public void HomePageTest(){
        Assert.assertEquals(driver.getTitle(),"Training Support");
        driver.findElement(By.cssSelector("class.mx-auto")).click();
    }

    @Test(priority = 2)
    public void aboutPageTest() {
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @Test(priority = 3)
    public void teardownPage(){
        driver.quit();
    }
}
