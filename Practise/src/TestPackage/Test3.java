package TestPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test3 {

	//@Test
	public void a()
	{
		System.out.println("Hello a method");
	}
	
	@Test(enabled = false)
	public void b()
	{
		System.out.println("Hello b method");
	}
	
	@Test(enabled = true)
	public void c()
	{
		System.out.println("Hello c method");
	}
	@Test(invocationCount = 2)
	public void d()
	{
		System.out.println("Hello d method");
	}
	
	@Test(invocationCount = 0)
	public void e()
	{
		System.out.println("Hello e method");
	}
	
	@Test
	public void f()
	{
		System.out.println("Hello f method");
		throw new SkipException("skipping f method");
	}
	
}
