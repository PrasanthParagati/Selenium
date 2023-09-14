package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dp2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("APjFqb")).sendKeys("java");
	List<WebElement> list=driver.findElements(By.xpath("//div[@class='lnnVSe']//b"));
	
	System.out.println(list.size());
	
	for(WebElement lis:list) {
		 
		System.out.println(lis.getText());
		
		if(lis.getText().equals("compiler")) {
			lis.click();
			break;
		}
	}
	}

}
