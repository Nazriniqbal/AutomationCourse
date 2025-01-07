package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	
	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	 WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
	 System.out.println(table.getText());
	 
	}
	public void headings()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement headings=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead"));
		System.out.println("Headings:"+headings.getText());
	}
	
	public void selectrow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row1=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		System.out.println("row:"+row1.getText());
	}
	public void selectPartElement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement partElement=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]//td[4]"));
		System.out.println(partElement.getText());
	}
	public void list()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[4]"));
		for(WebElement element:table)
		{
			System.out.println(element.getText());
		}
		List<WebElement> tablecol2=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement element1:tablecol2)
		{
			System.out.println("positions: "+element1.getText());
		}
		
	}
	public void elementSearch()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Ashton Cox";
		List<WebElement> tableName=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		
		int flag=0;
		
		for(WebElement elementName:tableName)
		{
			if(elementName.getText().equalsIgnoreCase(input))
			{
				System.out.println(elementName.getText());
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Element is found");
			
		}
		else
		{
			System.out.println("Element is not found");
		}
	}
	public void elementsearch1()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Sonya Frost";
		List<WebElement> tableName=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		
		int flag=0;
		
		for(WebElement elementName:tableName)
		{
			if(elementName.getText().equalsIgnoreCase(input))
			{
				System.out.println(elementName.getText());
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Element is found");
			
		}
		else
		{
			System.out.println("Element is not found");
		}
	}

	public static void main(String[] args) {
		
		TableHandling tableHandling=new TableHandling();
		tableHandling.initializeBrower();
		tableHandling.fullTable();
		tableHandling.headings();
		tableHandling.selectrow();
		tableHandling.selectPartElement();
		tableHandling.list();
		tableHandling.elementSearch();
		tableHandling.elementsearch1();
		tableHandling.driverQuit();

	}

}
