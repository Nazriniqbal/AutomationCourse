package testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleTabHandling extends Base {
	
	public void multipletabhandle()
	{
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		WebElement newtabbutton=driver.findElement(By.xpath("//button[@title='New Tab']"));
		newtabbutton.click();
		
		Set<String> allwindows=driver.getWindowHandles();
		for(String childwindow:allwindows)
		{
			if(!parentwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				String newhandle=driver.getWindowHandle();
				System.out.println(newhandle);
				WebElement tabtext=driver.findElement(By.xpath("//div[@class='row d-flex justify-content-center logindiv bg-white rounded']"));
				System.out.println(tabtext.getText());
			}
		}
	}

	public static void main(String[] args) {
		
		 MultipleTabHandling multipleTabHandling=new MultipleTabHandling();
		 multipleTabHandling.initializeBrower();
		 multipleTabHandling.multipletabhandle();
		 multipleTabHandling.driverQuit();
		
		

	}

}
