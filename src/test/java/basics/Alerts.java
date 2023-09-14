package basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// alert
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
	    Alert	alt=driver.switchTo().alert();
	    Thread.sleep(3000);
	    alt.accept();
	    
	    //Confirm Box
	    driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
	    Thread.sleep(3000);
	    alt.dismiss();
	    
	    //Prompt will not work in chrome
	    driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
	    Thread.sleep(3000);
	    alt.sendKeys("Hello world");
	    
	    
	}

}
