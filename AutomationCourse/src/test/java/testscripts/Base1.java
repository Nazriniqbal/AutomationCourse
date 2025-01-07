package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base1 {
	
public WebDriver driver;
	
	public void initializeBrower()
	{
	driver = new FirefoxDriver();
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	}

public static void main(String[] args) {
	
	Base1 base1=new Base1();
	base1.initializeBrower();
		

	}

}
