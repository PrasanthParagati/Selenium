package Calendar;

import java.awt.Window;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyrCalendar1 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		String Date = "9";
		String Month = "June";
		String Year = "2028";
		
		driver.findElement(By.id("first_date_picker")).click();
		
		while(true) {
			String MonYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			String arry[] = MonYear.split(" ");
			String mnth = arry[0];
			String yr = arry[1];
			
			if(mnth.equalsIgnoreCase(Month) && yr.equals(Year))
				break;
			else
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				
		}
		
		
	}

}
