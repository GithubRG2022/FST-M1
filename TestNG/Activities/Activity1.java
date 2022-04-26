package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");
    }

    @Test
    public void homepageTest(){
        String PageTitle = driver.getTitle();

        Assert.assertEquals(PageTitle,"Training Support");

        driver.findElement(By.id("about-link")).click();

        String aboutUsPageTitle = driver.getTitle();
        Assert.assertEquals(aboutUsPageTitle,"About Training Support");

    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
