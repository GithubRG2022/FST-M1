package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;

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
        driver.findElement(By.id("grouptab_0")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("moduleTab_9_Leads")));
        driver.findElement(By.id("moduleTab_9_Leads")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("adspan_dff2dd29-8a3f-22b6-bd24-5f5a7d339e97")));
        driver.findElement((By.id("adspan_dff2dd29-8a3f-22b6-bd24-5f5a7d339e97"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='phone']")));
        String phone_number=driver.findElement(By.xpath("//span[@class='phone']")).getText();
       System.out.println("Phone Number is :" + phone_number);

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
