package Dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dp1 {

	public static void main(String[] args) throws Throwable {
		
		//WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 WebElement search=driver.findElement(By.id("APjFqb"));
			search.clear();
			search.sendKeys("chandrayan 3");
			Thread.sleep(2000);
			search.sendKeys(Keys.ENTER);
	}

}
