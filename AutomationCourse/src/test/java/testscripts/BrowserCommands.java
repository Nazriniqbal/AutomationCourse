package testscripts;

public class BrowserCommands extends Base{
	
	public void browserCommands()
	{
		String url= driver.getCurrentUrl();
		System.out.println(url);
		String title= driver.getTitle();
		System.out.println(title);
		String src= driver.getPageSource();
		System.out.println(src);
	}
	
	public void navigationCommands()
	{
		driver.navigate().to("https://www.javatpoint.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {

		BrowserCommands browserCommands=new BrowserCommands();
		browserCommands.initializeBrower();
		browserCommands.browserCommands();
		browserCommands.navigationCommands();
		browserCommands.driverQuit();

	}

}
