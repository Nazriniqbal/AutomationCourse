package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends Base{
	
	public void alerthandling()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
        WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	    clickme.click();
	    String alerttext=driver.switchTo().alert().getText();
	    System.out.println(alerttext);
	    driver.switchTo().alert().accept();
	    WebElement clickmeconfirm=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	    clickmeconfirm.click();
	    driver.switchTo().alert().dismiss();
	    WebElement clickforprompt=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    clickforprompt.click();
	    driver.switchTo().alert().sendKeys("nazrin");
	    driver.switchTo().alert().accept();
	}
	
	

	public static void main(String[] args) {
		
		Alerts alerts=new Alerts();
		alerts.initializeBrower();
		alerts.alerthandling();
		//alerts.driverQuit();
		
		

	}

}
