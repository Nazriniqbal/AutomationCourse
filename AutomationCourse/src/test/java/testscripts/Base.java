package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public void initializeBrower()
	{
	driver = new ChromeDriver();
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	driver.manage().window().maximize();
	//driver.manage().window().minimize();
	
	}
	public void driverQuit()
	{
   	driver.quit(); //to closed the entire window
	//driver.close(); to closed the current tab
	}

	public static void main(String[] args) {
		
		Base base=new Base();
		base.initializeBrower();
		base.driverQuit();

	}

}
