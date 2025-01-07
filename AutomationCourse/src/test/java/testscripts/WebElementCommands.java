package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	
	public void locators()
	{
WebElement showmessagebutton= driver.findElement(By.id("button-one"));
WebElement gettotalbutton=driver.findElement(By.id("button-two"));
WebElement entermessage=driver.findElement(By.id("single-input-field"));
WebElement entervalue_a=driver.findElement(By.id("value-a"));
WebElement entervalue_b=driver.findElement(By.id("value-b"));


WebElement classsample=driver.findElement(By.className("clearfix"));
WebElement tagsample=driver.findElement(By.tagName("section"));
WebElement linktext=driver.findElement(By.linkText("Radio buttons Demo"));
WebElement partiallinktext=driver.findElement(By.partialLinkText("Radio buttons"));
WebElement namesample=driver.findElement(By.name("description"));

WebElement xpathsample=driver.findElement(By.xpath("//button[@type='button']"));
driver.findElement(By.xpath("//button[text()='show message']"));
driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
driver.findElement(By.xpath("//input[contains(@id,'single-input-')]"));
driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
driver.findElement(By.xpath("//button[@id='button-one' or @id='button-two']"));

driver.findElement(By.xpath("//button[@id='button-first']"));
driver.findElement(By.xpath("//button[@id='button-all']"));
driver.findElement(By.xpath("//select[@id='multi-select-field']"));
driver.findElement(By.xpath("//button[@id='button-first' and @type='button']"));
driver.findElement(By.xpath("/select[@id='multi-select-field' and @multiple='multiple']"));
driver.findElement(By.xpath("//button[text()= 'Get First Selected']"));


/*WebElement xpathparentchild=driver.findElement(By.xpath("//input[@name='username']//parent::div[@class='input-group mb-3 form-group']"));
driver.findElement(By.xpath("//form[@action='https://groceryapp.uniqassosiates.com/admin/login']//child::input[@type='hidden']"));
driver.findElement(By.xpath("//input[@type='hidden']//following::div[contains(@class,'card')]"));
driver.findElement(By.xpath("driver.findElement(By.xpath(\"//button[@id='button-one']//preceding::div[@class='card']\"));"));
driver.findElement(By.cssSelector("input#remember"));
driver.findElement(By.cssSelector("input.ace"));
driver.findElement(By.cssSelector("input[placeholder=Username]"));
driver.findElement(By.cssSelector("input.form-control[placeholder=Username]")); */

WebElement xpathchildparent=driver.findElement(By.xpath("//input[@id='value-a']//parent::div[@class='form-group']"));
driver.findElement(By.xpath("//form[@method='POST']//child::input[@id='single-input-field']"));
driver.findElement(By.xpath("//input[@type='text']//following::div[@id='message-one']"));
driver.findElement(By.xpath("//input[@type='text']//following::div[contains(text(),'Your')]"));
driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='form-group']"));
driver.findElement(By.xpath("//button[@id='button-one']//preceding::label[@for='inputEmail4']"));
driver.findElement(By.cssSelector("input#value-a"));
driver.findElement(By.cssSelector(""));
driver.findElement(By.cssSelector("input.form-check-input"));
driver.findElement(By.cssSelector("input[placeholder=Message]"));
driver.findElement(By.cssSelector("input.form-control[placeholder=Message]"));

}
	
	public void webelementcommands() {
		
		/*driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement usernamefield=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernamefield.sendKeys("admin");
        WebElement passwordfield=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordfield.sendKeys("admin");
	    WebElement signinbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		signinbutton.click();
		usernamefield.clear();
		passwordfield.clear(); */
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement singleelement=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleelement.sendKeys("hello");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.click();
		WebElement yourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String s= yourmessage.getText();
		System.out.println(s);
		
		WebElement entervalueafield=driver.findElement(By.xpath("//input[@id='value-a']"));
		entervalueafield.sendKeys("36");
	    WebElement entervaluebfield=driver.findElement(By.xpath("//input[@id='value-b']"));
		entervaluebfield.sendKeys("44");
		WebElement gettotalbutton=driver.findElement(By.xpath("//button[@id='button-two']"));
		gettotalbutton.click();
		WebElement total=driver.findElement(By.xpath("//div[@id='message-two']"));
		String s1=total.getText();
		System.out.println(s1);
		entervalueafield.clear();
		entervaluebfield.clear();
		
		
		boolean isshowmessagebuttondisplayed=showmessagebutton.isDisplayed();
		System.out.println(isshowmessagebuttondisplayed);
		
		boolean isshowmessagebuttonenabled=showmessagebutton.isEnabled();
		System.out.println(isshowmessagebuttonenabled);
		
		String backgroundcolor=showmessagebutton.getCssValue("background-color");
		System.out.println(backgroundcolor);
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement firstcheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		boolean ischeckboxselected=firstcheckbox.isSelected();
		System.out.println(ischeckboxselected);
		
		
	}
	
	

	public static void main(String[] args) {
		
		WebElementCommands webElementCommands= new WebElementCommands();
		webElementCommands.initializeBrower();
		//webElementCommands.locators();
		webElementCommands.webelementcommands();
        webElementCommands.driverQuit();

	}

}
