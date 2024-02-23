package dropdownPracice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ScreenShot {

	WebDriver  driver;
	@Test
	public void captureScreenShot()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\sande\\eclipse-workspace\\SeleniumPractice\\screenshot\\nopeCommerce.png");
		try {
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
