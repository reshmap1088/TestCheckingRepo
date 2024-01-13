package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//setting property of chrome browser and passing chrome driverr path
		System.setProperty("webdriver.chrome.driver","E:/Online9thJan2023/Software Testing/software/chromedriver_win32/chromedriver.exe");
		//launching instance of the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//open URL using get()
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
		
		//maximize the window
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//delete all cookies
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		//open URL using navigate()
		driver.navigate().to("https://www.google.com");
		
		//refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//navigate to back
		Thread.sleep(2000);
		driver.navigate().back();
		
		//navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//fetch current url
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		//get title of the page
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		//close the browser istance
		Thread.sleep(2000);
		driver.close();
		
	}

}
