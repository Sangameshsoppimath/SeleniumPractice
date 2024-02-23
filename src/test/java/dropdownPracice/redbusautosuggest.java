package dropdownPracice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbusautosuggest 
{
	WebDriver driver;
	@Test
	public void demo()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("ben");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul//li//text"));
		
		for(WebElement from:list)
		{
			String fr = from.getText();
					if(fr.equals("Bengaluru"))
					{
						from.click();
					}
		}
		
		//list.stream().filter(s->s.getText().equals("Bengaluru")).findFirst().ifPresent(WebElement::click);
		
		
		
		
		
	}

}
