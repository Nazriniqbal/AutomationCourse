package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base{
	
	public void dropdownhandling()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");	
		WebElement dropdownfield=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropdownfield);
		select.selectByIndex(2);
		select.selectByValue("Red");
		select.selectByVisibleText("Green");
		
		WebElement multipledropdown=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select multiselect=new Select(multipledropdown);
		boolean multipleselected=multiselect.isMultiple();
		System.out.println(multipleselected);
		
		List<WebElement> options=multiselect.getOptions();
		multiselect.selectByIndex(1);
		multiselect.selectByIndex(2);
		
		WebElement element=multiselect.getFirstSelectedOption();
		String s=element.getText();
		System.out.println(s);
		
		multiselect.deselectAll();
		
	}

	public static void main(String[] args) {
		
		DropDown dropdown=new DropDown();
		dropdown.initializeBrower();
		dropdown.dropdownhandling();
		//dropdown.driverQuit();

	}

}
