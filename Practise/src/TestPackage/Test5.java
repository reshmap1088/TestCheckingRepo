package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5 {

	@Test
	public void z()
	{
		Assert.assertTrue(3>15);
		System.out.println("Hello z method");
	}
	
	@Test(dependsOnMethods = "z")
	public void b()
	{
		System.out.println("Hello b method");
	}
}
