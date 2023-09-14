package testng;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProcess {
	
	WebDriver driver;
	
	@Test(dataProvider = "logincredentials",dataProviderClass = DataSource.class)
	
	public void login(String username,String password) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String url = driver.getCurrentUrl();
		assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", url);
		
	}
	
	

}
