package testscripts;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitSample {

	public static void main(String[] args) {
		
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.qabible.in/payrollapp/site/login");   
       driver.manage().window().maximize();
       
       //implicit wait
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       //explicit wait
       
       WebElement username=driver.findElement(By.xpath("//input[@id='loginform-username']"));
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	   wait.until(ExpectedConditions.visibilityOf(username));
	   
	   wait.until(ExpectedConditions.alertIsPresent());
	   wait.until(ExpectedConditions.attributeContains(username,"id","loginform-username" ));
	   
	   //fluent wait
	   FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(10))
	            .pollingEvery(Duration.ofSeconds(3))
	            .ignoring(NoSuchElementException.class);
	   fluentWait.until(ExpectedConditions.elementToBeClickable(username));
	   
	}

}
