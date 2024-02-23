package dropdownPracice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drpdown 
{
	@Test
	public void selectdrp() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//p-calendar[@formcontrolname='journeyDate']")).click();
		
		while(true)
		{
			String MonthList = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
			String yearList = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
			
			if(MonthList.equals("March")&&yearList.equals("2024"))
			{
				break;
				
			}
			else {
				driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			}
		}
		
		List<WebElement> dayslist = driver.findElements(By.xpath("//table//tbody//tr//td"));
		
		for(WebElement days:dayslist)
		{
			String day = days.getText();
			if(day.equals("23"))
			{
				days.click();
			}
			
		}
		
	}
	

}
