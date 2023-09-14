package ExplicitWaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.event.DocumentEvent.ElementChange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeTextExplic {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//WebDriverWait wait = new WebDriverWait(driver,15);
		
		driver.findElement(By.id("populate-text")).click();
		WebElement element = driver.findElement(By.id("h2"));
		//wait.until(ExpectedConditions.visibilityOf(element));
		WebElement newelement = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
		
		System.out.println(newelement.getText());
	}

}
