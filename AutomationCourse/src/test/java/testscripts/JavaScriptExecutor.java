package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import javax.swing.text.Document;

public class JavaScriptExecutor  extends Base{
	
	public void javaScriptSample()
	{
		/*WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement singleinputfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleinputfield.sendKeys("Hello world");
	
        JavascriptExecutor obj = (JavascriptExecutor)driver;
	    obj.executeScript("arguments[0].click();",showmessagebutton );
	    obj.executeScript("window.scrollBy(0,350)","");
	    obj.executeScript("window.scrollBy(0,-350)","");
	    
	    WebElement gettotalbutton=driver.findElement(By.xpath("//button[@id='button-two']"));
	    obj.executeScript("arugments[0].scrollIntoView()",gettotalbutton);
	    obj.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
        driver.navigate().to("https://www.javatpoint.com/");
        driver.manage().window().minimize();
	    obj.executeScript("window.scrollBy(500,0)",0);
	    obj.executeScript("window.scrollBy(-500,0)",0);
	}*/
	
	WebElement showMessageButton=driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement singleInputField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	singleInputField.sendKeys("Hello");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", showMessageButton);
	js.executeScript("window.scrollBy(0,350)", "");
	js.executeScript("window.scrollBy(0,-350)","");
	//js.executeScript("window.scrollBy(0,350)", "");
	
	WebElement getTotalButton=driver.findElement(By.id("button-two"));
			js.executeScript("arguments[0].scrollIntoView()", getTotalButton);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
			
			driver.navigate().to("https://www.javatpoint.com/");
			js.executeScript("window.scrollBy(500,0)",0);
			js.executeScript("window.scrollBy(-500,0)",0);
	
	}

	public static void main(String[] args) {
		
		JavaScriptExecutor javascriptexecutor=new JavaScriptExecutor();
		javascriptexecutor.initializeBrower();
		javascriptexecutor.javaScriptSample();
		//javascriptexecutor.driverQuit();

	}

}
