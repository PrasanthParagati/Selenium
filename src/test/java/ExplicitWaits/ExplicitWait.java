package ExplicitWaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		
		//Alert
		
		driver.findElement(By.id("alert")).click();
		//wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		// Change text to Selenium Webdriver
		
		driver.findElement(By.id("populate-text")).click();
		WebElement element = driver.findElement(By.id("h2"));
		//wait.until(ExpectedConditions.visibilityOf(element));
		WebElement newelement = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
		System.out.println(newelement.getText());
		
		//Display button after 10 seconds
		
		driver.findElement(By.id("display-other-button")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
		WebElement element1 = driver.findElement(By.id("hidden"));
		System.out.println(element1.getText());
		
		//Enable button after 10 seconds
		
		driver.findElement(By.id("enable-button")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("disable")));
		WebElement element2 = driver.findElement(By.id("disable"));
		System.out.println(element2.getText());
		Thread.sleep(10000);
		
		//Checkbox will checked after 10 seconds
		
		driver.findElement(By.id("checkbox")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ch")));
		WebElement element3 =driver.findElement(By.id("ch"));
		element.click();
		
	}

}
