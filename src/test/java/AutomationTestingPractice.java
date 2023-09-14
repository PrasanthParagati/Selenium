import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestingPractice {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("name")).sendKeys("Prasanth");
		driver.findElement(By.id("email")).sendKeys("prasanth@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9963714425");
		driver.findElement(By.id("textarea")).sendKeys("Guntur");
		driver.findElement(By.id("male")).click();
		
		List<WebElement> list= driver.findElements(By.cssSelector("input[id$='day']"));
		for(int i=1;i<list.size()-1;i++) {
			list.get(i).click();
		}
		
		WebElement element=driver.findElement(By.id("country"));
		Select s= new Select(element);
		//s.selectByIndex(4);
		s.selectByValue("india");
		//s.selectByVisibleText("canada");
		
		//Alert
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		Alert alt= driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		
		//ConfirmBox
		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
		Thread.sleep(2000);
		alt.accept();
		
		//Double click
		WebElement dbclick=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions ac = new Actions(driver);
		ac.doubleClick(dbclick).perform();
		
		//Drag and Drop
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement trgt=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(src, trgt).perform();
		
		
		
		
	}

}
