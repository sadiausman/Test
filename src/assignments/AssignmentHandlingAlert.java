package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentHandlingAlert {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "c:\\work\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
			
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
driver.manage().deleteAllCookies();

//Click Alert:
WebElement ClickAlert = driver.findElement(By.name("alert"));
ClickAlert.click();
Thread.sleep(3000);

//Handle Alert  ->Capture Alert Message:
String AlertMsg1 = driver.switchTo().alert().getText();
System.out.println("First Alert Msg: "+AlertMsg1 );

//Switch Alert Method:
driver.switchTo().alert().accept();
Thread.sleep(3000);

//Click Alert:
WebElement ConfirBox = driver.findElement(By.name("confirmation"));
ConfirBox.click();
Thread.sleep(3000);

//Captue Alert Message
String AlertMsg2 = driver.switchTo().alert().getText();
System.out.println("Second Alert Msg: "+AlertMsg2);

driver.switchTo().alert().accept();
Thread.sleep(3000);

//Click Back To ConfiBox:
driver.findElement(By.name("confirmation")).click();
driver.switchTo().alert().dismiss();

WebElement ClickPromt = driver.findElement(By.xpath("//input[@name='prompt']"));
ClickPromt .click();
Thread.sleep(3000);

//Handle Alert  ->Capture Alert Message:
String AlertMsg3 = driver.switchTo().alert().getText();
System.out.println("Third Alert Msg: "+AlertMsg3);

driver.switchTo().alert().accept();
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@name='prompt']")).click();
driver.switchTo().alert().dismiss();
Thread.sleep(3000);
 
//Using Action Class:
 Actions action = new Actions(driver);

//Handling Double Click:
action.moveToElement( driver.findElement(By.id("double-click"))).doubleClick().build().perform();

String AlertMsg4 = driver.switchTo().alert().getText();
System.out.println("Forth Alert Msg: "+AlertMsg4 );
Thread.sleep(3000);

driver.switchTo().alert().accept();
Thread.sleep(3000);

driver.close();



}}