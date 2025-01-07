package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base{
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement checkbox:checkboxes)
	{
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
	}
	}

	public static void main(String[] args) {
		
		CheckBox checkbox=new CheckBox();
		checkbox.initializeBrower();
		checkbox.checkBox();
		checkbox.driverQuit();

	}

}
