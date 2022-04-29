package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void LoginTest() {
        WebElement username = driver.findElement(By.id("user_name"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.id("username_password"));
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        String home = driver.findElement(By.id("tab0")).getText();

        Assert.assertEquals("SUITECRM DASHBOARD", home);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
