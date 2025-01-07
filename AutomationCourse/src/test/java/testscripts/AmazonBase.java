package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBase {
	
public WebDriver driver;
	
	public void initializeBrower()
	{
	driver = new ChromeDriver();
	driver.get("https //www.google.com/search q=amazon india");
	driver.manage().window().maximize();
	}
	
	public void driverQuit()
	{
	driver.quit();
	}

	public static void main(String[] args) {
		
		AmazonBase amazonBase=new AmazonBase();
		amazonBase.initializeBrower();
		amazonBase.driverQuit();
		

	}

}
