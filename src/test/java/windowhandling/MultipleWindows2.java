package windowhandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleWindows2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    String parentid = driver.getWindowHandle();
	    driver.findElement(By.id("newWindowsBtn")).click();
	    Set<String> ids = driver.getWindowHandles();
	    
	    for(String windowids : ids ) {
	    	System.out.println(windowids);
	    	
	    	if(!parentid.equals(windowids)) {
	    		driver.switchTo().window(windowids);
	    		driver.manage().window().maximize();
	    		WebElement element=driver.findElement(By.id("selectnav1"));
	    		Select s = new Select(element);
	    		s.selectByIndex(0);
	    	}
	    }
	}

}
