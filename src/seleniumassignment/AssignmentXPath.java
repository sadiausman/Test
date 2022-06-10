package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentXPath {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver", "c:\\work\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.walmart.com");
    Thread.sleep(2000);
	
   // WebElement searchbutton = driver.findElement(By.name('q');
   // searchbutton.click();
	}

}
