package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Prasanth");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prasanth@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9963714425");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Guntur");
		Thread.sleep(2000);
		
	    WebElement radiobutton=driver.findElement(By.xpath("//label[@for='male']"));
	    
	    radiobutton.click();
	    Thread.sleep(2000);
	    
	   List<WebElement> checkboxes=driver.findElements(By.cssSelector("input[id$='day']"));
	   
//	   for(WebElement chbox:checkboxes) {
//		   chbox.click();
//	   }
	   
	   for(int i=1;i<checkboxes.size()-1;i++) {
		   
		   WebElement day = checkboxes.get(i);
		   day.click();
	   }
	    

	}

}
