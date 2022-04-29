package appuimPROJECT;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	   AppiumDriver<MobileElement> driver = null;
	   WebDriverWait wait;
	   @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "testfstemulator");
	        caps.setCapability("platformName", "android");
	        caps.setCapability("appPackage", "com.google.android.apps.tasks");
	        caps.setCapability("appActivity", ".ui.TaskListsActivity");
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 20);
	    }
	   
  @Test
  public void googletask() {
	  driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Create new task']").click();
	  //MobileElement taskbutton=driver.findElementByXPath("//*[@text='New task']");
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='New task']")));
	 
	  driver.findElementByXPath("//*[@text='New task']").sendKeys("Complete Activity with Google Tasks");
	  driver.findElementById("add_task_done").click();
	  System.out.println("task actvity added " );
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Create new task']")));
	  driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Create new task']").click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='New task']")));
	  driver.findElementByXPath("//*[@text='New task']").sendKeys("Complete Activity with Google Keep");
	  driver.findElementById("add_task_done").click();
	  System.out.println("keep actvity added " );
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Create new task']")));
	  driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Create new task']").click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='New task']")));
	  driver.findElementByXPath("//*[@text='New task']").sendKeys("Complete the second Activity Google Keep");
	  driver.findElementById("add_task_done").click();
	  System.out.println("second keep act added" );
	  
MobileElement taskact = driver.findElementByXPath("//*[@text='Complete Activity with Google Tasks']");
 Assert.assertTrue(taskact.isDisplayed());
 MobileElement keepact = driver.findElementByXPath("//*[@text='Complete Activity with Google Keep']");
 Assert.assertTrue(keepact.isDisplayed());
 MobileElement secondkeepact = driver.findElementByXPath("//*[@text='Complete the second Activity Google Keep']");
 Assert.assertTrue(secondkeepact.isDisplayed());
 System.out.println("all 3tasks are displayed" );
	  
	  
 
	  
	  
	 
  }
  @AfterClass
  public void afterClass() {
      driver.quit();
  }
}
