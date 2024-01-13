package TestPackage;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\c114\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(2000);
		List<WebElement> da=driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println("date size:"+da.size());
		da.get(9).click();
		
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select mo=new Select(month);
		mo.selectByVisibleText("Aug");
		
		Thread.sleep(2000);
		mo.selectByIndex(6);
		
		Thread.sleep(2000);
		mo.selectByValue("8");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1988");
		
		//mo.deselectByVisibleText("Aug");
		
		
	}

}
