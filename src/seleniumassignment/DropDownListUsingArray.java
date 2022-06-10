package seleniumassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListUsingArray {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/index.php");
	
	//click Flights
	driver.findElement(By.linkText("Flights")).click();
	
	WebElement DropDownPassenger = driver.findElement(By.xpath("//tbody/tr[3]/td[2]"
			+ "/b/select[@name='passCount']"));
	
	//passengers
	Select select1 = new Select(DropDownPassenger);
	List<WebElement>alloptionsdropdown=  select1 .getOptions();
	for(WebElement Passengerlist : alloptionsdropdown) {
	System.out.println(Passengerlist.getText());	
	}
	System.out.println("--------------------------");
	//Departing from
	WebElement Departing = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/select[@name='fromPort']"));
			
	Select select2 = new Select(Departing );
	List<WebElement>alldropdown = select2.getOptions();
	for(WebElement dropdownlist : alldropdown) {
	System.out.println(dropdownlist.getText());	
	}
	System.out.println("--------------------------");
	
	//URL HomePage
	String CurrentPageURL = driver.getCurrentUrl();
	System.out.println("Print Current Page URL: "+ CurrentPageURL);
	String ExpectedPageURL = "https://demo.guru99.com/test/newtours/reservation.php";
	System.out.println("Print Current Page URL: "+ CurrentPageURL.equals(ExpectedPageURL));
	
	WebElement MurcuryTours  = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/"
			+ "td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img"));
	MurcuryTours.click();
	
  // driver.close();
	
	}

}