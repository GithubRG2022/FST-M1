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
import java.util.List;

public class Activity8 {

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
        wait.until(ExpectedConditions.elementToBeClickable(By.id("moduleTab_9_Accounts")));
        driver.findElement(By.id("moduleTab_9_Accounts")).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("module-title-text")));
        String pageTitle = driver.findElement(By.className("module-title-text")).getText();
        Assert.assertEquals(pageTitle, " ACCOUNTS");
        System.out.println("Page Title is :" + pageTitle);

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr"));
        System.out.println("Number of rows :" + rows.size());

        wait.until(ExpectedConditions.visibilityOfAllElements(rows));
        System.out.println("first five odd row names are");

        for(int i=1;i<=9;i=i+2) {
            System.out.println(i+" row");
            System.out.println(driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr["+ i +"]/td[3]/b/a")).getText());
        }

        //WebElement value1 = driver.findElement(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr/td[3]"));
        //WebElement value2 = driver.findElement(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr[3]/td[3]"));
        //WebElement value3 = driver.findElement(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr[5]/td[3]"));
        //WebElement value4 = driver.findElement(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr[7]/td[3]"));
        //WebElement value5 = driver.findElement(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr[9]/td[3]"));

        //System.out.println("Odd Number Value 1 :" + value1.getText());
        //System.out.println("Odd Number Value 2 :" + value2.getText());
        //System.out.println("Odd Number Value 3 :" + value3.getText());
        //System.out.println("Odd Number Value 4 :" + value4.getText());
        //System.out.println("Odd Number Value 5 :" + value5.getText());

    }
        @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}

