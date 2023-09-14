package testng;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PoojaDataProcess {
	
	WebDriver driver;

	@Test(dataProvider = "logincredentials",dataProviderClass = PoojaDataSource.class)
	
	public void login(String username,String password) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("emailid")).sendKeys(username);
		driver.findElement(By.name("pword")).sendKeys(password);
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		String url = driver.getCurrentUrl();
		assertEquals("http://poojastore.marolix.com/", url);
	}
}
