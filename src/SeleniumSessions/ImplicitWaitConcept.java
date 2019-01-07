package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
			
		driver.get("https://spicejet.com/"); //enter url
		
		

		driver.manage().window().maximize();  // maximize window
		driver.manage().deleteAllCookies();  // delete all cookies
		
		// Dynamic wait
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // once page fully loaded wait for 30 seconds it will wait for go button 30 seconds
		
	
	}

}
