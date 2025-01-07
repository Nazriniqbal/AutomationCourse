package testscripts;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestngBase {
  
	public WebDriver driver;
	
  @BeforeMethod
  public void initializeBrower() {
	  driver=new ChromeDriver();
	  driver.get("https://selenium.qabible.in/simple-form-demo.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
	  
  }

  @AfterMethod
  public void driverQuit() {
	  driver.quit();
  }

}
