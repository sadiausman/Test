package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentMouseAndKeyBoard {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);

		Actions action = new Actions(driver);
		
		//TextBox:
		WebElement SearchApple = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		action.moveToElement(SearchApple).click().sendKeys("Apple").build().perform();
		Thread.sleep(2000);
		
		//Search Button Click
		WebElement SearchButton = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		action.moveToElement(SearchButton).click().perform();
	   
		//page Url
		String ExpectedApplePageURL = "https://testautomationpractice.blogspot.com/";
		String ActualApplePageURL = driver.getCurrentUrl();
		if(ExpectedApplePageURL .equals(ActualApplePageURL)) {
		System.out.println("Print Right Page URl: "+"True");	
		}else {
		System.out.println("Print Wrong Page URl: "+"False");		
		}
		Thread.sleep(3000);
		
		//Search Field
		WebElement Field1 = driver.findElement(By.xpath("//input[@id='field1']"));		
		Field1 .clear();
		Field1 .sendKeys("FootBallField");
		Thread.sleep(3000);
		
		WebElement CopyText = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
	    action.doubleClick(CopyText) .build().perform();
	    Thread.sleep(3000);
		
		//List Of Iframe:
		List<WebElement> iframes = driver.findElements(By.xpath("//div[@id='sidebar-right-1']"));
		System.out.println("Number Of Iframes: "+ iframes.size());
		
	    //driver.switchTo().frame(0);

		WebElement DragableObject = driver.findElement(By.id("draggable"));
		System.out.println(DragableObject.isDisplayed());
		
		WebElement DropLocation = driver.findElement(By.id("droppable"));
		//driver.switchTo().frame(0);
		//Drag & Drop:
//		Actions action = new Actions(driver);
//		action.dragAndDrop(DragableObject, DropLocation).build().perform();
//		Thread.sleep(3000);
		
		//Another way Drag & Drop
//		action.moveToElement(DragableObject).clickAndHold().release().build().perform();
//		Thread.sleep(3000);
		
		//Another way Drag & Drop
		action.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		Thread.sleep(3000);
		
		//capture pic frame and move to trash
		//driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='ui-widget ui-helper-clearfix']")));
		
		WebElement pic1 = driver.findElement(By.xpath("//li[1]"));

		WebElement pic2 = driver.findElement(By.xpath("//li[2]"));

		WebElement TrashBox = driver.findElement(By.xpath("//div[@id='trash']"));
		Thread.sleep(3000);
		//Move both pics into trash
		action.dragAndDrop(pic1, TrashBox).perform();
		Thread.sleep(3000);
		action.dragAndDrop(pic2, TrashBox).perform();

//		WebElement ARROW_RIGHT = driver.findElement(By.xpath("//div[@id='slider']"));
		//Page-up
		for(int i=1; i<=3; i++) {
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		}
	    // Page-Down
		for(int a=1; a<=5; a++) {
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		}
	    
	    
		driver.close();	

	}

}
