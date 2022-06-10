package assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
					
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().deleteAllCookies();			
		
		//Parent Window: 
		String ParentWindow = driver.getWindowHandle();	 //
		System.out.println("Parent Window Is: "+ParentWindow);	//
		
		//Click New Window: 
		WebElement ClickNewWindow = driver.findElement(By.id("newTabBtn"))	;
		ClickNewWindow .click()	;
		
		//Open Another Child Window:
		String ChildWindow1 = driver.getWindowHandle();//
		System.out.println( "Child Window Is: "+ChildWindow1 );//
		
		//Verification point:	
		System.out.println("Both Windows Are Same: "+ParentWindow .equals(ChildWindow1));//
		
		//Handling Child Window:
		Set<String> Handles = driver.getWindowHandles();
		System.out.println("Number Of Windows: "+ Handles .size());
		
		//Using Iterator Method:
		Iterator<String> it = Handles.iterator();
		String ParentWindowHandle = it.next(); 
		String ChildWindowHandle = it.next(); 
		Thread.sleep(3000);
		
		//Switch window Parent window to child window and then close 
		driver.switchTo().window(ChildWindowHandle);
		
//		driver.switchTo().window(ChildWindowHandle); //it worked
//		Actions action = new Actions(driver);
//		WebElement ClickBtn = driver.findElement(By.xpath("//button[@id='confirmBox']"));
//		action .moveToElement(ClickBtn).click().build().perform();
		
		//Clicking Home Btn:
		driver.findElement(By.className("hub-home")).click();
		Thread.sleep(3000);
		driver.close();//
		
		driver.switchTo().window(ParentWindowHandle);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Practice");
		Thread.sleep(3000);
		driver.close();//
		
		//driver.quit method:
//		Set<String> WindowHandles = driver.getWindowHandles();
//		Iterator<String> ite = WindowHandles .iterator();
//		while(ite.hasNext()) {
//		driver.switchTo().window(ite .next());
//		System.out.println("Page Title Of All Windows: " +driver.getTitle());
//		driver.close();
//		}

	}

}
