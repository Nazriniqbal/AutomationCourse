package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @Test(dataProvider="dataProvider")
  public void testcase01(int a,int b) {
  System.out.println(a+b);
  }
  @Test(dataProvider="dataProvider1")
  public void testcase02(int a,int b,int c) {
  System.out.println(a*b*c);
  }
  @Test(dataProvider="dataProvider2")
  public void testcase03(int a,int b) {
  System.out.println(a-b);
  }
  @DataProvider(name="dataProvider")
  public Object[][] dpmethod()
  {
	 return new Object[][] {{2,3},{4,5},{3,5},{5,6}}; 
  }
  @DataProvider(name="dataProvider1")
  public Object[][] dpmethod1()
  {
	 return new Object[][] {{2,3,4},{3,4,5},{10,3,5},{6,5,6}}; 
  }
  @DataProvider(name="dataProvider2")
  public Object[][] dpmethod2()
  {
	 return new Object[][] {{2,3},{4,5},{3,5},{5,6}}; 
  }
  @Test(dataProvider="dataProvider3",dataProviderClass=BasicTestCase.class)
  public void testCase04(int a,String s)
  {
	  System.out.println(a+s);
  }
  
  
}
