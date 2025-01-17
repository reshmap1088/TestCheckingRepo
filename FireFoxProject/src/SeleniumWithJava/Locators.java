package SeleniumWithJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Downloads\\firef\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.redbus.in/?gad_source=1&gclid=EAIaIQobChMIpc6o08fjigMV38VMAh0Q4SCSEAAYASAAEgLxfPD_BwE");
		
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
	List<WebElement> suggestion=driver.findElements(By.xpath("//div[@class='sc-gzVnrw isMCq']"));
	
	System.out.println(suggestion.size());
	for(int i=0;i<suggestion.size();i++)
	{
		if(suggestion.get(i).getText().equalsIgnoreCase("Pune"))
		{
			suggestion.get(i).click();
			break;
		}
		
	}
		
	//	driver.findElement(By.id("src")).clear();
		//driver.findElement(By.id("dest")).sendKeys("Satara");
	}

}
