package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotElement {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	WebElement	element=driver.findElement(By.xpath("//img[@src='https://demo.guru99.com/images/selenium-logo.jpg']"));
	
	// Take screenshot of the element
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src = element.getScreenshotAs(OutputType.FILE);
	
	// Save screenshot to a specific location
	File trgt = new File("./target/g.png");
	FileUtils.copyDirectory(src, trgt);
		
	}

}
