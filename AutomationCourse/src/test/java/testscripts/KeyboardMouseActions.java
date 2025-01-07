package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions  extends Base {
	
	public void keyboardmouseactions()
	{
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(clickme).perform(); //mouseover
		WebElement rightclickme=driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		actions.contextClick(rightclickme).perform(); //rightclick
		WebElement doubleclickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		actions.doubleClick(doubleclickme).perform();
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		WebElement textbox=driver.findElement(By.xpath("//a[@href='text-box.php']"));
		actions.moveToElement(textbox).perform();
		actions.sendKeys(Keys.ARROW_DOWN).perform();
	}

	public static void main(String[] args) {
		
		KeyboardMouseActions keyboardmouseactions=new KeyboardMouseActions();
		keyboardmouseactions.initializeBrower();
		keyboardmouseactions.keyboardmouseactions();
		//keyboardmouseactions.driverQuit();

	}

}
