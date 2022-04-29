package appuimPROJECT;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity3 {
	AppiumDriver<MobileElement> driver = null;
	 WebDriverWait wait;
	 @BeforeClass
	 public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
		 DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "testfstemulator");
	        caps.setCapability("platformName", "android");
	        caps.setCapability("appPackage", "com.android.chrome");
	        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 10);
	    }
  @Test
  public void chromeactivity_tasks() {
	  driver.get("https://www.training-support.net/selenium");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
		
      wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
      driver.findElement(
              MobileBy.AndroidUIAutomator(UiScrollable +".scrollForward(7).scrollIntoView(.textContains(\"To-Do List\"))"))
              .click();
      System.out.println("scorlled" );
	
      wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.EditText")));
    
      driver.findElementByClassName("android.widget.EditText").sendKeys("Add tasks to the list");
      
	 
	  driver.findElementByXPath("//*[@text='Add Task']").click();
	  System.out.println("added Add tasks to list" );
	 driver.findElementByClassName("android.widget.EditText").sendKeys("Get number of tasks");
	  
	  driver.findElementByXPath("//*[@text='Add Task']").click();
	  System.out.println("added get number of tasks" );
	  
	  driver.findElementByClassName("android.widget.EditText").sendKeys("Clear the list");
	  driver.findElementByXPath("//*[@text='Add Task']").click();
	 System.out.println("added clear the list" );
	 wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[2][@text='Add tasks to the list]")));
	  driver.findElementByXPath("//android.view.View[2][@text='Add tasks to the list']").click();
	 driver.findElementByXPath("//*[@text='Get number of tasks']").click();
	  driver.findElementByXPath("//*[@text='Clear the list']").click();
	  driver.findElementByXPath("//*[@text='Clear List']").click();
	  
	  
	  
	  
	  
  }
  @AfterClass
  public void afterClass() {
      driver.quit();
}
}
