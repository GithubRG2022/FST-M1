package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println("Page title :" + title);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[1]/input")).sendKeys("username");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/input")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[3]/input")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[4]/input")).sendKeys("ritik123@in.ibm.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button")).click();

        String success = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText();
        System.out.println("Success Message :" + success);

        driver.close();
    }
}
