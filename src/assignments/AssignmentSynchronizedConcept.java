package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSynchronizedConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait:
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.delta.com");
		driver.manage().deleteAllCookies();
		
//		//implicit wait: 
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Stationary");
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.RETURN);//it will go
//		//to next page and display the data
	//	
//		driver.findElement(By.linkText("Stationary Paper and Envelopes Set"));
//		Thread.sleep(2000);	
	//	
//		//Explicit Wait:
//		WebDriverWait ExplicitWait = new WebDriverWait(driver,20);
//		WebElement CustomerService = driver.findElement(By.linkText("Customer Service"));
//		ExplicitWait.until(ExpectedConditions.elementToBeClickable(CustomerService))	;
//		CustomerService.click();
		 
		driver.close();

	}

}
