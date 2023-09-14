package frams;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHyr {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
		 
		 WebElement frm = driver.findElement(By.xpath("//iframe[@id='frm1']"));
		 driver.switchTo().frame(frm);
		 
		 WebElement dropdown = driver.findElement(By.id("selectnav1"));
		 
		 Select s = new Select(dropdown);
		 s.selectByIndex(3);
		 
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("name")).sendKeys("Selenium Automation");
		 
		 
	}

}
