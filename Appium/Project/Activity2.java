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

public class Activity2 {
	 AppiumDriver<MobileElement> driver = null;
	   WebDriverWait wait;
	   @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "testfstemulator");
	        caps.setCapability("platformName", "android");
	        caps.setCapability("appPackage", "com.google.android.keep");
	        caps.setCapability("appActivity", ".activities.BrowseActivity");
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	        wait = new WebDriverWait(driver, 20);
	    }
  @Test
  public void googlekeep() {
	  driver.findElementById("new_note_button").click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='Title']")));
	  driver.findElementByXPath("//*[@text='Title']").sendKeys("fst-notes");
	  System.out.println("title added " );
	  driver.findElementByXPath("//*[@text='Note']").sendKeys("vai google keep notes");
	  System.out.println("note added " );
	  driver.findElementByXPath("//*[@content-desc='Open navigation drawer']").click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("browse_note_interior_content")));
	  System.out.println("clicked back button  " );
	  MobileElement note_title=driver.findElementByXPath("//*[@text='fst-notes']");
	  Assert.assertTrue(note_title.isDisplayed());
	  System.out.println("keep activity done" );
  }
  
	  
  @AfterClass
  public void afterClass() {
      driver.quit();
  }
}
