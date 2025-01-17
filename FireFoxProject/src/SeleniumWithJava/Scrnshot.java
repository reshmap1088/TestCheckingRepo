package SeleniumWithJava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrnshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\firef\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		//driver.close();
		
		java.io.File Scrfile=(java.io.File) (((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
		FileUtils.copyFile(Scrfile,new File("C:\\Users\\Lenovo\\AppData\\Local\\Temp\\screensh.png"));
		}

}
