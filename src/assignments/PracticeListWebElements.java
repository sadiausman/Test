package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeListWebElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");	
			
			
			
		List<WebElement>dropdown =  driver.findElements(By.xpath("//select[@class= 'product_sort_container']"));
		for(WebElement D : dropdown) 
		System.out.println(D.getText());	
		
		WebElement d = driver.findElement(By.xpath("//select[@class= 'product_sort_container']"));
		Select	select	= new Select(d);
		List<WebElement> AllOptionsDropDown	 = select.getOptions();
		for(WebElement dropdownlist : AllOptionsDropDown) {
		System.out.println(dropdownlist.getText());	
		}
		driver.close();
	}

}
