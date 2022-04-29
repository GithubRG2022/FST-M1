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

public class Activity9 {

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

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("module-title-text")));
        String pageTitle = driver.findElement(By.className("module-title-text")).getText();
        Assert.assertEquals(pageTitle, " LEADS");
        System.out.println("Page Title is :" + pageTitle);

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr[1]/td"));

        System.out.println("Number of rows :" + rows.size());
        System.out.println("Number of cols :" + cols.size());


        wait.until(ExpectedConditions.visibilityOfAllElements(rows));
        System.out.println("first 10 row names are");
        for(int i=1; i<=10; i++){

            System.out.println(driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr["+ i +"]/td[3]/b/a")).getText());
        }
        System.out.println("first 10 row users are");
        for(int j=1; j<=10; j++){

            System.out.println(driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr["+ j +"]/td[8]/a")).getText()); }

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}