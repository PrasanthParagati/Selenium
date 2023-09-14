package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
		 
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']//tbody//tr"));
		 int rowsize = rows.size();
		 System.out.println(rowsize);
		 
		  for(int i=1;i<rowsize;i++) {
			 
			 List<WebElement> cells = rows.get(i).findElements(By.xpath(".//td"));
			 
		     for(WebElement cell:cells) {
		    	  
		    String	countries =cell.getText();
		    System.out.println(countries);
		    
		    
				   if(countries.equals("Pyongyang")) {
				    	
				     WebElement checkbox = rows.get(i).findElement(By.xpath(".//input[@type='checkbox']"));
				    	checkbox.click();
				    	break;
				    }
			 }
			 
		 
	
		 }
		 
		 
    }

}
