package SeleniumWithJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\firef\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com/");//---- launch the browser
		driver.manage().window().maximize();
		System.out.println("Page Title:"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getClass());
	}

}
