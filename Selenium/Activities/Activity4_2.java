package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("Page Title : " + title );
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ritika");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Gupta");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ritik123@in.ibm.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9953833330");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[5]/textarea")).sendKeys("Hi");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();

    }
}
