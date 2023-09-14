package actionclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement trgt = driver.findElement(By.id("droppable"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src, trgt).perform();
	}

}
