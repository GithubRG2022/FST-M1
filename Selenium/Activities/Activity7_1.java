package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println("Page Title :" + title);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[1]/input")).sendKeys("admin");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/input")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/button")).click();

        String confirmation = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText();
        System.out.println("Confirmation Message :" + confirmation);
        driver.close();

    }
}
