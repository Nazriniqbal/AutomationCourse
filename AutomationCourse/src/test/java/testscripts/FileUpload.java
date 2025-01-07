package testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileUpload  extends Base{
	
	public void fileUploadUsingSendKeys()
	{
	driver.navigate().to("https://demo.guru99.com/test/upload/");	
	WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
    choosefile.sendKeys("C:\\Users\\DELL\\Pictures\\Screenshots\\Screenshot 2024-07-04 193813.png");
	}
	public void fileUploadUsingRobotKey() throws AWTException
	{
		//driver.navigate().to("https://www.ilovepdf.com/pdf_to_word%0A");
	    //WebElement selectfile=driver.findElement(By.xpath("//a[@id='pickfiles']"));
         //selectfile.click();
		
	    driver.navigate().to("https://demo.guru99.com/test/upload/");	
		Actions obj=new Actions(driver);
	    WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		obj.moveToElement(choosefile).click().perform();
		
		StringSelection ss=new StringSelection("C:\\Users\\DELL\\Pictures\\Screenshots\\Screenshot 2024-07-04 193813.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		Robot robot= new Robot();
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(500);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

	public static void main(String[] args) {
		
		FileUpload fileupload=new FileUpload();
		fileupload.initializeBrower();
		//fileupload.fileUploadUsingSendKeys();
		try {
			fileupload.fileUploadUsingRobotKey();
		}catch(AWTException e) {
			e.printStackTrace();
		}
		
		
		//fileupload.driverQuit();

	}

}
