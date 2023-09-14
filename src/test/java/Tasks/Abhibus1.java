package Tasks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhibus1 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.abhibus.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 //Select the source location from auto suggestions
		WebElement source=driver.findElement(By.id("source"));
		source.clear();
		source.sendKeys("Gun");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		//Select the Destination from auto suggestions
		WebElement destination = driver.findElement(By.id("destination"));
		destination.clear();
		destination.sendKeys("Hydera");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ENTER);
		
		//Select the date from calendar
		 driver.findElement(By.id("datepicker1")).click();
		  WebElement element = driver.findElement(By.xpath("//td[@data-handler='selectDay']//a[text()='18']"));
		  element.click();
		  
		  // Search Button
		  driver.findElement(By.xpath("//a[@onclick='javascript:validateSearch();']")).click();
		
	}

}
