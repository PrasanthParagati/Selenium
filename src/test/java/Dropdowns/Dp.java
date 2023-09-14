package Dropdowns;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dp {

	public static void main(String[] args) {
		
	//	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.findElement(By.id("APjFqb")).sendKeys("fortuner");
		 List<WebElement> dropdown = driver.findElements(By.xpath("//div[@class='wM6W7d']//b"));
		 System.out.println(dropdown.size());
		 
		 for(WebElement options:dropdown) {
			 System.out.println(options.getText());
			 
			 if(options.getText().equals("price vijayawada")) {
				 options.click();
				 break;
			 }
		 }

	}

}
