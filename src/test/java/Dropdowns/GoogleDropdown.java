package Dropdowns;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	List<WebElement> list=driver.findElements(By.xpath("//div[@class='wM6W7d']//b"));
	
	System.out.println(list.size());
	
	for(WebElement lis:list) {
		 
		System.out.println(lis.getText());
		
		if(lis.getText().equals("testing")) {
			lis.click();
			break;
		}
	}
	}

}
