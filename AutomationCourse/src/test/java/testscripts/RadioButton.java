package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {
	
	public void radiobuttonhandling()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement femaleradiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		femaleradiobutton.click();
		boolean isradiobuttonselected=femaleradiobutton.isSelected();
		System.out.println(isradiobuttonselected);
		WebElement showselectedbutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showselectedbutton.click();
		
	}
	

	public static void main(String[] args) {

		RadioButton radiobutton=new RadioButton();
		radiobutton.initializeBrower();
		radiobutton.radiobuttonhandling();
		radiobutton.driverQuit();

	}

}
