package dropdownPracice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling 
{
	WebDriver driver;
	@Test
	public void Demo() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Set<String> WindowIds = driver.getWindowHandles();//To get WindowIds of multiple windows we use windowHandles
		//To get single windowId we use WindowHandle;
		
		Iterator<String> it = WindowIds.iterator();
		
		String ParentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		driver.findElement(By.xpath("//a[@href='/downloads']")).click();
		
		driver.close();
		
		
		
		
		
		
	}

}
