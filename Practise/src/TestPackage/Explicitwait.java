package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\c114\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
		
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
		
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
		
		//using explicitewait
		
		WebDriverWait wt=new WebDriverWait(driver, 30);
	//	wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");
		
	}

}

/*
 * The Fluent Wait in Selenium is used to define maximum time for the web driver
 * to wait for a condition, as well as the frequency with which we want to check
 * the condition before throwing an “ElementNotVisibleException” exception. It
 * checks for the web element at regular intervals until the object is found or
 * timeout happens.
 * Fluent Wait syntax:
Wait wait = new FluentWait(WebDriver reference)
.withTimeout(timeout, SECONDS)
.pollingEvery(timeout, SECONDS)
.ignoring(Exception.class);
 */
