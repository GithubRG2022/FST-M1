package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("Page title " + title);

        driver.findElement(By.id("firstName")).sendKeys("Ritika");
        driver.findElement(By.id("lastName")).sendKeys("Gupta");
        driver.findElement(By.id("email")).sendKeys("ritika123@in.ibm.com");
        driver.findElement(By.id("number")).sendKeys("9953833330");
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        driver.close();
    }
}