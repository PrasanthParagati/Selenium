package Tasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.abhibus.com/");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 // Select the Source location from auto suggestions
		 driver.findElement(By.id("source")).sendKeys("Gun");
		 List<WebElement> fromlist = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		 
		 for(WebElement from:fromlist) {
				System.out.println(from.getText());
				
				if(from.getText().equals("Guntur ByPass")) {
					from.click();
					break;
				}
	}
		 
		 // Select the Destination from auto suggestions 
		 driver.findElement(By.id("destination")).sendKeys("Hyd");
		  List<WebElement> destlist = driver.findElements(By.xpath("//ul[@id='ui-id-2']//li"));
		 
		  for(WebElement dest:destlist) {
				System.out.println(dest.getText());
				
				if(dest.getText().equals("Hyderabad")) {
					dest.click();
					break;
				}

}
		  // Select the date from calendar
		  driver.findElement(By.id("datepicker1")).click();
		  WebElement element = driver.findElement(By.xpath("//td[@data-handler='selectDay']//a"));
		  element.click();
		  
		  // Search Button
		  driver.findElement(By.xpath("//a[@onclick='javascript:validateSearch();']")).click();
		
		  
}
}
