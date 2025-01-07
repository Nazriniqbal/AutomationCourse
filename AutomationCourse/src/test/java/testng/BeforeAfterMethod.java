package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
 
  @Test
  public void testeCase01() {
	  System.out.println("Test Case 01");
	  }
  @Test
  public void testeCase02() {
	  System.out.println("Test Case 02");
	 
	  }
  @BeforeMethod
  public void beforeMethod()
  {
	System.out.println("Before Method");
   }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
	  }
}
