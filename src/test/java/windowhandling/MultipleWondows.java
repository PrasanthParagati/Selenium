package windowhandling;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWondows {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    String parentwindow= driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> ids = driver.getWindowHandles();
		
		for(String windowids:ids) {
			System.out.println(windowids);
			
			if(!parentwindow.equals(windowids)) {
				driver.switchTo().window(windowids);
				driver.manage().window().maximize();
				Thread.sleep(4000);
				driver.findElement(By.id("firstName")).sendKeys("Prasanth");
			}
		}
		
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Virat kohli");
	}

}
