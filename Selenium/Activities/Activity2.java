package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("Title " + title);

        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("Text by id: " + idLocator.getText());

        WebElement classLocator = driver.findElement(By.className("inverted"));
        System.out.println("Text by className: " + classLocator.getText());

        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text by linkText: " + linkTextLocator.getText());

        WebElement cssLocator = driver.findElement(By.cssSelector(".inverted"));
        System.out.println("Text by cssLocator: " + cssLocator.getText());

        driver.close();
    }

}
