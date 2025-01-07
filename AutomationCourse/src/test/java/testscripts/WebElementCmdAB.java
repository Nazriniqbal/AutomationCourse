package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCmdAB extends AmazonBase{
	
	public void locator()
	{
		WebElement xpathsample=driver.findElement(By.xpath("//div[@id='desktop-3']"));
		
		System.out.println(xpathsample);
	}

	public static void main(String[] args) {
		
		WebElementCmdAB webElementCmdAB= new WebElementCmdAB();
		webElementCmdAB.locator();
		
		

	}

}
