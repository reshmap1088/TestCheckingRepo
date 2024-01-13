package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\c114\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
		//1st way
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
	
	    //2nd way
		Thread.sleep(2000);
		List<WebElement> radio=driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total Radio Buttons:"+radio.size());
		
		System.out.println(radio.get(0).isSelected());
		System.out.println(radio.get(1).isDisplayed());
		System.out.println(radio.get(2).isEnabled());

		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='2']")).click();
		radio.get(2).click();
		
		//3rd way
		
		List<WebElement> r1=driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Buttons:"+r1.size());
		String sex="Female";
		
		for(int i=0;i<r1.size();i++)
		{
			if(r1.get(i).getText().equalsIgnoreCase(sex))
			{
				r1.get(i).click();
				System.out.println(sex+" clicked");
				break;
			}
		}
	}

}
