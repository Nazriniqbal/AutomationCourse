package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion extends TestngBase {
	@Test
	
	public void vertfySingleInputField()
	{
	String input="Helloo";
	String expectedresult="Your Message : "+input;
	WebElement	showmessagebutton1=driver.findElement(By.id("button-one"));
	WebElement singleelement=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	singleelement.sendKeys(input);
	WebElement showmessagebutton2=driver.findElement(By.xpath("//button[@id='button-one']"));
	showmessagebutton2.click();
	WebElement yourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
   String  actualmeassage=yourmessage.getText();
   Assert.assertEquals(expectedresult,actualmeassage,"expected resultis"+expectedresult+"but it is"+actualmeassage);
	
   int a=12;
   int b=18;
   Assert.assertNotEquals(a,b,"a and b are equal");
   String abc=null;
   Assert.assertNull(abc,"abc is not null");
   String xyz="Welcome";
   Assert.assertNotNull(xyz,"xyz is null");
   
   driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement femaleradiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	boolean isradiobuttonselectedbeforeclick=femaleradiobutton.isSelected();
	Assert.assertFalse(isradiobuttonselectedbeforeclick,"Radio button is selected before click");
	femaleradiobutton.click();
	boolean isradiobuttonisselected=femaleradiobutton.isSelected();
	Assert.assertTrue(isradiobuttonisselected,"Radio button is not selected after click");
	}
	
	@Test
	
	public void verifySoftAssert() {
		
		WebElement singleelement=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		boolean issingleinputfielddisplayed=singleelement.isDisplayed();
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(issingleinputfielddisplayed,"input field is displayed");
		 driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
			WebElement femaleradiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
			boolean isradiobuttonselectedbeforeclick=femaleradiobutton.isSelected();
			softassert.assertFalse(isradiobuttonselectedbeforeclick,"Radio button is selected before click");
		    softassert.assertAll();
		    
		
		

	}

}
