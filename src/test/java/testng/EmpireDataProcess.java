package testng;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EmpireDataProcess {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}

	@Test(dataProvider = "ProductAdd",dataProviderClass = EmpireDataSource.class)
	
	public void login(String MNumber, String ItemTitle, String ItemDescription,String Height,String Width,String Breadth,String ColorName,String ActualPrice,String Qty) throws Throwable {
		
		driver.findElement(By.name("emailid")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.name("pword")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='pe-7s-keypad']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-houzz']")).click();
    	driver.findElement(By.xpath("//a[text()='Add Inventory']")).click();
    	
    	driver.findElement(By.xpath("//input[@placeholder='Enter Model Number']")).sendKeys(MNumber);
    	driver.findElement(By.xpath("//textarea[@name='Title']")).sendKeys(ItemTitle);
    	driver.findElement(By.xpath("//textarea[@name='ItemDescription']")).sendKeys(ItemDescription);
    	driver.findElement(By.xpath("//input[@placeholder='Enter Height']")).sendKeys(Height);
    	driver.findElement(By.xpath("//input[@placeholder='Enter Width']")).sendKeys(Width);
    	driver.findElement(By.xpath("//input[@placeholder='Enter Breadth']")).sendKeys(Breadth);
    	driver.findElement(By.xpath("//input[@placeholder='Enter Color Name']")).sendKeys(ColorName);
    	driver.findElement(By.xpath("//input[@id='actual']")).sendKeys(ActualPrice);
    	
    	WebElement ele =driver.findElement(By.xpath("//*[@id=\"lobicard-custom-control1\"]/div[2]/form/div[1]/div[17]/div/span/span[1]/span"));
    	ele.click();
    	WebElement ele1 = driver.findElement(By.xpath("//li[contains(text(), '1.00')]"));
    	ele1.click();
    	
    	driver.findElement(By.name("Qty")).sendKeys(Qty);
    	
    	Actions ac = new Actions(driver);
    	// upload image
    	WebElement upload =driver.findElement(By.xpath("//input[@name='ProductMainImageUploaded']"));
    	ac.moveToElement(upload).click().perform();
    	
    	Robot rb = new Robot();
		rb.delay(3000);
		
		StringSelection path = new StringSelection("C:\\Users\\u\\eclipse-workspace\\Selenium\\target\\image.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
    	
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    	
    	
    	
    	
    	
    	
	}
    	
    	
    	@AfterTest
    	public void teardown() {
    		//driver.close();
    	}
    	
		
	
	
	}


	

