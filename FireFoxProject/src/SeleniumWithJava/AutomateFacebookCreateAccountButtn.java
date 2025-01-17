package SeleniumWithJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateFacebookCreateAccountButtn {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Downloads\\firef\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		// 1rst way
		WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("Reshma");
		
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		//2nd way
		/* We can find element using any of the element locator 
		 * WebElement name=driver.findElement(By.name("firstname"));
		 * name.sendKeys("Rachit");
		 */
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kamble");
		
		Thread.sleep(1000);
		Select date=new Select(driver.findElement(By.id("day")));
		date.selectByValue("10");
		
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		Select month=new Select(driver.findElement(By.id("month")));
		List<WebElement> l=month.getOptions();
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).getText().equalsIgnoreCase("Aug"))
			{
				l.get(i).click();
			}
			
		}
		Thread.sleep(1000);
		Select yr=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		yr.selectByValue("1988");
		
		 driver.findElement(By.xpath("//input[@value='1']")).click();
		 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@value='-1']")).click();
		 
		 Thread.sleep(5000);
	
		List<WebElement> radios=driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
		System.out.println(radios.size());
		
		for(int i=0;i<radios.size();i++)
		{
			if(radios.get(i).getText().equalsIgnoreCase("Male"))
			{
				radios.get(i).click();
			}
		}
	}

}
