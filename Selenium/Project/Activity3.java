package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void CopyrightTest() {
        String copyright = driver.findElement(By.id("admin_options")).getText();
        System.out.println("First Copyright Text: " + copyright);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}

