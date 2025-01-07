package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames  extends Base{
	
	public void frame()
	{
	 driver.navigate().to("https://demoqa.com/frames");	
	 // step 1:switch to frame
	// driver.switchTo().frame("frame1");
	 WebElement iframeelement=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	 driver.switchTo().frame(iframeelement); 
	 //step 2: action perform
	 WebElement frameheadingtext=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
	 System.out.println(frameheadingtext.getText());
	  //step 3:back to main frame
	 driver.switchTo().parentFrame();
	 driver.switchTo().defaultContent();
	}
	public void frame1()
	{
		 driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		 WebElement iframeelement1=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		 driver.switchTo().frame(iframeelement1);
		// WebElement framehref=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		//driver.switchTo().frame(framehref);
		WebElement frameimage=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frameimage.click();
		 driver.switchTo().parentFrame();
		 driver.switchTo().defaultContent();
	}
	

	public static void main(String[] args) {
		
		Frames frames=new Frames();
		frames.initializeBrower();
		frames.frame();
		frames.frame1();
		//frames.driverQuit();

	}

}
