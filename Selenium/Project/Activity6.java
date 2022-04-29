package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");

    }

    @Test
    public void ActivitiesTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement username = driver.findElement(By.id("user_name"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.id("username_password"));
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("container-fluid")));

        String Activities = driver.findElement(By.id("grouptab_3")).getText();
        Assert.assertEquals("ACTIVITIES", Activities);

        }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
