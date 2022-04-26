package activities;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        driver.findElement(By.cssSelector("button#confirm")).click();

        Alert confirmAlert = driver.switchTo().alert();

        String alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);

        confirmAlert.accept();

        driver.close();
    }
}
