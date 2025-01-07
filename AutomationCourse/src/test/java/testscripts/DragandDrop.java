package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends Base {
	
	public void dragDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement draggableelement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement targetelement=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		WebElement draggableelement2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement draggableelement3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		WebElement draggableelement4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(draggableelement, targetelement).perform();
		action.dragAndDrop(draggableelement2, targetelement).perform();
		action.dragAndDrop(draggableelement3, targetelement).perform();
		action.dragAndDrop(draggableelement4, targetelement).perform();
	}

	public static void main(String[] args) {
		
		DragandDrop draganddrop=new DragandDrop();
		draganddrop.initializeBrower();
		draganddrop.dragDrop();
		draganddrop.driverQuit();
		

	}

}
