package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wt2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
		int rowsize = rows.size();
		System.out.println(rowsize);

		for (WebElement cell : rows) {

			String cells = cell.getText();

			if (cells.contains("Amod")) {

				System.out.println(cells);

			}
		}

	}

}
