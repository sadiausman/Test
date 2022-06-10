package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHandlingCalendar2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/calendar/");
		Thread.sleep(2000);

	   WebElement janMonth = driver.findElement(By.xpath("//table[@id='mct1']/tbody/tr[2]/td[1]/table/tbody"));
	   String firstmonth = janMonth .findElement(By.xpath("//tr[5]/td[5]")).getText();
	   System.out.println(firstmonth); //jan#20
	   //VerificationPoint://20
	   String expectedtwentythjan = "20";
	   String actualtwentythjan = janMonth.findElement(By.xpath("//tr[5]/td[5]")).getText();
	   if(actualtwentythjan.equals(expectedtwentythjan)) {
	   System.out.println("Right date:");   
	   }else {
	   System.out.println("Wrong date:");    
	   }
	   String DateToBeSelected = "20";
	   for(int b=2; b<=7; b++ ) {
	   for(int c=1; c<=7; c++) {
	   String Row = Integer.toString(b) ;
	   String Column = Integer.toString(c) ;
	   String actualdate = janMonth.findElement(By.xpath("//tr["+ Row +"]/td["+ Column+"]")).getText();
	   if(actualdate.equals(DateToBeSelected)) {
		System.out.println(actualdate); 
	   }}}
	   

	   WebElement febMonth = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[2]/td[3]/table/tbody"));
	   String TwentyEight = febMonth .findElement(By.xpath("//tr[2]/td[3]/table/tbody/tr[6]/td[2]")).getText();
	   System.out.println(TwentyEight); //feb#28
	   //VerificationPoint://28
	   String expectedtwentyeightfeb = "28";
	   String actualtwentyeightfeb  =  febMonth .findElement(By.xpath("//tr[2]/td[3]/table/tbody/tr[6]/td[2]")).getText();
	   if( actualtwentyeightfeb.equals(expectedtwentyeightfeb)) {
	   System.out.println("Right date:");   
	   }else {
	   System.out.println("Wrong date:");    
	   }
	   String SelectedDate = "28";
	   for(int d=2; d<=7; d++ ) {
	   for(int e=1; e<=7; e++) {
	   String Row = Integer.toString(d) ;
	   String Column = Integer.toString(e) ;
	   String Actualdate1 = febMonth.findElement(By.xpath("//tr[2]/td[3]/table/tbody/tr["+ Row +"]/td["+ Column+"]")).getText();
	   if(Actualdate1.equals(SelectedDate)) {
		System.out.println(Actualdate1);
	   }}}
	   
	     WebElement MarchMonth = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[2]/td[5]/table/tbody"));
	   String Twelve =  MarchMonth.findElement(By.xpath("//tr[2]/td[5]/table/tbody/tr[3]/td[7]")).getText();
	   System.out.println(Twelve); //March#12
	   //VerificationPoint://12
	   String expectedtwelvemarch = "12";
	   String actualtwelvemarch =MarchMonth.findElement(By.xpath("//tr[2]/td[5]/table/tbody/tr[3]/td[7]")).getText() ;
	   if(actualtwelvemarch.equals(expectedtwelvemarch) ) {
	   System.out.println("Right date:");   
	   }else {
	   System.out.println("Wrong date:");    
	   }
	   String SelectDate = "12";
	   for(int f=2; f<=7; f++ ) {
	   for(int g=1; g<=7; g++) {
	   String Row = Integer.toString(f) ;
	   String Column = Integer.toString(g) ;
	   String Actualdate2 = MarchMonth.findElement(By.xpath("//tr[2]/td[5]/table/tbody/tr["+ Row +"]/td["+ Column+"]")).getText();
	   if(Actualdate2.equals( SelectDate)) {
		 System.out.println(Actualdate2);
	   }}}
	   
	   WebElement AprilMonth = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[6]/td[1]/table/tbody"));
	   String Seventeen =  AprilMonth.findElement(By.xpath("//tr[6]/td[1]/table/tbody/tr[5]/td[1]")).getText();
	   System.out.println(Seventeen ); //April#17
	   //VerificationPoint://17
	   String expectedSeventeenapril = "17";
	   String actualSeventeenapril =  AprilMonth.findElement(By.xpath("//tr[6]/td[1]/table/tbody/tr[5]/td[1]")).getText();
	   if(actualSeventeenapril.equals(expectedSeventeenapril) ) {
	   System.out.println("Right date:");   
	   }else {
	   System.out.println("Wrong date:");    
	   }
	   String SelectDate17 = "17";
	   for(int j=2; j<=7; j++ ) {
	   for(int k=1; k<=7; k++) {
	   String Row = Integer.toString(j) ;
	   String Column = Integer.toString(k);
	   String Actualdate3 = AprilMonth.findElement(By.xpath("//tr["+ Row +"]/td["+ Column+"]")).getText();
	   if(Actualdate3.equals(SelectDate17)) {
	   System.out.println(Actualdate3); 
	    }}}
	   
	   WebElement MayMonth = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[6]/td[3]/table/tbody"));
	   String Fourteenth =  MayMonth.findElement(By.xpath("//tr[6]/td[3]/table/tbody/tr[3]/td[7]")).getText();
	   System.out.println( Fourteenth); //May#14
	   //VerificationPoint://14
	   String expectedSeventeenmay = "14";
	   String actualSeventeenmay =  MayMonth.findElement(By.xpath("//tr[6]/td[3]/table/tbody/tr[3]/td[7]")).getText();
	   if( actualSeventeenmay.equals( expectedSeventeenmay) ) {
	   System.out.println("Right date:");   
	   }else {
	   System.out.println("Wrong date:");    
	   }
	   String SelectDate14 = "14";
	   for(int h=3; h<=7; h++ ) {
	   for(int i=4; i<=7; i++) {
	   String Row = Integer.toString(h) ;
	   String Column = Integer.toString(i);
	   String Actualdate3 =  MayMonth.findElement(By.xpath("//tr["+ Row +"]/td["+ Column+"]")).getText();
	   if(Actualdate3.equals(SelectDate14 )) {
	   System.out.println(Actualdate3); 
	   }}}
	   
	   WebElement JuneMonth = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[6]/td[5]/table/tbody"));
	   String second =  JuneMonth.findElement(By.xpath("//tr[6]/td[5]/table/tbody/tr[2]/td[5]")).getText();
	   System.out.println(second); //June#2
	   //VerificationPoint://02
	   String expectedtwojune = "2";
	   String actualtwojune  =  JuneMonth .findElement(By.xpath("//tr[6]/td[5]/table/tbody/tr[2]/td[5]")).getText();
	   if( actualtwojune .equals( expectedtwojune ) ) {
	   System.out.println("Right date:");   
	   }else {
	   System.out.println("Wrong date:");    
	   }
	   String SelectDate2 = "02";
	   for(int l=2; l<=7; l++ ) {
	   for(int m=1; m<=7; m++) {
	   String Row = Integer.toString(l) ;
	   String Column = Integer.toString(m);
	   String Actualdate4 =   JuneMonth.findElement(By.xpath("//tr["+ Row +"]/td["+ Column+"]")).getText();
	   if(Actualdate4.equals(SelectDate2 )) {
	   System.out.println(Actualdate4); 
	   }}}
	   
	   WebElement julyMonth = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[10]/td[1]/table/tbody"));
	   String tenth = julyMonth.findElement(By.xpath("//tr[10]/td[1]/table/tbody/tr[4]/td[1]")).getText();
	   System.out.println( tenth ); //july#10
	   //VerificationPoint://10
	   String expectedtenthjuly = "10";
	   String actualtenthjuly  = julyMonth.findElement(By.xpath("//tr[10]/td[1]/table/tbody/tr[4]/td[1]")).getText();
	   if( actualtenthjuly .equals( expectedtenthjuly) ) {
	   System.out.println("Right date:");   
	   }else {
	   System.out.println("Wrong date:");    
	   }
	   WebElement AugustMonth = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[10]/td[3]/table/tbody"));
	   String Twentyfive =   AugustMonth.findElement(By.xpath("//tr[10]/td[3]/table/tbody/tr[5]/td[5]")).getText();
	   System.out.println( Twentyfive); //August#25
	   
	   WebElement SeptemberMonth = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[10]/td[5]/table/tbody"));
	   String Twelveth =  SeptemberMonth .findElement(By.xpath("//tr[10]/td[5]/table/tbody/tr[4]/td[2]")).getText();
	   System.out.println(Twelveth); //September#12
	   //VerificationPoint://12
	   String expectedeltwelthSep = "12";
	   String actualtwelthSep  = SeptemberMonth.findElement(By.xpath("//tr[10]/td[5]/table/tbody/tr[4]/td[2]")).getText();
	   if(actualtwelthSep.equals(expectedeltwelthSep)) {
	   System.out.println("Right date:");   
	   }else {
	   System.out.println("Wrong date:");    
	   }
	   
	   WebElement OctoberMonth = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[10]/td[1]/table/tbody"));
	   String Twenty =  OctoberMonth.findElement(By.xpath("//tr[10]/td[1]/table/tbody/tr[4]/td[1]")).getText();
	   System.out.println(Twenty ); //October#20
	   
	   WebElement NovemberMonth = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[10]/td[3]/table/tbody"));
	   String Nine =   NovemberMonth.findElement(By.xpath("//tr[10]/td[3]/table/tbody/tr[5]/td[5]")).getText();
	   System.out.println(  Nine); //November#9
	   
	   WebElement DecemberMonth = driver.findElement(By.xpath("//table[@id='mct1'][@class='ct1 cl1 cp4 cd2 mct']/tbody/tr[10]/td[5]/table/tbody"));
	   String five=  DecemberMonth .findElement(By.xpath("//tr[10]/td[5]/table/tbody/tr[3]/td[2]")).getText();
	   System.out.println(five ); // December#5
	   //VerificationPoint://05
	   String expectedfifthdec = "5";
	   String actualfifthdec = DecemberMonth .findElement(By.xpath("//tr[10]/td[5]/table/tbody/tr[3]/td[2]")).getText();
	   if( actualfifthdec .equals( expectedfifthdec) ) {
	   System.out.println("Right date:");   
	   }else {
	   System.out.println("Wrong date:");    
	   }
	   
		driver.close();

	}

}
