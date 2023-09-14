package windowhandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultieWindows1 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String parentid = driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> ids = driver.getWindowHandles();
		
		for(String windowids : ids) {
			System.out.println(windowids);
			
			if(!parentid.equals(windowids)) {
				driver.switchTo().window(windowids);
				driver.manage().window().maximize();
				Thread.sleep(4000);
				driver.findElement(By.id("alertBox")).click();
				Alert alt = driver.switchTo().alert();
				Thread.sleep(2000);
				alt.accept();
			}
			
		}
	}

}
