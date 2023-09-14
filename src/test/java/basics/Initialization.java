package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Initialization {

	public static void main(String[] args) throws Throwable {
		
	RemoteWebDriver driver = new ChromeDriver();
	
	driver.manage().window();
	
	driver.get("https://www.w3schools.com/java/");
	
//	driver.get("https://mvnrepository.com/");
//	
//	System.out.println(driver.getCurrentUrl()); // To print current URL
//	
//	System.out.println(driver.getTitle()); // To print the title of current website ex : Maven Repository: Search/Browse/Explore
//	
//	String id = driver.getWindowHandle(); // To print ID
//	System.out.println(id);
	

//	driver.findElement(By.xpath("//a[text() ='Try it Yourself »']")).click();
//	Thread.sleep(3000);
//	
//	driver.close();  // To close current opened window
	
//	driver.quit();  // Irrespective of windows to quit the browser
	
	
	
	
	

	}

}
