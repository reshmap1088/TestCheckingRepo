package TestPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\c114\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.Google.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How Stuff Works?");
		
		//Handling autosuggestions
        List<WebElement> autosuggestions=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        
        for(int i=0;i<autosuggestions.size();i++)
        {
        	String suggest="How Stuff Works for kids";
        	if(autosuggestions.get(i).getText().equalsIgnoreCase(suggest))
        	{
        		autosuggestions.get(i).click();
        		break;
        	}
        	
        }
	}

}
