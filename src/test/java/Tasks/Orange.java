package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("//span[text()='Admin']")).click();
		 driver.findElement(By.xpath("//span[text()='Organization ']")).click();
		 driver.findElement(By.xpath("//a[text()='Locations']")).click();
		 driver.findElement(By.xpath("//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//input[1]")).sendKeys("Prasanth");
	     driver.findElement(By.xpath("//input[@xpath='1']")).sendKeys("Hyd");
//	   WebElement  element = driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
//	   Select sl = new Select(element);
//	   sl.deselectByValue("India");
	
	
	}

}
