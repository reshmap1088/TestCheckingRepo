package TestPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4 {

	@Test
	public void a()
	{
		System.out.println("Hello a method");
	}
	@Test(invocationCount = 2,priority = -1,enabled = false & true)
	public void b()
	{
		System.out.println("Hello b method");
	}
	
	@Test(invocationCount = 2)
	public void c()
	{
		System.out.println("Hello c method");
	}
	
	@BeforeMethod
	public void d()
	{
		System.out.println("Hello d method");
	}
}
