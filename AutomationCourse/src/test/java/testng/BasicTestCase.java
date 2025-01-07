package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTestCase {
	 @Test(priority=1,groups="smoke")
	  public void testeCase01() {
		  System.out.println("Test Case 01");
		  }
	  @Test(priority=0,groups="smoke")
	  public void testeCase02() {
		  System.out.println("Test Case 02");
		 
		  }
	  @Test(priority=1,groups="smoke")
	  public void testeCase03() {
		  System.out.println("Test Case 03");
		  }
	  @Test(priority=-1)
	  public void testeCase04() {
		  System.out.println("Test Case 04");
		 
		  }
	  @Test(enabled=true)
	  public void testeCase05() {
		  System.out.println("Test Case 05");
		  }
	  @DataProvider(name="dataProvider3")
	  public Object[][] dpmethod3()
	  {
		 return new Object[][] {{2,"fathima"},{3,"zahra"},{10,"mammu"},{6,"nazrin"}}; 
	  }
}
