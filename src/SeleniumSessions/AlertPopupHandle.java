package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //enter url
		
		driver.findElement(By.name("proceed")).click(); //click on go 
		
		Thread.sleep(5000);   // Wait for 5 seconds 5000 = 5k milliseconds
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct Alert");
		}
		else
			System.out.println("In-correct Alert");
		
		
		alert.accept();  //Click on ok button
	//	alert.dismiss();  // Click to Cancel -* currently not in the alert message
		//driver.close();
		//driver.quit();
		
	}

}
