package dropdownPracice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepickerprcts 
{
	@Test

	public void selectdrp() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement frames = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frames);
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true)

		{
			
			String months = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String years = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(months.equals("May")&&years.equals("2024"))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}
		
		List<WebElement> dayslisst = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//tbody//tr//td"));
		
		for(WebElement days:dayslisst)
		{
			String day = days.getText();
			if(day.equals("24"))
			{
				days.click();
			}
		}
		
	}
}
