package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 WebElement table = driver.findElement(By.xpath("//table[@id='countries']"));
		 
		 List<WebElement> rows = table.findElements(By.xpath(".//tr"));
		 
		 
		 for(WebElement row : rows) {
			 
			 List<WebElement> cells = row.findElements(By.xpath(".//td"));
			 
			 for(WebElement cell : cells) {
				 
				 System.out.println(cell.getText());
				 
				 String value = cell.getText();
				 
				 
				 if(value.equals("India")) {
					 
					 WebElement checkbox = row.findElement(By.xpath(".//input[@type='checkbox']"));
					 checkbox.click();
					 break;
				 }
			 }
		 }
	}

}
