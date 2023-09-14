package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wt1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
		 
		 WebElement table = driver.findElement(By.name("BookTable"));
		 
		  WebElement row = table.findElement(By.xpath("//table[@name='BookTable']//tr"));
		 
		 List<WebElement> cells = row.findElements(By.xpath("//table[@name='BookTable']//tr[6]//td"));
		 System.out.println(cells.get(6));
		 
		 for (WebElement cell : cells) {
	            System.out.print(cell.getText() + "\t");
	            
	        }
		  
		  
		 

	}
	
}
