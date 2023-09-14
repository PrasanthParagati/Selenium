package Dropdowns;

// Ststic Dropdowns using Select class

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		
	

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drop = driver.findElement(By.id("country"));
		
		Select s = new Select(drop);
		
		//s.selectByVisibleText("India");
		//s.selectByIndex(1);
		s.selectByValue("china");

	
	}

}
