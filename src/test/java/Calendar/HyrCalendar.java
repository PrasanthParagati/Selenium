package Calendar;

import java.awt.Window;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyrCalendar {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(3000);
		 
		 String Date = "9";
		 String Month = "April";
		 String Year = "2018";
		 
		 driver.findElement(By.id("first_date_picker")).click();
		 
		 while (true) {
			 
			 String MonYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			 System.out.println(MonYear);
		 
		     String[] arry = MonYear.split(" ");
		     
		     String mnths = arry[0];
		     String yrs = arry[1];
		     
		     if(mnths.equalsIgnoreCase(Month) && yrs.equals(Year)) 
		    	 break;
		     else 
		    	 driver.findElement(By.xpath("//a[@title='Prev']")).click();
		     
		     
		     }
		 
		 List<WebElement> date = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		 for(WebElement dates:date) {
			 dates.getText().equals(date);
			 dates.click();
			 break;
		 }
		 
		 
		 
	}

}
