package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		List<WebElement> checkboxs = driver.findElements(By.cssSelector("input[type^='check']"));
		for(int i=0;i<checkboxs.size();i++) {
			if(i==0 || i==2) {
				checkboxs.get(i).click();
				
			}
		}
		// Take screenshot
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// Save screenshot to a specific location
		File trgt = new File("./target/guru.png");
		FileUtils.copyFile(src, trgt);
	}

}
