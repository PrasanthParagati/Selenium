package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 

		 List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']//tbody//tr"));
		 int rowsize = rows.size();
		 System.out.println(rowsize);
		 
		// for(int i=1;i<rows.size();i++) {
			 
			 
			 
			 //for(int j=0;)
		// }
			

	
		 
		 
	}

}
