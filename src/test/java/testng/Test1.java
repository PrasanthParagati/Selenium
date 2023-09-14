package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void testdemo() throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 WebElement search = driver.findElement(By.id("APjFqb"));
		 search.clear();
		 search.sendKeys("selenium download");
		 Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		
	}
	
	

}
