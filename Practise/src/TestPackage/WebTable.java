package TestPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\c114\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> companies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total companies :"+companies.size());
		
		List<WebElement> price=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	System.out.println("Price :"+price.size());
	
	String s="Radix Industries";
	
	for(int i=0;i<companies.size();i++)
	{
		if(companies.get(i).getText().equalsIgnoreCase(s))
		{
			System.out.println("company :"+companies.get(i).getText()+" price:"+price.get(i).getText());
			companies.get(i).click();
			break;
		}
	}
	}

}
