package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void HeaderURLTest() {
        String url = driver.findElement((By.xpath("//img[contains(@src,'themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g')]"))).getAttribute("src");
        System.out.println("URL of header image is: " + url);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}

