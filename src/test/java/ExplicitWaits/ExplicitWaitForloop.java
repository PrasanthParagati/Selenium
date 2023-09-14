package ExplicitWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForloop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		
		String[] elementid = {"h2","hidden","disable","ch"};
		String[] buttonid = {"populate-text","display-other-button","enable-button","checkbox"};
		
		for(int i=0;i<elementid.length;i++) {
			driver.findElement(By.id(buttonid[i])).click();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementid[i])));
			WebElement element= driver.findElement(By.id(elementid[i]));
			
			System.out.println(element.getText());
		}

	}

}
