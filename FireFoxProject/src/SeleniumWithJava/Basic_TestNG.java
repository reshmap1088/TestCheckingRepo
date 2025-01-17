package SeleniumWithJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Basic_TestNG {

	
	@Test
	@Parameters("a")
	public void launchBrowser(String s)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Downloads\\firef\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//driver.get("https://www.redbus.in/");
		System.out.println("taking parameter from xml file :"+s);
	}
	
}
