package DisabledElements;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.abhibus.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("");
	}

}
