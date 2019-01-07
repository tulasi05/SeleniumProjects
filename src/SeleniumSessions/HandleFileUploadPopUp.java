package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		//1. alerts -- Javascript pop up
		//2. File To Upload pop up  -- Browser Button
		//3. Browser Window Pop Up - Advertisement pop up (windowHandeler API - getWindowHandels())
		
		
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
	//	driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //enter url
		driver.get("http://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\tulas\\Desktop\\iframe_history.html");
		
	//	Alert alert = driver.switchTo().alert();
	//	System.out.println(alert.getText());
		//String text = alert.getText();
		
		//*[@id="om-lightbox-postal-header"]
		
	//	if(text.equals("Please enter a valid user name")) {
		//	System.out.println("Correct Alert");
	//	}
	//	else
		//	System.out.println("In-correct Alert");
		
		
	//	alert.accept();  //Click on ok button
	//	alert.dismiss();  // Click to Cancel -* currently not in the alert message
		
		//*[@id="om-lightbox-postal-optin-wrap"]/a
		
		
		//*[@id="om-lightbox-postal-header"]
		
		
		
		
	}

}
