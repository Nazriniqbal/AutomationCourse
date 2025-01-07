package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class ParameterTest {
	
	@Test
	@Parameters({"parameter1","parameter2"})
	public void testCase01(int a,String s)
	{
		System.out.println(a+s);
		}

}
