package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        String title = driver.getTitle();
        System.out.println("Page Title : " + title);

        String thirdheader = driver.findElement(By.xpath("//h3[@id=\'third-header\']")).getText();
        System.out.println("Third Header : " + thirdheader);

        String fifthheader = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println(" Color of fifth header is : " + fifthheader);

        String violetbutton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class");
        System.out.println("Class Attribute of Violet Button : " + violetbutton);

        String greybutton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("Grey button text is :" + greybutton);

        driver.close();
    }
}
