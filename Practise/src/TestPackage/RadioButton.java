package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:/Online9thJan2023/Software Testing/software/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();

	}

}
