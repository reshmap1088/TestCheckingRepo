package TestPackage;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScri {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\c114\\chromedriver.exe");
		//launching instance of the chrome browsert
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//open URL using get()
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='abc@gmail.com'");
	
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-400)");
	}

}
