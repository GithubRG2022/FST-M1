package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println("Page Title : " + title);

        WebElement textField = driver.findElement(By.id("dynamicText"));
        System.out.println("Is text field enabled :" + textField.isEnabled());

        driver.findElement(By.id("toggleInput")).click();

        System.out.println("Is text field enabled :" + textField.isEnabled());

    }
}
