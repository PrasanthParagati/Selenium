package testng;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	

	@Test(dataProvider = "logincredentials")
	
	public void login(String username,String password) {
		
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.name("emailid")).sendKeys(username);
		driver.findElement(By.name("pword")).sendKeys(password);
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		String url = driver.getCurrentUrl();
		assertEquals("http://poojastore.marolix.com/", url);
	}
	
    @org.testng.annotations.DataProvider(name = "logincredentials")
	public Object[][] testdata() {
    	
    	Object[][] data = new Object[2][2];
    	
    	data[0][0] = "pooja132@gmail.com";
    	data[0][1] = "1234";
    	
    	data[1][0] = "neerajchopra@gmail.com";
    	data[1][1] = "goldmedal";
    	
//    	data[2][0] = "prasanth123";
//    	data[2][1] = "12345";
//    	
//    	data[3][0] = "prasanth123";
//    	data[3][1] = "12345";
    	
    	
    	
    	return data;
		
	}

}
